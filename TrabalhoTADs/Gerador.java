package TrabalhoTADs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gerador {

	public void aleatorioQualquer() {
		int contador = 0;
		String[] numeros = {"00", "01", "02", "03", "04", "05", "06",
				"07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
		List<String> list = Arrays.asList(numeros);
		Collections.shuffle(list);
		
		while(contador < 1) {
			System.out.println(list.get(contador));
			contador++;
		}
	}
}
