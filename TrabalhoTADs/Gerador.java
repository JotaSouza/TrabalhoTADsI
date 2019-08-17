package TrabalhoTADs;

import java.util.*;

public class Gerador {

	public void aleatorioQualquer() {
		//declara��o da vari�vel que limita a quantidade de n�mero
		int contador = 0;
		//Array dos n�meros selecionados para o teste
		String[] numeros = {"00", "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
		//Cria��o da lista de String contendo os n�meros. A classe Array permite ao Java ver o Array como uma lista
		List<String> list = Arrays.asList(numeros);
		//Utilizo o m�todo Shuffle da classe Collections, que faz com que os elementos do Array fiquem desordenados
		Collections.shuffle(list);
		//A partir de agora todos os elementos ficam desordenados. Mas ser� impresso apenas o primeiro
		
		//Ou seja, enquanto o contador for menor do que 1
		while(contador < 1) {
			//O m�todo get seleciona qualquer elemento existente na lista
			System.out.println(list.get(contador));
			//Sempre que for impresso um n�mero, o contador � incrementado em 1 para sair do loop.
			contador++;
		}
	}
	// Metodo que cria o Array que recebe os par�metros informados pelo usu�rio
	public static ArrayList<Integer> aleatorioIntervalo(int ini, int fim) {
		//Instancia a variavel que armazena os valores
		ArrayList<Integer > vet = new ArrayList<Integer>();
		//La�o que faz a itera��o dos valores a partir da informa��o do usu�rio
		for(ini = ini + 1; ini < fim; ini++) {
			//Met�do da classe Array que adiciona os valores a vari�vel
			 vet.add(ini);
		}
		//M�todo Shuffle da classe Collections, que faz com que os elementos do Array fiquem desordenados
		Collections.shuffle(vet);
		//Impress�o dos valores gerados no intervalo, a partir de um �ndice setado e a posi��o do elemento a
		//ser buscada dentro do vetor.
		System.out.println(vet.set(0, 4));
		//retorno do m�todo
		return vet;
	}
		
	
}
