package TrabalhoTADs;

import java.util.Scanner;

public class MainGerador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		Gerador gera = new Gerador();
		System.out.println(":::... Gerador de N�meros Aleat�rios ...:::\n"
				+ "\nPara continuar, escolha uma das fun��es:" 
		        + "\n[1] - Gerar um n�mero aleat�rio qualquer;"
				+ "\n[2] - Gerar um n�mero aleat�rio a partir de um intervalo definido;"
				+ "\n[3] - Cara ou Coroa;"
				+ "\n[4] - Lan�ar dados.");
		System.out.print("Op��o-> ");
		opcao = entrada.nextInt();
		
		switch(opcao){
		case 1:
			System.out.print("O n�mero gerado foi: ");
			gera.aleatorioQualquer();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
			default:
				System.out.println("Op��o inv�lida!");
		}
		
		entrada.close();

	}

}
