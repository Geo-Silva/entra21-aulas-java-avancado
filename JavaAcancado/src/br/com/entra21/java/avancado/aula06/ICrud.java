package br.com.entra21.java.avancado.aula06;

import java.util.HashMap;

public interface ICrud <A>{
	
	public void listar(HashMap<String, A> lista);

	public void adicionar();
	
	public A capturarValor();
	
	public A buscar(A chave);
	
	public A capturarChave();
	
	public void editar(A chave);

	public void deletar(A chave);
	
}
