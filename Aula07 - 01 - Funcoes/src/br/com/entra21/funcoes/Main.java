package br.com.entra21.funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String opcao;

		System.out.println("Quero executar o assunto abaixo:");
		System.out.println("1 - Procedimento");
		System.out.println("2 - Parametros");
		System.out.println("3 - Retornos");
		System.out.println("4 - Completos");
		System.out.println("11 - Exercicio1");
		System.out.println("12 - Exercicio2");
		System.out.println("1 - Procedimentos");
		opcao = entrada.nextLine();

		switch (opcao.toLowerCase()) {

		case "1":
		case "procedimento":
			verProcedimentos();
			verProcedimentos();
			break;

		case "2":
		case "parametros":
			verParametros(2);
			verParametros(18);
			verParametros(17);
			verMaisParametros(opcao, "rubem", 10);
			verMaisParametros(opcao, "teste", 200);
			break;
		case "3":
		case "retorno":
			byte retorno = retornarValorInteiro();
			System.out.println("Esse metodo retornou " + retornarValorInteiro());
			if (retornarValorInteiro() < 20) {
				System.out.println("Retornou menor que 20.");
			} else {
				System.out.println("Retornou maior ou igual a 20.");
			}
			break;
		case "4":
		case "completo":
			calcularDivisao(8,4); //Retorno está aqui, pega qum quiser.
			float entradaA,entradaB;
			System.out.println("Informe o primeiro float");
			entradaA= entrada.nextFloat();
			System.out.println("Informe o segundo float");
			entradaB= entrada.nextFloat();
			float calculo = calcularDivisao(entradaA,entradaB);
			System.out.println("Resultou em "+calculo);
			break;
		case "11":
		case "exercicio1":
			float nota1,nota2,nota3,media;
			System.out.println("");
			break
		default:
			System.out.println("Não tem essa opção no menu.");
			break;
		}

	}

	// declaração da função
	// as regras de uso e como
	public static void capturarFrase() {
		System.out.println("Escreva uma frase...");
		System.out.println("-------------------------");
		System.out.println("- ENTER PARA SALVAR -");
		System.out.println("-------------------------");
	}

	public static void verProcedimentos() {

		Scanner entrada = new Scanner(System.in);

		String frase;

		// chamada da função, onde eu passo os argumentos caso precise.
		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("Você disse :" + frase);

		// chamada da função, onde eu passo os argumentos caso precise.
		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("Você disse :" + frase);

		// chamada da função, onde eu passo os argumentos caso precise.
		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("Você disse :" + frase);
	}

	public static void verParametros(int numero) {
		System.out.println("Você me passou por parâmetro o número: " + numero);
		if (numero % 2 == 0) {
			System.out.println("Que legal e esse número ainda é par.");
		} else {
			System.out.println("Que legal e esse número ainda é impar.");
		}
	}

	public static void verMaisParametros(String escolha, String nome, int numero) {
		System.out.println("Recebi isso tudo de vc: ");
		System.out.println(escolha);
		System.out.println(nome);
		System.out.println(numero);

		if (numero < 100) {
			System.out.println("Menor que 100.");
		} else {
			System.out.println("É maior ou igual a 100.");
		}
	}

	public static byte retornarValorInteiro() {
		byte variavelParaRetorno = 15;
		System.out.println("Aqui sempre retornando 15, pq não tenho parametros para deixar dinâmico.");
		return variavelParaRetorno;
	}
	
	public static float calcularDivisao(float numeroA, float numeroB) {
		System.out.println("O calculo esta sendo executado e se quiser pegue o retorno.");
		return numeroA/numeroB;
	}
}
