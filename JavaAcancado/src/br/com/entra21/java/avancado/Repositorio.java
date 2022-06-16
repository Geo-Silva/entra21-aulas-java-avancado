package br.com.entra21.java.avancado;

import java.util.HashMap;

public class Repositorio {

	public static HashMap<String, Pessoa> pessoas = new HashMap<>();
	
	public static void inicializarPessoas() {
		
		if(pessoas.isEmpty()) {
			
			pessoas.put("Geovani", new Pessoa("Geovani", (byte) 19));
			pessoas.put("Fulano", new Pessoa("Fulano", (byte) 26));
			pessoas.put("Tetrano", new Pessoa("Tetrano", (byte) 24));
				
		}
		
		

		
	}
	
}
