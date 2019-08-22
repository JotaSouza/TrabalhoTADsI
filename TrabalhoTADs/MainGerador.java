package TrabalhoTADs;

import java.util.Scanner;

public class MainGerador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao, numIni = 0, numFim = 0;
		Gerador gera = new Gerador();
		System.out.println(":::... Gerador de N�meros Aleat�rios ...:::\n"
				+ "\nPara continuar, escolha uma das fun��es:" 
		        + "\n[1] - Gerar um n�mero aleat�rio qualquer;"
				+ "\n[2] - Gerar um n�mero aleat�rio a partir de um intervalo definido;"
				+ "\n[3] - Cara ou Coroa;"
				+ "\n[4] - Lan�ar dados.");
		System.out.print("Op��o-> ");
		opcao = entrada.nextInt();
		System.out.println(" ");
		
		switch(opcao){
		case 1:
			System.out.println(gera.mostrarAleatorio());
			break;
		case 2:
			do {
			System.out.print("Informe o n�mero inicial: ");
			numIni = entrada.nextInt();
			if(numIni < 0) {
				System.out.println("N�mero informado n�o pode ser negativo.");
				System.out.println("Repita a opera��o");
			 } 
			}while (numIni < 0);
			
			do {
			System.out.print("Informe o n�mero final: ");
			numFim = entrada.nextInt();
			if (numFim  < numIni) {
				System.out.println("O segundo n�mero deve ser maior que o primeiro.");
				System.out.println("Repita a opera��o");
			   } 
			   	
			} while (numFim  < numIni);
			gera.aleatorioIntervalo(numIni, numFim);
			System.out.println(gera.mostrarAleatorioIntervalo());
			 
			break;
		case 3:
			do {
				System.out.println("Escolha:"
						+ "\n[1] - Cara"
						+ "\n[2] - Coroa");
				System.out.print("Op��o-> ");
				numIni = entrada.nextInt();
				if(numIni< 1 || numIni > 2) {
					System.out.println("Op��o Inv�lida");					
					}
			}while(numIni < 1 || numIni > 2);
			
			do {
				System.out.print("Informe quantas vezes deseja jogar: ");
				numFim = entrada.nextInt();
				if(numFim < 1) {
					System.out.println("Op��o Inv�lida");					
					}
			}while(numFim < 1);
			
			
			break;
		case 4:
			break;
			default:
				System.out.println("Op��o inv�lida!");
		}
		
		entrada.close();

	}

}
