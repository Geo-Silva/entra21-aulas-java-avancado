package br.com.entra21.java.avancado.aula07;

import java.time.LocalDate;

public class DataFuturaNaoPermitidaExeception extends Exception{

	public DataFuturaNaoPermitidaExeception() {
		
		super("Não é permitido informar uma data maior que hoje - " + LocalDate.now().toString());
		
	}
	
	public DataFuturaNaoPermitidaExeception(String mensagem) {
		
		super(mensagem);
		
	}
	
}
