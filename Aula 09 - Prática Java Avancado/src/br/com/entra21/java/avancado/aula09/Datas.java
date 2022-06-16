package br.com.entra21.java.avancado.aula09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Datas {

	private static Scanner entrada = new Scanner(System.in);
	
	public static void verDatas() {
		
		byte opcao;
		
		System.out.println("============================");
		System.out.println("Qual mês você deseja ver as datas? Selecione o número correspondente do mês");
		System.out.println("Selecione 0 para ver os feriados ao longo do ano");
		System.out.println("Selecione -1 para voltar.");
		System.out.println("=============================");
		opcao = entrada.nextByte();
		
		switch(opcao) {
		
		case -1:
			
			
			
			break;
			
		case 0:
			
			verFeriados();
			
			break;
			
		case 1:
			
			verJaneiro();
			
			break;
		
		case 2:
			
			
			
			break;
			
		case 3:
			
			
			
			break;
			
		case 4:
			
			
			
			break;
		
		case 5:
			
			
			
			break;
			
		case 6:
			
			
			
			break;
			
		case 7:
			
			
			
			break;
			
		case 8:
			
			
			
			break;
			
		case 9:
			
			
			
			break;
			
		case 10:
			
			
			
			break;
			
		case 11:
			
			
			
			break;
			
		case 12:
			
			
			
			break;
			
		default:
			
			System.out.println("Esse mês não existe!");
			
			break;
		
		}
		
	}

	private static void verFeriados() {
		
		ArrayList<String> feriados = new ArrayList<>();
		feriados.add("Janeiro - 01 (Confraternização Mundial)");
		feriados.add("\nFevereiro - Nenhum");
		feriados.add("\nMarço - 01 (Carnaval), 02 (Cinzas)");
		feriados.add("\nAbril - 15 (Paixão de Cristo), 17 (Páscoa), 21 (Tiradentes)");
		feriados.add("\nMaio - 01 (Dia do Trabalho), 08 (Dia das Mães)");
		feriados.add("\nJunho - 12 (Dia dos Namorados), 16 (Corpus Christi), 24 (São João)");
		feriados.add("\nJulho - Nenhum");
		feriados.add("\nAgosto - 14 (Dia dos Pais)");
		feriados.add("\nSetembro - 07 (Independência do Brasil)");
		feriados.add("\nOutubro - 12 (Nossa Senhora Aparecida/Dia das Crianças)");
		feriados.add("\nNovembro - 02 (Finados), 15 (Proclamação da República)");
		feriados.add("\nDezembro - 25 (Natal)");
		
		System.out.println(feriados);
		verDatas();
		
	}

	private static void verJaneiro() {
		
		System.out.println("=========Janeiro===========");
		System.out.println("D\tS\tT\tQ\tQ\tS\tS" );
		System.out.println("\t\t\t\t\t\t1");
		System.out.println("2\t3\t4\t5\t6\t7\t8");
		System.out.println("9\t10\t11\t12\t13\t14\t15");
		System.out.println("16\t17\t18\t19\t20\t21\t22");
		System.out.println("23\t24\t25\t26\t27\t28\t29");
		System.out.println("30\t31");
		System.out.println("========================");
	}
	
}
