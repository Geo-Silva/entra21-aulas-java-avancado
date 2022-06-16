package br.com.entra21.java.avancado.aula07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.entra21.java.avancado.Aula;

public class Aula07 extends Aula {

	public Aula07(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
		
	}

	@Override //um override aproveita o meu código 
	//é como se ele estivesse sido escrito aqui
	public byte capturarOpcao() {
		
		byte opcao = super.capturarOpcao();
		
		switch (opcao) {
		
		case 1:
			
			aprenderTratarErros();
			
			break;

		case 2:
			
			obterDetalheE();
			
			break;
			
		case 3:
			
			usarCustomExecption();
			
			break;
				
		default:
			
			System.out.println("Opção inválida para aula 07");
			
			break;
		}
		
		return opcao;
		
	}

	private void aprenderTratarErros() {
		
		Scanner input = new Scanner(System.in);
		
		try {
			
			System.out.println("Informe um número não muito alto, por favor");
			byte naoEstouPreparado = input.nextByte();
		
		} catch (InputMismatchException e) {
			
			System.out.println("Número alto demais! Vai de novo");
			aprenderTratarErros();
			
		}
		
		
	}

	private void obterDetalheE() {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Informe um valor pequeno");
			byte estouPreparado = entrada.nextByte();
		
		} catch (InputMismatchException e) {
			
			System.out.println("Você não sabia, mas eu estava preparado para caso você colocasse um valor grande:\n " + e.getMessage());
			System.out.println(e.getCause());
			
			
		}
		
		
		
	}
	
	private void usarCustomExecption() {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			
			System.out.println("Informe sua data de nascimento no formato YYYY-MM-DD");
			LocalDate dataNascimento = LocalDate.parse(entrada.next());
			
			if(dataNascimento.isAfter(LocalDate.now())) {
				
				throw new DataFuturaNaoPermitidaExeception();
				
			}
			
			if(dataNascimento.isEqual(LocalDate.now())) {
				
				throw new DataFuturaNaoPermitidaExeception("Você nasceu hoje?");
				
			}
		
		} catch (DateTimeParseException e) {
			
			System.out.println("Tem algo de errado com essa data...\nMotivo -> " + e.getMessage());
			
		} catch (DataFuturaNaoPermitidaExeception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}
	
}
