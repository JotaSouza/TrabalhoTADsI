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
	
	//Atributos face/lado dos dados
	private int frequencia1 = 0, frequencia2 = 0, frequencia3 = 0,  frequencia4 = 0, frequencia5 = 0, frequencia6 = 0, frequencia7 = 0, frequencia8 = 0, frequencia9 = 0, frequencia10 = 0;
	private int frequencia11 = 0, frequencia12 = 0, frequencia13 = 0,  frequencia14 = 0, frequencia15 = 0, frequencia16 = 0, frequencia17 = 0, frequencia18 = 0, frequencia19 = 0, frequencia20 = 0;
	private int frequencia21 = 0, frequencia22 = 0, frequencia23 = 0,  frequencia24 = 0, frequencia25 = 0, frequencia26 = 0, frequencia27 = 0, frequencia28 = 0, frequencia29 = 0, frequencia30 = 0;
	private int frequencia31 = 0, frequencia32 = 0, frequencia33 = 0,  frequencia34 = 0, frequencia35 = 0, frequencia36 = 0, frequencia37 = 0, frequencia38 = 0, frequencia39 = 0, frequencia40 = 0;
	private int frequencia41 = 0, frequencia42 = 0, frequencia43 = 0,  frequencia44 = 0, frequencia45 = 0, frequencia46 = 0, frequencia47 = 0, frequencia48 = 0, frequencia49 = 0, frequencia50 = 0;
	private int frequencia51 = 0, frequencia52 = 0, frequencia53 = 0,  frequencia54 = 0, frequencia55 = 0, frequencia56 = 0, frequencia57 = 0, frequencia58 = 0, frequencia59 = 0, frequencia60 = 0;
	private int frequencia61 = 0, frequencia62 = 0, frequencia63 = 0,  frequencia64 = 0, frequencia65 = 0, frequencia66 = 0, frequencia67 = 0, frequencia68 = 0, frequencia69 = 0, frequencia70 = 0;
	private int frequencia71 = 0, frequencia72 = 0, frequencia73 = 0,  frequencia74 = 0, frequencia75 = 0, frequencia76 = 0, frequencia77 = 0, frequencia78 = 0, frequencia79 = 0, frequencia80 = 0;
	private int frequencia81 = 0, frequencia82 = 0, frequencia83 = 0,  frequencia84 = 0, frequencia85 = 0, frequencia86 = 0, frequencia87 = 0, frequencia88 = 0, frequencia89 = 0, frequencia90 = 0;
	private int frequencia91 = 0, frequencia92 = 0, frequencia93 = 0,  frequencia94 = 0, frequencia95 = 0, frequencia96 = 0, frequencia97 = 0, frequencia98 = 0, frequencia99 = 0, frequencia100 = 0;
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
	
	public int dados(int numLados, int lancamentos){
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
			case 7:
				++frequencia7; //incrementa o contador de 7
				break;
			case 8:
				++frequencia8; //incrementa o contador de 8
				break;
			case 9:
				++frequencia9;
				break;
			case 10:
				++frequencia10;
				break;
			case 11:
				++frequencia11;
				break;
			case 12:
				++frequencia12;
				break;
			case 13:
				++frequencia13;
				break;
			case 14:
				++frequencia14;
				break;
			case 15:
				++frequencia15;
				break;
			case 16:
				++frequencia16;
				break;
			case 17:
				++frequencia17;
				break;
			case 18:
				++frequencia18;
				break;
			case 19:
				++frequencia19;
				break;
			case 20:
				++frequencia20;
				break;
			case 21:
				++frequencia21;
				break;
			case 22:
				++frequencia22;
				break;
			case 23:
				++frequencia23;
				break;
			case 24:
				++frequencia24;
				break;
			case 25:
				++frequencia25;
				break;
			case 26:
				++frequencia26;
				break;
			case 27:
				++frequencia27;
				break;
			case 28:
				++frequencia28;
				break;
			case 29:
				++frequencia29;
				break;
			case 30:
				++frequencia30;
				break;
			case 31:
				++frequencia31;
				break;
			case 32:
				++frequencia32;
				break;
			case 33:
				++frequencia33;
				break;
			case 34:
				++frequencia34;
				break;
			case 35:
				++frequencia35;
				break;
			case 36:
				++frequencia36;
				break;
			case 37:
				++frequencia37;
				break;
			case 38:
				++frequencia38;
				break;
			case 39:
				++frequencia39;
				break;
			case 40:
				++frequencia40;
				break;
			case 41:
				++frequencia41;
				break;
			case 42:
				++frequencia42;
				break;
			case 43:
				++frequencia43;
				break;
			case 44:
				++frequencia44;
				break;
			case 45:
				++frequencia45;
				break;
			case 46:
				++frequencia46;
				break;
			case 47:
				++frequencia47;
				break;
			case 48:
				++frequencia48;
				break;
			case 49:
				++frequencia49;
				break;
			case 50:
				++frequencia50;
				break;
			case 51:
				++frequencia51;
				break;
			case 52:
				++frequencia52;
				break;
			case 53:
				++frequencia53;
				break;
			case 54:
				++frequencia54;
				break;
			case 55:
				++frequencia55;
				break;
			case 56:
				++frequencia56;
				break;
			case 57:
				++frequencia57;
				break;
			case 58:
				++frequencia58;
				break;
			case 59:
				++frequencia59;
				break;
			case 60:
				++frequencia60;
				break;
			case 61:
				++frequencia61;
				break;
			case 62:
				++frequencia62;
				break;
			case 63:
				++frequencia63;
				break;
			case 64:
				++frequencia64;
				break;
			case 65:
				++frequencia65;
				break;
			case 66:
				++frequencia66;
				break;
			case 67:
				++frequencia67;
			case 68:
				++frequencia68;
				break;
			case 69:
				++frequencia69;
				break;
			case 70:
				++frequencia70;
				break;
			case 71:
				++frequencia71;
				break;
			case 72:
				++frequencia72;
				break;
			case 73:
				++frequencia73;
				break;
			case 74:
				++frequencia74;
				break;
			case 75:
				++frequencia75;
				break;
			case 76:
				++frequencia76;
				break;
			case 77:
				++frequencia77;
				break;
			case 78:
				++frequencia78;
				break;
			case 79:
				++frequencia79;
				break;
			case 80:
				++frequencia80;
				break;
			case 81:
				++frequencia81;
				break;
			case 82:
				++frequencia82;
				break;
			case 83:
				++frequencia83;
				break;
			case 84:
				++frequencia84;
				break;
			case 85:
				++frequencia85;
				break;
			case 86:
				++frequencia86;
				break;
			case 87:
				++frequencia87;
				break;
			case 88:
				++frequencia88;
				break;
			case 89:
				++frequencia89;
				break;
			case 90:
				++frequencia90;
				break;
			case 91:
				++frequencia91;
				break;
			case 92:
				++frequencia92;
				break;
			case 93:
				++frequencia93;
				break;
			case 94:
				++frequencia94;
				break;
			case 95:
				++frequencia95;
				break;
			case 96:
				++frequencia96;
				break;
			case 97:
				++frequencia97;
				break;
			case 98:
				++frequencia98;
				break;
			case 99:
				++frequencia99;
				break;
			case 100:
				++frequencia100;
				break;

			}//fim do switch
		}//fim do for
		System.out.println("Resultado:"	+ "\nFace\tFrequência");
		if(numLados == 4) {
			System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n",frequencia1, frequencia2, 
					frequencia3, frequencia4);
		} else if (numLados == 6) {
			System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",frequencia1, frequencia2, 
					frequencia3, frequencia4, frequencia5, frequencia6);
		} else if (numLados ==8) {
			System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n7\t%d\n8\t%d\n",frequencia1, frequencia2, 
					frequencia3, frequencia4, frequencia5, frequencia6, frequencia7, frequencia8);
		} else if (numLados == 10) {
			System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n7\t%d\n8\t%d\n9\t%d\n10\t%d\n",frequencia1, frequencia2, 
					frequencia3, frequencia4, frequencia5, frequencia6, frequencia7, frequencia8, frequencia9, frequencia10);
		} else if (numLados == 12) {
			System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n7\t%d\n8\t%d\n9\t%d\n10\t%d\n11\t%d\n12\t%d\n",frequencia1, frequencia2, 
					frequencia3, frequencia4, frequencia5, frequencia6, frequencia7, frequencia8, frequencia9, frequencia10);
		} else if (numLados == 20) {
			System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n7\t%d\n8\t%d\n9\t%d\n10\t%d\n11\t%d\n12\t%d\n13\t%d\n14\t%d\n15\t%d\n16\t%d\n17\t%d\n18\t%d"
					+ "\n19\t%d\n20\t%d\n",frequencia1, frequencia2, frequencia3, frequencia4, frequencia5, frequencia6, frequencia7, frequencia8, frequencia9, frequencia10, 
					frequencia11, frequencia12, frequencia13, frequencia14, frequencia15, frequencia16, frequencia17, frequencia18, frequencia19, frequencia20);
		} else if (numLados == 60) {
			System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n7\t%d\n8\t%d\n9\t%d\n10\t%d\n11\t%d\n12\t%d\n13\t%d\n14\t%d\n15\t%d\n16\t%d\n17t%d\n18t%d\n"
					+ "19\t%d\n20\t%d\n21\t%d\n22\t%d\n23\t%d\n24\t%d\n25\t%d\n26\t%d\n27\t%d\n28\t%d\n29\t%d\n30\t%d\n31\t%d\n32\t%d\n33\t%d\n34\t%d\n35\t%d\n36\t%d"
					+ "\n37\t%d\n38\t%d\n39\t%d\n40\t%d\n41\t%d\n42\t%d\n43\t%d\n44\t%d\n45\t%d\n46\t%d\n47\t%d\n48\t%d\n49\t%d\n50\t%d\n51\t%d\n52\t%d\n53\t%d\n54\t%d"
					+ "\n55\t%d\n56\t%d\n57\t%d\n58\t%d\n59\t%d\n60\t%d\n",
					frequencia1, frequencia2, frequencia3, frequencia4, frequencia5, frequencia6, frequencia7, frequencia8, frequencia9, frequencia10, 
					frequencia11, frequencia12, frequencia13, frequencia14, frequencia15, frequencia16, frequencia17, frequencia18, frequencia19, frequencia20, 
					frequencia21, frequencia22, frequencia23, frequencia24, frequencia25, frequencia26, frequencia27, frequencia28, frequencia29, frequencia30, 
					frequencia31, frequencia32, frequencia33, frequencia34, frequencia35, frequencia36, frequencia37, frequencia38, frequencia39, frequencia40, 
					frequencia41, frequencia42, frequencia43, frequencia44, frequencia45, frequencia46, frequencia47, frequencia48, frequencia49, frequencia50, 
					frequencia51, frequencia52, frequencia53, frequencia54, frequencia55, frequencia56, frequencia57, frequencia58, frequencia59, frequencia60);
		} else if (numLados == 100) {
			System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n7\t%d\n8\t%d\n9\t%d\n10\t%d\n11\t%d\n12\t%d\n13\t%d\n14\t%d\n15\t%d\n16\t%d\n17t%d\n18t%d\n"
					+ "19\t%d\n20\t%d\n21\t%d\n22\t%d\n23\t%d\n24\t%d\n25\t%d\n26\t%d\n27\t%d\n28\t%d\n29\t%d\n30\t%d\n31\t%d\n32\t%d\n33\t%d\n34\t%d\n35\t%d\n36\t%d"
					+ "\n37\t%d\n38\t%d\n39\t%d\n40\t%d\n41\t%d\n42\t%d\n43\t%d\n44\t%d\n45\t%d\n46\t%d\n47\t%d\n48\t%d\n49\t%d\n50\t%d\n51\t%d\n52\t%d\n53\t%d\n54\t%d"
					+ "\n55\t%d\n56\t%d\n57\t%d\n58\t%d\n59\t%d\n60\t%d\n61\t%d\n62\t%d\n63\t%d\n64\t%d\n65\t%d\n66\t%d\n67\t%d\n68\t%d\n69\t%d\n70\t%d\n71\t%d\n72\t%d"
					+ "\n73\t%d\n74\t%d\n75\t%d\n76\t%d\n77\t%d\n78\t%d\n79\t%d\n80\t%d\n81\t%d\n82\t%d\n83\t%d\n84\t%d\n85\t%d\n86\t%d\n87\t%d\n88\t%d\n89\t%d\n90\t%d"
					+ "\n91\t%d\n92\t%d\n93\t%d\n94\t%d\n95\t%d\n96\t%d\n97\t%d\n98\t%d\n99\t%d\n100\t%d\n",
					frequencia1, frequencia2, frequencia3, frequencia4, frequencia5, frequencia6, frequencia7, frequencia8, frequencia9, frequencia10, 
					frequencia11, frequencia12, frequencia13, frequencia14, frequencia15, frequencia16, frequencia17, frequencia18, frequencia19, frequencia20, 
					frequencia21, frequencia22, frequencia23, frequencia24, frequencia25, frequencia26, frequencia27, frequencia28, frequencia29, frequencia30, 
					frequencia31, frequencia32, frequencia33, frequencia34, frequencia35, frequencia36, frequencia37, frequencia38, frequencia39, frequencia40, 
					frequencia41, frequencia42, frequencia43, frequencia44, frequencia45, frequencia46, frequencia47, frequencia48, frequencia49, frequencia50, 
					frequencia51, frequencia52, frequencia53, frequencia54, frequencia55, frequencia56, frequencia57, frequencia58, frequencia59, frequencia60, 
					frequencia61, frequencia62, frequencia63, frequencia64, frequencia65, frequencia66, frequencia67, frequencia68, frequencia69, frequencia70, 
					frequencia71, frequencia72, frequencia73, frequencia74, frequencia75, frequencia76, frequencia77, frequencia78, frequencia79, frequencia80, 
					frequencia81, frequencia82, frequencia83, frequencia84, frequencia85, frequencia86, frequencia87, frequencia88, frequencia89, frequencia90, 
					frequencia91, frequencia92, frequencia93, frequencia94, frequencia95, frequencia96, frequencia97, frequencia98, frequencia99, frequencia100);
		}
		
		
		
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
