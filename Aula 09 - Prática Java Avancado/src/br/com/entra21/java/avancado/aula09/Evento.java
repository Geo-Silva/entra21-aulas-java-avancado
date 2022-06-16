package br.com.entra21.java.avancado.aula09;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Scanner;

public class Evento {

	public static LinkedList<String> eventos = new LinkedList<>();
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static void criarEvento() {

		byte mes, dia;
		String descricao;
		
		System.out.println("======================");
		System.out.println("Em qual mês é esse evento?");
		mes = entrada.nextByte();
		
		if(mes > 12 || mes < 1) {
			
			System.out.println("Esse mês é inexistente!");
			criarEvento();

		}
		
		System.out.println("Em qual dia é esse evento?");
		dia = entrada.nextByte();

		if(dia > 31 || dia < 1) {
			
			System.out.println("Esse dia é inválido!");
			criarEvento();
			
		}
		
		switch(mes) {
		
		case 4, 6, 9, 11:
			
			if(dia > 30) {
				
				System.out.println("Esse dia é inválido para o mês selecionado!");
				criarEvento();
				
			}else {
				
				
			}
			
			break;
		
		case 2:
			
			if(dia > 28) {
				
				System.out.println("Esse dia é inválido para o mês selecionado!");
				criarEvento();
				
			}else {
				
				
			}
			
			break;
		
		default:
			
			
			break;
		
		}
		
		System.out.println("Faça uma breve descricção sobre esse evento (use \"-\" para separar as palavras)");
		descricao = entrada.next();
		
		eventos.add("Dia: " + dia + " - Mês: " + mes + " - " + descricao);
		
		System.out.println(eventos);
		System.out.println("Evento criado com sucesso!");
		System.out.println("=========================");
		
	}
	
	
}
