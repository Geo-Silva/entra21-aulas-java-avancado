package br.com.entra21.java.avancado.aula09;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	static DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	static LocalTime agora = LocalTime.now();
	static LocalDate hoje = LocalDate.now();
	
	private static Scanner entrada = new Scanner(System.in);
	private static byte opcao;
	
	public static void main(String[] args) {
		
		//gerenciar tarefas
		//gerenciar estudos
		//mostrar feriados (ENUM)
		
		Instant começo = Instant.now();
		Login.logar();
		
		
		do {

			fazerMenu();
			
			switch(opcao) {
			
			case 0:
				
				Instant fim = Instant.now();
				Duration duracao = Duration.between(começo, fim);
				System.out.println("Essa sessão durou: " + duracao.toMinutes() + "min" + duracao.toSeconds() + "s");
				System.out.println("Saindo...");
				Login.logar();
				
				break;
				
			case 1:
				
				verDatas();
				
				break;
			
			case 2:
				
				criarUmEvento();
				
				break;
				
			case 3:
				
				verEventos();
				
				break;
				
			default:
				
				System.out.println("Opcão inválida!");
				fazerMenu();
				
				break;
			
				
				
			}
			
		}while(opcao != 0);
		
		

	}

	private static void verEventos() {
		
		System.out.println(Evento.eventos);
		
	}

	private static void criarUmEvento() {
		
		Evento.criarEvento();
		
	}

	public static void fazerMenu() {
		
		System.out.println("=======================");
		System.out.println("Dia atual: " + formatters.format(hoje));
		System.out.println("Hora atual: " + agora);
		System.out.println("=======================");
		System.out.println("Menu de ações");
		System.out.println("O que você deseja fazer?");
		System.out.println("0 - Deslogar");
		System.out.println("1 - Ver datas do mês selecionado e feriados ao longo do ano");
		System.out.println("2 - Criar um evento");
		System.out.println("3 - Ver eventos");
		opcao = entrada.nextByte();
		
	}
	
	@Responsavel(ordemPrioridade = Responsavel.OrdemPrioridade.IMPORTANTE, item = "Terminar de preencher os meses", quemAssume = "Eu, óbvio")
	private static void verDatas() {
		
		Datas.verDatas();
		
	}

}
