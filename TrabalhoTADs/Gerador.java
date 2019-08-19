package TrabalhoTADs;

import java.util.*;

public class Gerador {

	public void aleatorioQualquer() {
		
		StringBuilder num = new StringBuilder();
		int semente = (int) (3 * System.currentTimeMillis());
		for(int i = 0; i < 2; i++) {
			semente = (7*semente)%11;
			num.append(semente*-1);
		}
		System.out.println(num.toString());
		
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
	
	// Metodo que cria o Array que recebe os parâmetros informados pelo usuário
		public static ArrayList<Integer> caraOuCoroa(int ini, int fim) {
			//Instancia a variavel que armazena os valores
			ArrayList<Integer > vet = new ArrayList<Integer>();
			//int cara = 0, coroa = 0;
			//Laço que faz a iteração dos valores a partir da informação do usuário
			for(ini = ini; ini < fim; ini++) {
				//Metódo da classe Array que adiciona os valores a variável
				 vet.add(ini);
			}
			//Método Shuffle da classe Collections, que faz com que os elementos do Array fiquem desordenados
			Collections.shuffle(vet);
			//Variavel que armazena os valores gerados no intervalo, a partir de um índice setado e a posição do elemento a
			//ser buscada dentro do vetor.
			int v = (vet.set(0, 4));
			//Condição para gerar o resultado do jogo
			if (v % 2 == 0) {
				//Saída do resultado
				System.out.println("Saiu Coroa");
			} else {
				//Saída do resultado
				System.out.println("Saiu Cara");
			}
			//retorno do método
			return vet;
		}
}
