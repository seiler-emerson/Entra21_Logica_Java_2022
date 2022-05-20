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
	
}
