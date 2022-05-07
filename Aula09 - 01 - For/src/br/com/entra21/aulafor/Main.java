package br.com.entra21.aulafor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre for");
		String opcao;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sobre o for escolhe uma opção para aprender mais");
		System.out.println("1 - for simples");
		System.out.println("2 - for dentro de for");
		System.out.println("3 - Solicite ao usuário uma quantidade inicial e final, para exibir em tela a repetição do inicio até o final");
		System.out.println("4 - Solicite ao usuário um valor numero para exibir a contagem regressiva até o zero");
		System.out.println("5 - Retorne a tabuada do numero escolhido");
		System.out.println("6 - Retornar todas as tabuadas de 1 até a tabuada do numero informado pelo usuário");
		opcao = entrada.nextLine();
		
		switch(opcao.toLowerCase()) {
		case "1","for simples":
			//função aula for simples
			aulaForSimples(); //funcao do tipo procedimento nao tem argumento e nem retorno
			break;
		case "2":
			//olha veio por numero
		case "for dentro de for":
			//funcao aula complexa
			aulaForDentroDeFor(); //funcao do tipo procedimento nao tem argumento e nem retorno
			break;
		case "3":
			exercicioForLimite();
			break;
		case "4":
			contagemForRegressiva();
			break;
		case "5":
			System.out.println("Informe um numero para saber a sua tabuada");
			retornarTabada(entrada.nextInt());
			break;
		case "6":
			exibirTodasAsTabuadas();
			break;
		}
		
	}

	public static void aulaForSimples() {
		System.out.println("Aprendendo sobre for da maneira simples");
		
		for(int contador1=1;contador1<=10;contador1 = contador1 +1) {
			System.out.println("Repetindo "+contador1);
		}
		
		System.out.println("===================");
		
		for(int contador2=1;contador2<=10;contador2+=2) {
			System.out.println("Repetindo "+contador2);
			//System.out.println("Repetindo "+contador1);
			//Não é possível usar a variavel contador1 pois ela só existe no outro escopo do for.
		}
		
		System.out.println("===================");
		
		for(int contador3=4;contador3<=10;contador3+=2) {
			System.out.println("Repetindo "+contador3);
			
		}
		
		System.out.println("===================");
		
		int numero=3;
		int contador;
		for(contador = 1; contador <= 10; contador++) {
			System.out.println("Tabuada | "+contador + " x = " +(numero*contador));
			
		}
		
		System.out.println("Olha como ficou o contador: "+contador);
		
	}
	
	public static void aulaForDentroDeFor() {
		System.out.println("Aprendendo sobre for da maneira mais complexa");
		
		byte nivelMaior=5,nivelDetalhe=10;
		
		for(int contador=1; contador<=nivelMaior;contador++) {
			System.out.println("Para o nivel maior repetindo pela "+contador+" vez");
			
			for(int contadorInterno=1;contadorInterno<=nivelDetalhe;contadorInterno++) {
				System.out.println("\tPara o nivel detalhe repetindo pela "+contadorInterno+" vez");
			}
		}
				
	}
	
	public static void exercicioForLimite() {
		Scanner entrada = new Scanner(System.in);
		
		byte limite;
		
		System.out.println("Ate qual numero voce quer contar?");
		limite = entrada .nextByte();
		System.out.println("");
		
		for(int contador=1;contador<=limite; contador++) {
			System.out.println("Contando: "+contador);
		}
	}
	
	public static void contagemForRegressiva() {
		byte numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número para realizar a contagem regressiva.");
		
		numero = entrada.nextByte();
		
		for (int contador=numero;contador>0;contador--) {
			System.out.println("Contagem regressiva: "+contador);
		}
	}
	
	public static void retornarTabada(int numero) {
		
		for (int contador=1;contador<=10;contador++) {
			System.out.println(numero+" x "+contador+" = " + (contador*numero));
		}
	}
	
	public static void exibirTodasAsTabuadas() {
		for(int numero=1; numero<=10;numero++) {
			System.out.println("Quero ver a tabuada do "+numero);
			for(int contador=1;contador<=10;contador++) {
				System.out.println(numero+" x "+contador+" = " + (contador*numero));
			}
		}
	}
}
