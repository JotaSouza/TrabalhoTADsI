package TrabalhoTADs;

public class Gerador {

	final private int erroReturn = 1000; //declaração de uma constante -- ERRO
	private String extenso;
	private String auxiliar; //guarda valor milissegundos^2 e separa o 4 digito da esquerda para direita - auxiliando no aleatório negativo/positivo
	private long milissegundos = System.currentTimeMillis();
	private long aux;
	private int aleatorio;
	private int inicio;
	private int fim;
	private int tamanho = 0;
	
	//Atributos jogo de dados
	private int frequencia1 = 0;
	private int frequencia2 = 0;
	private int frequencia3 = 0;
	private int frequencia4 = 0;
	private int frequencia5 = 0;
	private int frequencia6 = 0;
	private int faceDado;
	
	
	/* OK - a) método aleatório: gera um número aleatório qualquer.
	   OK - b) método aleatório_intervalo: gera um número aleatório a partir de um intervalo definido.
	*/

	private long milissegundos(){ //eleva ao quadrado a variável milissegundos
		return this.aux = milissegundos * milissegundos;
	}
	
	public int aleatorio(){
		extenso = Integer.toString((int)this.aux); //converte aux(long) em inteiro e depois para String
		
		//retorna os 3 últimos números da variávelaux (aux = milissegundos*milissegundos) 
		//e retorna um inteiro aleatório
		this.aleatorio = Integer.parseInt(extenso.substring(extenso.length() - 3, extenso.length()));
		
		return positivoNegativo();
	}

	private int aleatorioUni(int incio){
		milissegundos();
		extenso = Integer.toString((int)this.aux); //converte aux(long) em inteiro e depois para String
		this.milissegundos = System.currentTimeMillis(); //pega novamente milissegundos para recalculo no loop
		
		//retorna os 3 últimos números da variável aux (aux = milissegundos*milissegundos) 
		//e retorna um inteiro aleatório
		this.aleatorio = Integer.parseInt(extenso.substring(extenso.length() - 1, extenso.length()));
		
		return positivoNegatigoIntervalo(inicio);
	}

	private int aleatorioDec(int inicio){
		
		milissegundos();
		extenso = Integer.toString((int)this.aux); //converte aux(long) em inteiro e depois para String
		this.milissegundos = System.currentTimeMillis();
		
		//retorna os 3 últimos números da variável aux (aux = milissegundos*milissegundos) 
		//e retorna um inteiro aleatório
		this.aleatorio = Integer.parseInt(extenso.substring(extenso.length() - 2, extenso.length()));
		
		return positivoNegatigoIntervalo(inicio);
	}
	
	private int aleatorioCen(int inicio){
		milissegundos();
		extenso = Integer.toString((int)this.aux); //converte aux(long) em inteiro e depois para String
		this.milissegundos = System.currentTimeMillis();
		
		//retorna os 3 últimos números da variável aux (aux = milissegundos*milissegundos) 
		//e retorna um inteiro aleatÃ³rio
		this.aleatorio = Integer.parseInt(extenso.substring(extenso.length() - 3, extenso.length()));
		
		return positivoNegatigoIntervalo(inicio);
	}
	
	private int positivoNegatigoIntervalo(int inicio){
		if(inicio < 0){ //verifica se inicio é 0, se for retornará o método positivoNegativo()
			return positivoNegativo();
		}else
			return this.aleatorio;
	}
	
	private int positivoNegativo(){
		this.auxiliar = Integer.toString((int) this.milissegundos); 
		this.tamanho = this.auxiliar.length() - 4; //recebe 4 posição de trás para frente do this.auxiliar

		//Loop para verificar se this.tamanho esta entre 0 e 6, assim tornando this.aleatorio negativo
		for(int i = 0; i < 4; i++)
			if(this.auxiliar.substring(this.tamanho, this.tamanho + 1).equals(Integer.toString(i)))
				return this.aleatorio *= (-1); //converte valor para negativo
			
		return this.aleatorio; //retorna o valor sem altera-lo
	}
	
	public int aleatorioIntervalo(int inicio, int fim){ //Metodo para definir número aleatório dentro de um intervalo.
		this.fim = fim; //valor salvo para print na tela.
		this.inicio = inicio; //valor salvo para print na tela.
		
		//inicio for maior que fim ou fim for maior que 1000 ou inicio menor que -1000 = error
		if(inicio > fim || fim >= this.erroReturn || inicio <= (this.erroReturn * -1)) 
			return this.aleatorio = this.erroReturn;
		else{
			if(fim < 10){
				do{
					aleatorioUni(inicio); //chama método par valor entre -9 e 9
				}while(this.aleatorio <= inicio || this.aleatorio >= fim);
				
				return this.aleatorio;	
			}else
				if(fim < 100){
					do{ 
						aleatorioDec(inicio); //chama método par valor entre -99 e 99
					}while(this.aleatorio <= inicio || this.aleatorio >= fim);
					
					return this.aleatorio;
				}else{
					do{ 
						aleatorioCen(inicio); //chama método par valor entre -999 e 999
					}while(this.aleatorio <= inicio || this.aleatorio >= fim);
						
						return this.aleatorio;
					}
			}		
	}
	
	public int dados(int numDados, int numLados, int lancamentos){
		for(int rolar = 1; rolar <= lancamentos; rolar++){//soma os lançamentos de um lado
			faceDado = aleatorioIntervalo(1, numLados);//intervalo da quantidade de lados do dado
			switch(faceDado){//define o valor de lançamento de n lados e incrementa o contador
			case 1:
				++frequencia1; //incrementa o contador de 1
				break;
			case 2:
				++frequencia2; //incrementa o contador de 2
				break;
			case 3:
				++frequencia3; //incrementa o contador de 3
				break;
			case 4:
				++frequencia4; //incrementa o contador de 4
				break;
			case 5:
				++frequencia5; //incrementa o contador de 5
				break;
			case 6:
				++frequencia6; //incrementa o contador de 6
				break;
			}//fim do switch
		}//fim do for
		System.out.println("Face\tFrequência");
		System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",frequencia1, frequencia2, 
				frequencia3, frequencia4, frequencia5, frequencia6);
		
		
		return numLados;
	}

	
	public String mostrarAleatorio() { //Mostra na tela número aleatório
		StringBuilder builder = new StringBuilder();
		milissegundos();
		aleatorio();
		builder.append("Número gerado: ");
		builder.append(this.aleatorio);
		return builder.toString();
	}
	
	public String mostrarAleatorioIntervalo() { //Mostra na tela número aleatório dentro de um intervalo.
		StringBuilder builder = new StringBuilder();
		if(this.aleatorio == erroReturn){
			builder.append("Error");
			return builder.toString();
		}
		builder.append("Número aleatório gerado no intervalo entre ");
		builder.append(inicio);
		builder.append(" e ");
		builder.append(fim);
		builder.append(" : ");
		builder.append(this.aleatorio);
		return builder.toString();
	}
	 
	
}
