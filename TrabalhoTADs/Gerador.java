package TrabalhoTADs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
			//Sempre que for impresso um número, o contatos é incrementado em 1 para sair do loop.
			contador++;
		}
	}
	
	
}
