package br.com.entra21.exercicio.switchInvalido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
System.out.println("Escreva um menu de op��es e trate a situa��o onde o usu�rio n�o escolha uma op��o informada na lista  ");
		
		byte opcoes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual destino voc� escolheria? ");
		System.out.println("Escolha uma op��o: ");
		System.out.println("1 = Minas Gerais");
		System.out.println("2 = Santa Catarina");
		System.out.println("3 = Amazonia");
		System.out.println("4 = Ceara");
		
		opcoes = entrada.nextByte();
		
		switch(opcoes) {
		case 1:
			System.out.println("Voc� escolheu Minas Gerais!");
			break;
		case 2:
			System.out.println("Voc� escolheu Santa Catarina!");
			break;
		case 3:
			System.out.println("Voc� escolheu Amazonia!");
			break;
		case 4:
			System.out.println("Voc� escolheu Ceara!");
			break;
		default:
			System.out.println("Escolha uma op��o valida.");
			break;
		}

	}

}
