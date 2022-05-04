package br.com.entra21.exercicio.switchestacoes.ano;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Exiba em tela uma lista de opções para o usuário escolher e para cada escolha retornar uma mensagem diferente. ");
		
		byte opcoes;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Qual é a sua estação do ano favorita? ");
		System.out.println("Escolha uma opção: ");
		System.out.println("1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Verão");
		
		opcoes = entrada.nextByte();
		
		switch(opcoes) {
		case 1:
			System.out.println("As flores aparecem!");
			break;
		case 2:
			System.out.println("O inverno está chegando!");
			break;
		case 3:
			System.out.println("É hora de se agasalhar!");
			break;
		case 4:
			System.out.println("AA o verããão!");
			break;
		default:
			System.out.println("Escolha uma opção valida.");
			break;
		}
	}

}
