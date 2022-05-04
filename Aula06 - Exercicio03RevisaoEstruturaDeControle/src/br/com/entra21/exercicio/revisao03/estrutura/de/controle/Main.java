package br.com.entra21.exercicio.revisao03.estrutura.de.controle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Escreva um programa que:
//			Solicite ao usuário o seu nome e o mês de seu aniversário
//			A captura do mês deve ser por numero
//			Exibir uma mensagem com o nome e o mês no formato normal (Ex: 4  Abril, 12 Dezembro)
//			Caso não seja escolhido um mês válido deve exibir uma mensagem 
		
		String nomeUsuario;
		byte mes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nomeUsuario = entrada.nextLine();
		
		System.out.println("Qual o mês do seu aniversário?");
		System.out.println("Selecione o número correspondente: ");
		System.out.println("1 - Janeiro");
		System.out.println("2 - Fevereiro");
		System.out.println("3 - Março");
		System.out.println("4 - Abril");
		System.out.println("5 - Maio");
		System.out.println("6 - Junho");
		System.out.println("7 - Julho");
		System.out.println("8 - Agosto");
		System.out.println("9 - Setembro");
		System.out.println("10 - Outubro");
		System.out.println("11 - Novembro");
		System.out.println("12 - Dezembro");
		
		mes = entrada.nextByte();
		
		switch (mes) {
		case 1:
			System.out.println("Você nasceu em Janeiro");
			break;
		case 2:
			System.out.println("Você nasceu em Fevereiro");
			break;
		case 3:
			System.out.println("Você nasceu em Março");
			break;
		case 4:
			System.out.println("Você nasceu em Abril");
			break;
		case 5:
			System.out.println("Você nasceu em Maio");
			break;
		case 6:
			System.out.println("Você nasceu em Junho");
			break;
		case 7:
			System.out.println("Você nasceu em Julho");
			break;
		case 8:
			System.out.println("Você nasceu em Agosto");
			break;
		case 9:
			System.out.println("Você nasceu em Setembro");
			break;
		case 10:
			System.out.println("Você nasceu em Outubro");
			break;
		case 11:
			System.out.println("Você nasceu em Novembro");
			break;
		case 12:
			System.out.println("Você nasceu em Dezembro");
			break;
		default:
			System.out.println("Digite uma opção válida.");
		}

	}

}
