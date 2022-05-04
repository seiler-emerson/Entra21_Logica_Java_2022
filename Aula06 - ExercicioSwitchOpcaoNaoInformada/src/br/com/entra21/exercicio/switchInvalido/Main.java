package br.com.entra21.exercicio.switchInvalido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
System.out.println("Escreva um menu de opções e trate a situação onde o usuário não escolha uma opção informada na lista  ");
		
		byte opcoes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual destino você escolheria? ");
		System.out.println("Escolha uma opção: ");
		System.out.println("1 = Minas Gerais");
		System.out.println("2 = Santa Catarina");
		System.out.println("3 = Amazonia");
		System.out.println("4 = Ceara");
		
		opcoes = entrada.nextByte();
		
		switch(opcoes) {
		case 1:
			System.out.println("Você escolheu Minas Gerais!");
			break;
		case 2:
			System.out.println("Você escolheu Santa Catarina!");
			break;
		case 3:
			System.out.println("Você escolheu Amazonia!");
			break;
		case 4:
			System.out.println("Você escolheu Ceara!");
			break;
		default:
			System.out.println("Escolha uma opção valida.");
			break;
		}

	}

}
