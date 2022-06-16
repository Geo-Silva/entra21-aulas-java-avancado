package br.com.entra21.java.avancado.aula06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;
import br.com.entra21.java.avancado.Repositorio;

public class Aula06 extends Aula implements ICrud<Pessoa> {
	
	public Aula06(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
	
	} 
	
	@Override
	public byte capturarOpcao() { byte opcao = super.capturarOpcao();
		switch (opcao) {
		
		case 1:
			aprenderSobreGenerics();
			
			break;
		
		case 2:
			
			 listar(Repositorio.pessoas);
			
			break; 
			
		case 3:
			
			adicionar();
			
			break;
			
		case 4:
			
			editar(capturarChave()); //ele precisa de uma chave antes de poder editar uma
			
			break;
			
		case 5:
			
			deletar(capturarChave());
			
			break;
			
		}
		
		return opcao;
	} 
	
	public void aprenderSobreGenerics() {
	System.out.println("Criar uma Interface onde o nome terá um sufixo <Letra>");
	System.out.println("Essa letra é um parâmetro para quem implementar essa interface.");
	System.out.println("Os métodos gerados que tinham essa Letra serão substituidos pelo parâmetro informado pela classe");
	
	} 
	
	@Override
	public void listar(HashMap<String, Pessoa> lista) {

		System.out.println("---------Listando Pessoas--------------");
		
		for(Entry<String, Pessoa> pessoa : lista.entrySet()) {
			
			System.out.println("Chave: " + pessoa.getKey() + " \t\t " + pessoa.getValue().getNome() + "\t" + pessoa.getValue().getIdade());
			
		}
		
		System.out.println("-----------------" + (lista.isEmpty() ? "Lista vazia" : "Quantidade " + lista.size()));
		//lista.clear();
	} 
	
	@Override //perfeito para adicionar pessoas em uma lista
	public void adicionar() {
		
		Pessoa novo = capturarValor();

		if(buscar(novo) == null) {
			
			Repositorio.pessoas.put(novo.getNome(), novo);
			
		}else {
			
			System.out.println("Já existe alguém com a chave: " + novo.getNome());
			
		}
		
	}

	
	@Override //aqui é adicionada uma nova pessoa
	public Pessoa capturarValor() {
		
		Pessoa formulario = new Pessoa();
		
		System.out.println("Informe o nome dessa pessoa:");
		formulario.setNome(super.getEntrada().next());
		
		System.out.println("Informe a idade de " + formulario.getNome());
		formulario.setIdade(super.getEntrada().nextByte());
		
		return formulario;
	}

	@Override //e aqui ele busca essa pessoa. Caso essa pessoa não exista, no método adicionar você podera
	//criar uma nova pessoa.
	public Pessoa buscar(Pessoa chave) {
		
		Pessoa busca = Repositorio.pessoas.get(chave.getNome());
		
		return busca;
	}

	@Override
	public Pessoa capturarChave() {
		
		Pessoa chave = new Pessoa();
		System.out.println("Informe o valor da chave:");
		chave.setNome(super.getEntrada().next());
		
		return chave;
		
	}

	@Override
	public void editar(Pessoa chave) {
		
		if(buscar(chave) != null) {
			
			Pessoa editado = capturarValor();
			Repositorio.pessoas.put(chave.getNome(), editado);
			
		}else {
			
			System.out.println("Não existe algúem com a chave " + chave.getNome());
			
		}
		
		
	}

	@Override
	public void deletar(Pessoa chave) {
		
		if(buscar(chave) != null) {
			
			Repositorio.pessoas.remove(chave.getNome()); //vai no hashmap pessoas e deleta a chave com o nome que foi denifinido
			
		}else {
			
			System.out.println("Não existe algúem com a chave " + chave.getNome());
			
		}
		
	}

	
	
}


