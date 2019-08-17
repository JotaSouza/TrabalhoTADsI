package TrabalhoTADs;

import java.util.Scanner;

public class MainGerador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao, numIni = 0, numFim = 0;
		Gerador gera = new Gerador();
		System.out.println(":::... Gerador de Números Aleatórios ...:::\n"
				+ "\nPara continuar, escolha uma das funções:" 
		        + "\n[1] - Gerar um número aleatório qualquer;"
				+ "\n[2] - Gerar um número aleatório a partir de um intervalo definido;"
				+ "\n[3] - Cara ou Coroa;"
				+ "\n[4] - Lançar dados.");
		System.out.print("Opção-> ");
		opcao = entrada.nextInt();
		
		switch(opcao){
		case 1:
			System.out.print("O número gerado foi: ");
			gera.aleatorioQualquer();
			break;
		case 2:
			do {
			System.out.print("Informe o número inicial: ");
			numIni = entrada.nextInt();
			if(numIni < 0) {
				System.out.println("Número informado não pode ser negativo.");
				System.out.println("Repita a operação");
			 } 
			}while (numIni < 0);
			
			do {
			System.out.print("Informe o número final: ");
			numFim = entrada.nextInt();
			if (numFim  < numIni) {
				System.out.println("O segundo número deve ser maior que o primeiro.");
				System.out.println("Repita a operação");
			   } 
			   	
			} while (numFim  < numIni);
			
			System.out.print("Número gerado no intervalo informado: ");
			Gerador.aleatorioIntervalo(numIni, numFim);
			 
			break;
		case 3:
			break;
		case 4:
			break;
			default:
				System.out.println("Opção inválida!");
		}
		
		entrada.close();

	}

}
