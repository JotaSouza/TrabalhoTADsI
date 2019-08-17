package TrabalhoTADs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
			//Sempre que for impresso um n�mero, o contatos � incrementado em 1 para sair do loop.
			contador++;
		}
	}
	
	
}
