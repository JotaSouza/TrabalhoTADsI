package TrabalhoTADs;

import java.util.*;

public class Gerador {

	public void aleatorioQualquer() {
		//declaração da variável que limita a quantidade de número
		int contador = 0;
		//Array dos números selecionados para o teste
		String[] numeros = {"00", "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
		//Criação da lista de String contendo os números. A classe Array permite ao Java ver o Array como uma lista
		List<String> list = Arrays.asList(numeros);
		//Utilizo o método Shuffle da classe Collections, que faz com que os elementos do Array fiquem desordenados
		Collections.shuffle(list);
		//A partir de agora todos os elementos ficam desordenados. Mas será impresso apenas o primeiro
		
		//Ou seja, enquanto o contador for menor do que 1
		while(contador < 1) {
			//O método get seleciona qualquer elemento existente na lista
			System.out.println(list.get(contador));
			//Sempre que for impresso um número, o contador é incrementado em 1 para sair do loop.
			contador++;
		}
	}
	// Metodo que cria o Array que recebe os parâmetros informados pelo usuário
	public static ArrayList<Integer> aleatorioIntervalo(int ini, int fim) {
		//Instancia a variavel que armazena os valores
		ArrayList<Integer > vet = new ArrayList<Integer>();
		//Laço que faz a iteração dos valores a partir da informação do usuário
		for(ini = ini + 1; ini < fim; ini++) {
			//Metódo da classe Array que adiciona os valores a variável
			 vet.add(ini);
		}
		//Método Shuffle da classe Collections, que faz com que os elementos do Array fiquem desordenados
		Collections.shuffle(vet);
		//Impressão dos valores gerados no intervalo, a partir de um índice setado e a posição do elemento a
		//ser buscada dentro do vetor.
		System.out.println(vet.set(0, 4));
		//retorno do método
		return vet;
	}
		
	
}
