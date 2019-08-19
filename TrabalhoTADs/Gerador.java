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
	
	// Metodo que cria o Array que recebe os par�metros informados pelo usu�rio
		public static ArrayList<Integer> caraOuCoroa(int ini, int fim) {
			//Instancia a variavel que armazena os valores
			ArrayList<Integer > vet = new ArrayList<Integer>();
			//int cara = 0, coroa = 0;
			//La�o que faz a itera��o dos valores a partir da informa��o do usu�rio
			for(ini = ini; ini < fim; ini++) {
				//Met�do da classe Array que adiciona os valores a vari�vel
				 vet.add(ini);
			}
			//M�todo Shuffle da classe Collections, que faz com que os elementos do Array fiquem desordenados
			Collections.shuffle(vet);
			//Variavel que armazena os valores gerados no intervalo, a partir de um �ndice setado e a posi��o do elemento a
			//ser buscada dentro do vetor.
			int v = (vet.set(0, 4));
			//Condi��o para gerar o resultado do jogo
			if (v % 2 == 0) {
				//Sa�da do resultado
				System.out.println("Saiu Coroa");
			} else {
				//Sa�da do resultado
				System.out.println("Saiu Cara");
			}
			//retorno do m�todo
			return vet;
		}
}
