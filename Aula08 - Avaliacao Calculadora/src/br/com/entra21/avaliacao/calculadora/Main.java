package br.com.entra21.avaliacao.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// PROGRAMA 02
		// Crie um programa que fa�a v�rios c�lculos
		// Informe qual opera��o matem�tica deseja realizar
		// caso informe 0 deve encerrar o programa
		// 1 = somar
		// 2 = subtrair
		// 3 = multiplicar
		// 4 = dividir
		// Capturar os 2 valores e informar o resultado e esperar o pr�ximo calculo
		
		System.out.println("|=================================================|");
		System.out.println("|================== CALCULADORA ==================|");
		System.out.println("|=================================================|");
		
		calculadora();
		
	}
	
	public static void calculadora() {
		String opcaoCalculo;
		float numeroA, numeroB;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Voc� escolheu calcular, digite o primeiro n�mero:");
		numeroA = entrada.nextFloat();
		System.out.println("|-------------------------------------------------|");
		System.out.println("Digite o segundo n�mero:");
		numeroB = entrada.nextFloat();
		System.out.println("|-------------------------------------------------|");

		System.out.println("Selecione uma opera��o matem�tica:");
		System.out.println("1 - Soma\n2 - Subtraca\n3 - Divisao\n4 - Multiplicacao\n0 - Encerrar Aplicacao");
		opcaoCalculo = entrada.next();
		System.out.println("|-------------------------------------------------|");

		switch (opcaoCalculo.toLowerCase()) {
		case "1":
		case "soma":
			System.out.println("O resultado da soma  entre " + numeroA + " e " + numeroB + " � " + somar(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "2":
		case "subtracao":
			System.out.println("O resultado da subtra��o  entre " + numeroA + " e " + numeroB + " � "
					+ subtrair(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "3":
		case "divisao":
			System.out.println("O resultado da divis�o  entre " + numeroA + " e " + numeroB + " � " + dividir(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "4":
		case "multiplicacao":
			System.out.println("O resultado da subtra��o  entre " + numeroA + " e " + numeroB + " � "
					+ multiplicar(numeroA, numeroB));
			System.out.println("");
			novoCalculo();
			break;
		case "0":
		case "encerrar":
			System.out.println("Programa Finalizado!");
			break;
		default:
			System.out.println("Digite uma op��o v�lida.");
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
