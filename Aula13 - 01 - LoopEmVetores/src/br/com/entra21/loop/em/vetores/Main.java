package br.com.entra21.loop.em.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;
		
		do {
			//Utilizando o do-while pq me permite entrar no bloco antes de testar a condicao de permanencia.
			System.out.println(escreverMenu());
			
			
			option = input.nextByte();
			
			switch(option) {
			case 0:
				System.out.println("Saindo....");
				break;
			case 1:
				exibirTamanhosVetores();
				break;
			case 2:
				exibirTamanhosVetoresInicializados();
				break;
			case 3:
				vetorComCincoParaInicializar();
				break;
			case 4:
				definirTamanhoVetorParaInicializar();
				break;
			case 5:
				percorrerVetorInicializadoCrescenteDecrescente(); //Chamada de método.
				break;
			case 6:
				exibirVetorInteirosNaoInicializado();
				break;
			default:
				System.out.println("Opcao Invalida");
				break;
			}
			//caso a condicao de permanencia seja true, repita o bloco.
		} while(option != 0); //enquanto nao for zero, repita
	}

	public static void exibirTamanhosVetores() {
		
		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];
		
		System.out.println("vetorBytes tamanho = "+vetorBytes.length);
		System.out.println("vetorShorts tamanho = "+vetorShorts.length);
		System.out.println("vetorInts tamanho = "+vetorInts.length);
		System.out.println("vetorLongs tamanho = "+vetorLongs.length);
		System.out.println("vetorChars tamanho = "+vetorChars.length);
		System.out.println("vetorFloats tamanho = "+vetorFloats.length);
		System.out.println("vetorDoubles tamanho = "+vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = "+vetorBooleans.length);
		
	}
	
	public static void exibirTamanhosVetoresInicializados() {
		byte vetorBytes[] = {5,7,9,10};
		short vetorShorts[] = {145,123,234,233,523,143};
		int vetorInts[] = {3000,1235,6233,4123,2435,7819,8299,5534,5656};
		long vetorLongs[] = {320003,304003,504600,780006,500065};
		float vetorFloats[] = {10000.50f,4.5f,64322.8f,84345.9f};
		double vetorDoubles[] = {334342.2d,234344.54d,645454.8d};
		char vetorChars[] = {'a','b','c','d','e','f','0'};
		boolean vetorBooleans[] = {true,false,true,true,false};
		
		System.out.println("vetorBytes tamanho = "+vetorBytes.length);
		System.out.println("vetorShorts tamanho = "+vetorShorts.length);
		System.out.println("vetorInts tamanho = "+vetorInts.length);
		System.out.println("vetorLongs tamanho = "+vetorLongs.length);
		System.out.println("vetorFloats tamanho = "+vetorFloats.length);
		System.out.println("vetorDoubles tamanho = "+vetorDoubles.length);
		System.out.println("vetorChars tamanho = "+vetorChars.length);
		System.out.println("vetorBooleans tamanho = "+vetorBooleans.length);
		
	}
	
	public static void vetorComCincoParaInicializar() {
		byte vetorBytes[] = new byte[5];
		
		Scanner input = new Scanner(System.in);
		
		//para alimentar todas as posicoes
		for(byte count=0;count<vetorBytes.length;count++) {
			System.out.println("Inicializando a posicao "+(count+1)+" no indice "+count+", entre com um valor:");
			vetorBytes[count]=input.nextByte();
		}
		
		//para alimentar apenas as posicoes pares
		/*
			for(byte count=0;count<vetorBytes.length;count+=2) {
			System.out.println("Inicializando a posicao "+(count+1)+" no indice "+count+", entre com um valor:");
			vetorBytes[count]=input.nextByte();
		}
		*/
	}
	
	public static void definirTamanhoVetorParaInicializar() {
				
		Scanner input = new Scanner(System.in);
		
		byte tamanho;
		byte vetorBytes[];
		
		System.out.println("Informe o tamanho do vetor");
		tamanho = input.nextByte();
		
		vetorBytes = new byte[tamanho];
		
		for(byte count=0;count<vetorBytes.length;count++) {
			System.out.println("Informe o valor para o item "+(count+1)+" no indice ["+count+"]");
			vetorBytes[count] = input.nextByte();
		}
		
	}
	
	public static void percorrerVetorInicializadoCrescenteDecrescente() {
		//byte vetorBytes[] = new byte[10]
		byte vetorBytes[] = {12,28,37,59,6};
		
		for(byte count=0;count<vetorBytes.length;count++) {
			System.out.println(vetorBytes[count]);
		}
		System.out.println("-------");
		for(byte count=(byte) (vetorBytes.length-1);count>=0;count--) {
			// comecando com o tamanho -1 porque o indice sempre tem um valor a menos
			// condicao de permanencia, enquanto meu contador for > 0, pq comecei com um valor alto e estou diminuindo
			// valor alto e pretendo parar ao chegar no zero
			// como uma repeticao decrescente utilizo o decremento no contador
			System.out.println(vetorBytes[count]);
		}
		
		
	}
	
	public static void exibirVetorInteirosNaoInicializado() {
		byte vetorBytes[] = new byte[10];
		Scanner input = new Scanner(System.in);
		String resposta;
		byte index=0;
		do {
			System.out.println("Informe um valor para o indice ["+index+"]");
			vetorBytes[index] = input.nextByte();
			
			System.out.println("Gostaria de inicializar outro indice?");
			resposta = input.next();
			
			if(resposta.equalsIgnoreCase("sim")) {
				do {
					System.out.println("Informe um indice valido entre 0 e "+(vetorBytes.length-1));
					index = input.nextByte(); // Se o usuario digitar um valor valido, esse index sera utilizado no meu DO principal, onde a logica se repete.
					
				} while(index<0 || index>=vetorBytes.length); // A posicao escolhida nao pode ser menor que 0 e nem o tamanho do vetor ou superior
				// Exemplo: O range valido e de 0 a 9, qualquer numero alem disson fica preso nesseb loop.
			}
				
		} while(resposta.equalsIgnoreCase("sim"));
		
		for(byte count=0;count<vetorBytes.length;count++) {
			System.out.println("O valor no vetor na posicao "+count+" é "+vetorBytes[count]);
		}
		
	}
	
	public static String escreverMenu() {
		String menu="";
		menu+="Escolha uma opcao do menu de praticas";
		menu+="0 - Sair\n";
		menu+="1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu+="2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu+="3 - Criar 1 vetor de 5 posições, para que o usuário alimente esses valores\n";
		menu+="3 - Criar 1 vetor de 5 posições, para que o usuário alimente esses valores\n";
		menu+="4 - Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o usuário informe os respectivos valores\n";
		menu+="5 - Criar um vetor de inteiros inicializado , para percorrer a)Do inicio ao fim b)Do fim ao inicio c)Para exibir os valores\n";
		menu+="6 - Criar um vetor de inteiros não inicializado:\\r\\n\"\r\n"
				+"\tRepita indefinidamente até que o usuário responda não para a pergunta\r\n"
				+"\t\tGostaria de inicializar o valor de uma das posições entre 1 e TAMANHO?\r\n"
				+"\tCaso responda sim\r\n" + "\t\tCapturar uma posição\r\n"
				+"\t\t\tRepetir a captura enquanto o índice não for válido\r\n"
				+"\tCaso responda não\r\n" + "\t\tSair da repetição de inicializações\r\n"
				+"\t\tExibir todos os valores do vetor";
		
		return menu;
	}

}
