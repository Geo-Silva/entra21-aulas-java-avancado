package br.com.entra21.java.avancado.aula09;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Scanner;

public class Login {

	private static Scanner entrada = new Scanner(System.in);

	static HashMap<String, String> usuarios = new HashMap<>();

	public static void logar() {
		
		//nome      //senha
		usuarios.put("Geovani", "160702");
		usuarios.put("Adrielle", "BonequinhaQuebrada");
		usuarios.put("Marcos", "GrandeMestre");

		byte temConta;
		
		System.out.println("=============================");
		System.out.println("Bem vindo à agenda!");
		System.out.println("Você já poussui uma conta?");
		System.out.println("0 - Sair");
		System.out.println("1 - Sim (Logar)");
		System.out.println("2 - Não (Criar uma conta)");
		temConta = entrada.nextByte();
		
		switch(temConta) {
		
		case 0:
			
			System.out.println("Saindo...");
			System.exit(temConta);
			
			break;
		
		case 1:
		
			acessarConta();
			
			break;
			
		case 2:
			
			criarConta();
			
			break;
			
		default:
			
			System.out.println("Opcão inválida!");
			logar();
			
			break;
		
		
		}
		
	}

	private static void acessarConta() {
		
		String nome, senha;
		
		System.out.println("Nome:");
		nome = entrada.next();
		System.out.println("Senha:");
		senha = entrada.next();

		if(usuarios.containsKey(nome) && usuarios.containsValue(senha)) {
			
			System.out.println("Bem vindo, " + nome);
			
		}else {
			
			System.out.println("Credenciais incorretas!");
			logar();
			
		}
		
		
	}

	private static void criarConta() {
		
		String nome, senha;
		
		System.out.println("Qual seu nome?");
		nome = entrada.next();
		System.out.println("Crie sua senha (não vá esquecer!)");
		senha = entrada.next();
		
		if(usuarios.containsKey(nome)) {
			
			System.out.println("Usuário já existente! Crie com outro nome!");
			logar();
			
		}else {
			
			usuarios.put(nome, senha);
			logar();
			
		}

	}
	
	
}
