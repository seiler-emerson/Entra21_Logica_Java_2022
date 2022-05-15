package br.com.entra21.aula11.pratica.em.sala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("\nEscolha uma das opções: ");
			System.out.println("0 - \"SAIR\"");
			System.out.println("1 - Calculando a soma");
			System.out.println("2 - Escrevendo mensagem 20 vezes");
			System.out.println("3 - Entre 20 pessoas exibir a soma das idades");
			System.out.println("4 - Quantas pessoas são maiores de idade?");
			System.out.println("5 - Entre 10 pessoas, quem é o mais novo?");
			System.out.println("6 - Entre os numeros digitados quantos sao pares?");
			System.out.println("7 - Entre os numeros digitados quantos estao no intervalo de 0 a 100?");
			System.out.println("8 - Soma de numeros");
			System.out.println("9 - Solicite a quantidade de notas e calcule a média do aluno");
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				calculandoSoma();
				break;
			case 2:
				runRepeat20();
				break;
			case 3:
				sumAge();
				break;
			case 4:
				maioresDeIdade();
				break;
			case 5:
				exibirMaisNovo();
			case 6:
				pairNumbers();
				break;
			case 7:
				amongHundred();
				break;
			case 8:
				exerciseOito();
				break;
			case 9:
				mediaAlunos();
				break;

			default:
				System.out.println("Por favor, escolha uma opção válida");
				break;
			}

		} while (option != 0);

		System.out.println("Obrigado por executar o programa Lista de Exercícios!");

	}

	public static void calculandoSoma() { // EXERCICIO 01
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter,  " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter);

		}
	}

	public static void runRepeat20() { // EXERCICIO 02
		for (byte counter = 1; counter <= 20; counter++) {
			System.out.print("Eu gosto de estudar Algoritmos " + (counter % 5 == 0 ? "\n" : ""));
			/*
			 * if(counter%5==0) { System.out.print("\n"); }
			 */
		}
	}

	public static void sumAge() { // EXERCICIO 03
		int sumAge = 0;
		byte age;
		Scanner input = new Scanner(System.in);

		for (byte count = 1; count <= 20; count++) {
			System.out.println("No momento a soma está em " + sumAge);
			System.out.println("Por favor, insira a idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;
		}
		System.out.println("A soma total das idades foi " + sumAge);
	}

	public static void maioresDeIdade() { // EXERCICIO 04
		System.out.println("Exibir apenas os maiores de idade");
		byte maiores = 0;
		byte idade, count;
		Scanner input = new Scanner(System.in);
		for (count = 1; count <= 20; count++) {
			System.out.println("Informe a idade da pessoa " + count);
			idade = input.nextByte();

			if (idade >= 18) {
				maiores++;
				System.out.println("A última pessoa informada era maior de idade.");
			}
		}
		System.out.println("Entre " + (count - 1) + " pessoas, apenas " + maiores + " são maiores de idade.");
	}

	public static void exibirMaisNovo() { // EXERCICIO 05
		Scanner input = new Scanner(System.in);
		String name, youngerName = "";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 10; count++) {
			System.out.println("Digite o nome: ");
			name = input.next();
			System.out.println("Digite sua idade " + name);
			age = input.nextByte();

			// no primeiro laco sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro, por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo laco comparar com ageMinimal
				System.out.println("Estou no laço " + count + " e preciso verificar.");
				if (age < ageMinimal) {
					System.out.println("Ainda bem que testei porque a pessoa mais nova é " + name + " com " + age);
					ageMinimal = age;
					youngerName = name;
				}
			}
		}
		System.out.println(youngerName + " tem " + ageMinimal + " e é o mais novo(a).");
	}

	public static void pairNumbers() { // EXERCICIO 06
		// Escreva um algoritmo que leia 20 números do usuário e exiba quantos números
		// são pares

		Scanner input = new Scanner(System.in);
		int number = 0;
		byte isPair = 0;

		for (byte count = 1; count <= 20; count++) {
			System.out.println("Por favor, digite um numero:");
			number = input.nextInt();
			if (number % 2 == 0) {
				System.out.println("O numero " + number + " digitado e par");
				isPair += 1;
			} else {
				System.out.println("O numero " + number + " digitado nao e par");
			}
		}

		System.out.println("Dos 20 numeros digitados, " + isPair + " sao pares.");

	}

	public static void amongHundred() {// EXERCICIO 07
		// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão
		// entre 0 e 100

		Scanner input = new Scanner(System.in);

		int number = 0;
		byte among100 = 0;

		for (byte count = 1; count <= 20; count++) {
			System.out.println("Por favor, digite um numero:");
			number = input.nextInt();
			if (number > 0 && number <= 100) {
				System.out.println("O numero "+number+" digitado esta entre 0 e 100.");
				among100 += 1;
			} else {
				System.out.println("O numero digitado nao esta entre 0 e 100.");
			}
		}
		
		System.out.println("Dos 20 numeros digitados, " + among100 + " estao nos intervalo de 0 a 100.");

	}

	public static void exerciseOito() { // EXERCICIO 08

		// Escreva um algoritmo que leia uma sequência de números do usuário e realize a
		// soma desses números. Encerre a execução quando um número negativo for
		// digitado.

		Scanner inPut = new Scanner(System.in);
		int number, sum = 0; // se não inicializa um valor na váriavel ela fica com lixo da memória.

		do {

			System.out.println("What number do you want?");
			number = inPut.nextInt();
			if (number >= 0) {
				sum = sum + number;
			} // somente números positivos serão somados, ou números naturais.

		} while (number >= 0); // enquanto o número for maior que zero repita

		System.out.println("Your sum is: " + sum);

	}

	public static void mediaAlunos() { // EXERCICIO 09
		Scanner input = new Scanner(System.in);
		byte qtd, contador = 0;
		float nota, soma = 0f;
		String resposta;
		System.out.println("Quantas notas você quer capturar? ");
		qtd = input.nextByte();

		do {
			contador++;
			System.out.println("Informe uma nota");
			nota = input.nextFloat();
			if (contador >= qtd) {
				System.out.println("Gostaria de capturar mais alguma nota?");
				resposta = input.next();
				if (resposta.equals("sim")) {
					contador--;
				}
			}

			soma = soma + nota;
		} while (contador <= qtd);
		System.out.println(soma);
	}

}
