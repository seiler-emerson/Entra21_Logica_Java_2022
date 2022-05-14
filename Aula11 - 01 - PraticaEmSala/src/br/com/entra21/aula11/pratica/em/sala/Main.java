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
			System.out.println("6");
			System.out.println("7");
			System.out.println("8");
			System.out.println("9 - solicite a quantidade de notas e calcule a média do aluno");
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

	public static void calculandoSoma() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter,  " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter);

		}
	}

	public static void runRepeat20() {
		for (byte counter = 1; counter <= 20; counter++) {
			System.out.print("Eu gosto de estudar Algoritmos " + (counter % 5 == 0 ? "\n" : ""));
			/*
			 * if(counter%5==0) { System.out.print("\n"); }
			 */
		}
	}

	public static void sumAge() {
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

	public static void maioresDeIdade() {
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

	public static void exibirMaisNovo() {
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

	public static void exerciseOito() {

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

	public static void mediaAlunos() {
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
