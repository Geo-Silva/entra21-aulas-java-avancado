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
		System.out.println("Em qual m�s � esse evento?");
		mes = entrada.nextByte();
		
		if(mes > 12 || mes < 1) {
			
			System.out.println("Esse m�s � inexistente!");
			criarEvento();

		}
		
		System.out.println("Em qual dia � esse evento?");
		dia = entrada.nextByte();

		if(dia > 31 || dia < 1) {
			
			System.out.println("Esse dia � inv�lido!");
			criarEvento();
			
		}
		
		switch(mes) {
		
		case 4, 6, 9, 11:
			
			if(dia > 30) {
				
				System.out.println("Esse dia � inv�lido para o m�s selecionado!");
				criarEvento();
				
			}else {
				
				
			}
			
			break;
		
		case 2:
			
			if(dia > 28) {
				
				System.out.println("Esse dia � inv�lido para o m�s selecionado!");
				criarEvento();
				
			}else {
				
				
			}
			
			break;
		
		default:
			
			
			break;
		
		}
		
		System.out.println("Fa�a uma breve descric��o sobre esse evento (use \"-\" para separar as palavras)");
		descricao = entrada.next();
		
		eventos.add("Dia: " + dia + " - M�s: " + mes + " - " + descricao);
		
		System.out.println(eventos);
		System.out.println("Evento criado com sucesso!");
		System.out.println("=========================");
		
	}
	
	
}
