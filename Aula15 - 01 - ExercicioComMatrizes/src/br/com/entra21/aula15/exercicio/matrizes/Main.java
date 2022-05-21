package br.com.entra21.aula15.exercicio.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		byte option;
		
		do {
			System.out.println(escreverMenu());
			option = input.nextByte();
			
			switch(option) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				criarMatriz2Niveis();
				break;
			case 2:
				initializeMatrizTwoLevel();
				break;
			case 3:
				criarMatriz5Vetores3posicoes();
				break;
			case 4:
				solicitarTamanhoMatrizParaPreencher();
				break;
			case 5:
				percorrerMatriz();
				break;
			case 6:
				atribuirAleatoriamenteValoresDetalheVetores();
				break;
			default:
				System.out.println("Digite uma opcao valida!");
				break;
			}
			
		} while(option!=0);
		
		
	}

	public static String escreverMenu() {
		String menu = "";
		menu +="\t0 - Sair\n";
		menu+="\t1 - Criar matriz de 2 níveis\n";
		menu+="\t2 - Criar matrizes de 2 níveis inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu+="\t3 - Criar 1 matriz de 5 posições com 3 itens de capacidade, para que o usuário alimente esses valores\n";
		menu+="\t4 - Criar uma matriz com o tamanho  e capacidade informada pelo usuário e depois solicitar que o usuário informe os respectivos valores\n";
		menu+="\t5 - Criar uma matriz de inteiros inicializado , para percorrer\n"
				+ "\t\t5.1 - Do inicio ao fim\r\n"
				+ "\t\t5.2 - Do fim ao inicio\r\n"
				+ "\t\t5.3 - Para exibir os valores\n";
		menu+="\t6 - Criar uma matriz de inteiros não inicializado\r\n"
				+ "\t\tRepita indefinidamente até que o usuário responda não para a pergunta\r\n"
				+ "\t\t\tGostaria de inicializar o valor de uma das posições entre 1 e TAMANHO?\r\n"
				+ "\t\tCaso responda sim\r\n"
				+ "\t\t\tCapturar todos os valores para aquele índice\r\n"
				+ "\t\t\t\tRepetir a captura até o fim da capacidade do índice\r\n"
				+ "\t\tCaso responda não\r\n"
				+ "\t\t\tSair da repetição de inicializações\r\n"
				+ "\t\t\tExibir todos os valores da matriz";
		return menu;
	}
	
	public static void criarMatriz2Niveis() {

		char matrizChars[][] = new char[2][3]; // 2 vetores onde cada um pode armazenar 3 valores
		boolean matrizBooleans[][];
		matrizBooleans = new boolean[2][4]; // dois valores onde cada um pode armazenar 4 valores
		byte matrizBytes[][] = new byte[12][3];
		short matrizShort[][] = new short[2][11];
		int matrizInt[][] = new int[3][2];
		long matrizLongs[][] = new long[3][5];
		
		float matrizFloats[][] = new float[3][4];
		double matrizDoubles[][] = new double[5][4];
		
		System.out.println("matrizChars tamanho = "+matrizChars.length+" e cada vetor tem tamanho +"+matrizChars[0].length);
		System.out.println("matrizBooleans tamanho = "+matrizBooleans.length+" e cada vetor tem tamanho +"+matrizBooleans[0].length);
		System.out.println("matrizBytes tamanho = "+matrizBytes.length+" e cada vetor tem tamanho +"+matrizBytes[0].length);
		System.out.println("matrizShort tamanho = "+matrizShort.length+" e cada vetor tem tamanho +"+matrizShort[0].length);
		System.out.println("matrizInt tamanho = "+matrizChars.length+" e cada vetor tem tamanho +"+matrizInt[0].length);
		System.out.println("matrizLongs tamanho = "+matrizLongs.length+" e cada vetor tem tamanho +"+matrizLongs[0].length);
		System.out.println("matrizFloats tamanho = "+matrizFloats.length+" e cada vetor tem tamanho +"+matrizFloats[0].length);
		System.out.println("matrizDoubles tamanho = "+matrizDoubles.length+" e cada vetor tem tamanho +"+matrizDoubles[0].length);
	}
	
	public static void initializeMatrizTwoLevel() {
		//Criar matrizes de 2 níveis inicializados para cada tipo primitivo e exibir o tamanho deles no console
		
		char matrizChars[][] = { //Irregular porque tem  capacidades de index diferentes por vetor
				{'A','E','V'},
				{'R','D','O'},
				{'F','F','C','A'},
		};

		boolean matrizBoolean[][] = { //Regular porque tem a mesma capacidade de index por vetor
				{true,false,true,false},
				{true,false,true,false},
				{true,false,true,false},
		};
		
		byte matrizBytes[][] = { //Irregular porque tem  capacidades de index diferentes por vetor
				{1,20,3,40,5},
				{20,3,40,5},
				{3,45},
				{120},
		};
		
		short matrizShorts[][] = {
				{300,400,1200},
				{500,600,100},
				{1000,4000,5000},
		};
		
		int matrizInts[][] = {
				{3100},
				{5030},
				{10000},
		};
		
		long matrizLongs[][] = {
				{300,400,500,600},
				{1000000,5000000,300},
				{10000,10000},
		};
		
		float matrizFloats[][] = {
				{30.0f,40.5f,5.6f,6.1f},
				{10.7f,53.f,31.4f},
				{11.f,14.3f},
		};
		
		double matrizDoubles[][] = {
				{310.0f,420.5f,53.6f,62.1f},
				{102.7f,543.f,321.4f},
				{1134.f,1434.3f},
		};
		
//		for(byte vetor=0;vetor<matrizChars.length;vetor++) {
//			
//			for(byte detail=0;detail<matrizChars[vetor].length;vetor++) {
//				
//				matrizChars[vetor][detail] = 'x';
//			}
//			
//		}
		
	}
	
	public static void criarMatriz5Vetores3posicoes() {
		byte matrizBytes[][] = new byte[5][3];
		
		// ======================  PRIMEIRO VETOR  ======================
		System.out.println("Para o primeiro vetor, informe o primeiro valor:");
		matrizBytes[0][0] = input.nextByte();
		
		System.out.println("Para o primeiro vetor, informe o segundo valor:");
		matrizBytes[0][1] = input.nextByte();
		
		System.out.println("Para o primeiro vetor, informe o terceiro valor:");
		matrizBytes[0][2] = input.nextByte();
		
		// ======================  SEGUNDO VETOR  ======================
		System.out.println("Para o segundo vetor, informe o primeiro valor:");
		matrizBytes[1][0] = input.nextByte();
		
		System.out.println("Para o segundo vetor, informe o segundo valor:");
		matrizBytes[1][1] = input.nextByte();
		
		System.out.println("Para o segundo vetor, informe o terceiro valor:");
		matrizBytes[1][2] = input.nextByte();
		
		//DEMAIS VETORES
		for(byte vetor=2;vetor<matrizBytes.length;vetor++) { //[2][3][4] Continuando a captura com o for
			for(byte detalhe=0;detalhe<matrizBytes[vetor].length;detalhe++) {
				System.out.println("Para o "+(vetor+1)+" vetor, informe o "+(detalhe+1)+"º valor:");
				matrizBytes[vetor][detalhe] = input.nextByte();				
			}
			
		}
		
	}
	
	public static void solicitarTamanhoMatrizParaPreencher() {
		byte tamanhoVetor,tamanhoDetalhe;
		byte matrizBytes[][];
		
		System.out.println("Quantos vetores voce quer na sua matriz?");
		tamanhoVetor = input.nextByte();
		
		System.out.println("Quantos itens voce quer em cada vetor?");
		tamanhoDetalhe = input.nextByte();
		
		matrizBytes = new byte[tamanhoVetor][tamanhoDetalhe];
		
		for(byte vetor=0;vetor<matrizBytes.length;vetor++) {
			for(byte detalhe=0;detalhe<matrizBytes[vetor].length;detalhe++) {
				System.out.println("Para o indice ["+vetor+"] detalhe ["+detalhe+"] informe o valor:");
				matrizBytes[vetor][detalhe] = input.nextByte();				
			}
			
		}
		
		for(byte vetor=0;vetor<matrizBytes.length;vetor++) {
			for(byte detalhe=0;detalhe<matrizBytes[vetor].length;detalhe++) {
				System.out.println("Para o indice ["+vetor+"] detalhe ["+detalhe+"] ==> "+ matrizBytes[vetor][detalhe]);		
			}
			
		}
	}
	
	public static void percorrerMatriz() {
		// Criar uma matriz de inteiros inicializado , para percorrer
		// Do inicio ao fim
		// fim ao inicio
		// Para exibir os valores
		
		byte matrizBytes[][]= {
				{1,3,5,7,6},
				{11,13,51,72,26},
				{15,32,15,71,21},
				{61,63,56,79,60},
		};
		
		System.out.println("PERCORRER DO INICIO AO FIM");
		// PERCORRER DO INICIO AO FIM
		for(byte vetor=0;vetor<matrizBytes.length;vetor++) {
			for(byte detalhe=0;detalhe<matrizBytes[vetor].length;detalhe++) {
				System.out.println("Percorrendo vetor "+vetor+", index "+detalhe+" com valor armazenado "+matrizBytes[vetor][detalhe]);				
			}
		}
		System.out.println("");
		System.out.println("PERCORRER DO FIM AO INICIO");
		// PERCORRER DO FIM AO INICIO
		for(int vetorInvertido=matrizBytes.length-1;vetorInvertido>=0;vetorInvertido--) {
			for(int detalheInvertido=matrizBytes[vetorInvertido].length-1;detalheInvertido>=0;detalheInvertido--) {
				System.out.println("Percorrendo vetor "+vetorInvertido+", index "+detalheInvertido+" com valor armazenado "+matrizBytes[vetorInvertido][detalheInvertido]);				
			}
		}
	}
	
	public static void atribuirAleatoriamenteValoresDetalheVetores() {
		byte matrizBytes[][] = new byte[30][10];
		String resposta;
		byte vetor=0,detalhe=0;
		
		do {
			System.out.println("Para o vetor "+vetor+" e detalhe "+detalhe+" informe o valor:");
			
			matrizBytes[vetor][detalhe] = input.nextByte();
			
			System.out.println("Gostaria de inicializar outro valor?");
			resposta = input.next();
			if(resposta.equalsIgnoreCase("sim")) {
				System.out.println("Qual vetor você quer acessar?");
				vetor = input.nextByte();
				System.out.println("Qual detalhe desse vetor voce quer atualizar o valor");
				detalhe = input.nextByte();
			}
			
		} while(resposta.equalsIgnoreCase("sim"));
	}
}
