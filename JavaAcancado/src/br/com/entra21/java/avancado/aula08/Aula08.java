package br.com.entra21.java.avancado.aula08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import br.com.entra21.java.avancado.Aula;
import br.com.entra21.java.avancado.Pessoa;

public class Aula08 extends Aula {

	public Aula08(String titulo, ArrayList<String> assuntos) {
		super(titulo, assuntos);
		
	}

	@Override
	public byte capturarOpcao() {
		
		byte opcao = super.capturarOpcao();
		
		switch (opcao) {
		
		case 1:
			
			aprenderListar();
			
			break;

		case 2:
			
			aprenderFiltrar();
			
			break;
			
		case 3:
			
			aprenderEstatistica();
			
			break;
			
		case 4:
			
			aprenderOrdenar();
			
			break;
		
		}
		
		
		return opcao;
		
	}

	private void aprenderOrdenar() {
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Jo�o");
		nomes.add("Maria");
		nomes.add("Alex");
		nomes.add("Pedro");
		nomes.add("C�cera");
		
		System.out.println("Listando os nomes na ordem de cria��o");
		nomes.forEach(System.out::println);
		
		System.out.println("Listando os nomes em ordem alfab�tica");
		nomes.sort(String::compareTo);
		nomes.forEach(System.out::println);	
			
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Daniel", (byte) 15));
		pessoas.add(new Pessoa("Junin", (byte) 10));
		pessoas.add(new Pessoa("Jo�ozinho", (byte) 18));
		pessoas.add(new Pessoa("Pedrinho", (byte) 25));
		pessoas.add(new Pessoa("Mariazinha", (byte) 27));
	
		Collections.sort(pessoas, new Comparator<Pessoa>() {
		    @Override public int compare(Pessoa pessoaA, Pessoa pessoaB) {
		        return pessoaA.getNome().compareTo(pessoaB.getNome());
		    }
		});
		
		System.out.println("-----------Imprimindo os nomes em ordem alfab�tica-----------");
		
		pessoas.forEach(pessoa->{ //faz tudo que o de cima faz, s� que ocupando menos linhas
			
			System.out.println(pessoa.getNome());
			
		});
		
	}

	private void aprenderEstatistica() {
		
		ArrayList<Double> notas = new ArrayList<>(Arrays.asList(10d, 8d, 7.5d));

		notas.forEach(System.out::println);
		
		DoubleSummaryStatistics estatisticas = notas.stream().mapToDouble((numero) -> numero).summaryStatistics();

		System.out.println("A m�dia �: " + estatisticas.getAverage());
		System.out.println("A menor nota foi: " + estatisticas.getMin());
		System.out.println("A maior nota foi: " + estatisticas.getMax());
		System.out.println("A quantidae total de notas foi: " + estatisticas.getCount());
		System.out.println("A soma das notas foi: " + estatisticas.getSum());
		
		
		
	}

	private void aprenderFiltrar() {
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Daniel", (byte) 15));
		pessoas.add(new Pessoa("Junin", (byte) 10));
		pessoas.add(new Pessoa("Jo�ozinho", (byte) 18));
		pessoas.add(new Pessoa("Pedrinho", (byte) 25));
		pessoas.add(new Pessoa("Mariazinha", (byte) 27));



		pessoas.forEach(pessoa -> {

		System.out.println("Nome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade());

		});



		System.out.println("--------Percorrendo a lista e filtrando os menores--------");



		List<Pessoa> pessoasNovas = pessoas.stream() // gera um stream para a minha lista, uma c�pia que n�o afeta a
		// lista original
		.filter(pessoa -> pessoa.getIdade() < 18) // o filter vai filtrar com base no meu crit�rio, criando uma
		// vari�vel tempor�ria que � verificada a cada item
		.collect(Collectors.toList()); // os itens resultantes ser�o convertidos em uma lista



		pessoasNovas.forEach(pessoa -> {



		System.out.println("Essa pessoa � de menor: ");
		System.out.println("Nome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade());
		});



		System.out.println("--------Percorrendo a lista e filtrando os menores(sem lambda)--------");



		ArrayList<Pessoa> pessoasMenores = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
		if (pessoa.getIdade() < 18) {
		pessoasMenores.add(pessoa);



		}
		}
		for (Pessoa pessoa : pessoasMenores) {
		System.out.println("Essa pessoa � de menor: ");
		System.out.println("Nome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade());
		}
		
		System.out.println("------------Filtrando nomes que terminam com a letra O-------------------");
		
		pessoas.stream().filter(
				pessoa -> 
				pessoa.getNome().endsWith("o") && pessoa.getIdade()>20
				).forEach(pessoa ->{
			
			System.out.println("Essa pessoa termina com \"o\"");
			System.out.println("Nome: " + pessoa.getNome() + "\tIdade: " + pessoa.getIdade());
			
		});
		
		
	}

	private void aprenderListar() {
		
		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 5, 7, 2, 8, 4, 12, 53));
		ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Geovani", "da", "Silva", "Brustolin"));
			
		System.out.println("Listando de forma muito resumida");
		
		numeros.forEach(System.out::println); //vai imprimir uma lista
		
		System.out.println("Listando de forma normal");
		
		for (Integer numero : numeros) {
			
			System.out.println(numero);
			
		}
		
		System.out.println("Listando os nomes de forma resumida");
		
		nomes.forEach(System.out::println);
		
		System.out.println("Listando de forma normal");
		
		for (String nome : nomes) {

			System.out.println(nome);

		}
		
		System.out.println("Listando utilizando Arrow -> , quando executa apenas uma instru��o, n�o precisa de escopo");
		nomes.forEach(nome -> System.out.println(nome));
		
		System.out.println("Listando utilizando Arrow ->, quando executa mais de uma instru��o � necess�rio declarar o escopo\n");
		
		nomes.forEach(nome -> {
			
			System.out.println(nome);
			System.out.println(" [ " + nome + " ]");
			
		});
		
	}

	
	
	
	
	
}
