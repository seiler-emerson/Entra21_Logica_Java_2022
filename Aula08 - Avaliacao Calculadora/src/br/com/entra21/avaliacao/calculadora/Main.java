package br.com.entra21.avaliacao.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// PROGRAMA 02
		// Crie um programa que faça vários cálculos
		// Informe qual operação matemática deseja realizar
		// caso informe 0 deve encerrar o programa
		// 1 = somar
		// 2 = subtrair
		// 3 = multiplicar
		// 4 = dividir
		// Capturar os 2 valores e informar o resultado e esperar o próximo calculo
		
		System.out.println("|=================================================|");
		System.out.println("|================== CALCULADORA ==================|");
		System.out.println("|=================================================|");
		
		calculadora();
		
	}
	
	public static void calculadora() {
		String opcaoCalculo;
		float numeroA, numeroB;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Você escolheu calcular, digite o primeiro número:");
		numeroA = entrada.nextFloat();
		System.out.println("|-------------------------------------------------|");
		System.out.println("Digite o segundo número:");
		numeroB = entrada.nextFloat();
		System.out.println("|-------------------------------------------------|");

		System.out.println("Selecione uma operação matemática:");
		System.out.println("1 - Soma\n2 - Subtraca\n3 - Divisao\n4 - Multiplicacao\n0 - Encerrar Aplicacao");
		opcaoCalculo = entrada.next();
		System.out.println("|-------------------------------------------------|");

		switch (opcaoCalculo.toLowerCase()) {
		case "1":
		case "soma":
			System.out.println("O resultado da soma  entre " + numeroA + " e " + numeroB + " é " + somar(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "2":
		case "subtracao":
			System.out.println("O resultado da subtração  entre " + numeroA + " e " + numeroB + " é "
					+ subtrair(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "3":
		case "divisao":
			System.out.println("O resultado da divisão  entre " + numeroA + " e " + numeroB + " é " + dividir(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "4":
		case "multiplicacao":
			System.out.println("O resultado da subtração  entre " + numeroA + " e " + numeroB + " é "
					+ multiplicar(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "0":
		case "encerrar":
			System.out.println("Programa Finalizado!");
			break;
		default:
			System.out.println("Digite uma opção válida.");
			calculadora();
			break;
		}
	}
	
	public static float somar(float numeroA, float numeroB) {
		return numeroA + numeroB;
	}

	public static float subtrair(float numeroA, float numeroB) {
		return numeroA - numeroB;
	}

	public static float dividir(float numeroA, float numeroB) {
		return numeroA / numeroB;
	}

	public static float multiplicar(float numeroA, float numeroB) {
		return numeroA * numeroB;
	}
	
	public static void novoCalculo() {
		Scanner entrada = new Scanner(System.in);
		String opcaoCalculo,novoCalculo;
		
		System.out.println("Deseja fazer um novo caculo?\n1 - Sim\n2 - Nao");
		novoCalculo = entrada.nextLine();
		novoCalculo = novoCalculo.toLowerCase();
		
		switch(novoCalculo) {
		case "1":
		case "sim":
			calculadora();
			break;
		case "2":
		case "nao":
			System.out.println("Programa Finalizado!");
			break;
		default:
			System.out.println("Resposta Invalida!\nPrograma Finalizado!");
			break;
		}
	}

}
