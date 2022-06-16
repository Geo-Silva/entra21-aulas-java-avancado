package br.com.entra21.java.avancado.aula09;

public @interface Responsavel {

	public enum OrdemPrioridade {
		CRITICO, IMPORTANTE, TRIVIAL, DOCUMENTAR
	};

	OrdemPrioridade ordemPrioridade() default OrdemPrioridade.IMPORTANTE;

	String item();

	String quemAssume();
	
}
