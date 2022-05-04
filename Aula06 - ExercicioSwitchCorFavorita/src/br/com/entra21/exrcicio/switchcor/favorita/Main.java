package br.com.entra21.exrcicio.switchcor.favorita;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Exiba em tela uma lista de opções para o usuário escolher e para cada escolha retornar uma mensagem diferente. ");
		
		String opcoes;
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Qual é a sua cor favorita? ");
		System.out.println("Digite o nome da cor escolhida: \nVerde\nAzul\nAmarelo\nVermelho");
//		System.out.println("verde");
//		System.out.println("azul");
//		System.out.println("amarelo");
//		System.out.println("vermelho");
		
		opcoes = entrada.next();
		opcoes = opcoes.toLowerCase();
		
		switch(opcoes) {
		case "verde":
			System.out.println("A cor da natureza!");
			break;
		case "azul":
			System.out.println("A cor do céu!");
			break;
		case "amarelo":
			System.out.println("Essa é pra animar!");
			break;
		case "vermelho":
			System.out.println("A cor do sangue!");
			break;
		default:
			System.out.println("Escolha uma opção valida.");
			break;
		}

	}

}
