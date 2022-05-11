package br.com.entra21.aula10while;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\t0 - sair\n\t1 - while\n\t2 - do-while");
		System.out.println("Escolha uma opção:");
		
		switch(new Scanner(System.in).next().toLowerCase()) {
		
		case "socorro":
			System.exit(0);
		case "0","sair":
			System.out.println("Escolheu sair");
			break;
		case "1","while":
			aprenderWhile();
			break;
		case "2","do-while":
			aprenderDoWhile();
			break;
		default:
			System.out.println("Opção inválida");
			main(null);
			break;
		}
	}

	private static void aprenderWhile() {
		System.out.println("Vamos aprender o WHILE aqui.");
		byte contagem=1;
		while(contagem<=10) { //Condicao de permanencia.
			System.out.println("Contando "+contagem);
			contagem++;
		}
		//Para fazer uma repetição uma contagem com base em uma quantidade é gerado muito código.
		System.out.println("Acabei");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja iniciar uma repetição");
		String resposta = entrada.next();
		while(resposta.equalsIgnoreCase("continuar") || resposta.toLowerCase().equals("sim")) {
			System.out.println("Você respondeu: "+resposta);
			System.out.println("Deseja continuar?");
			resposta = entrada.next();
		}
		System.out.println("Terminou meu while com base em decisão.");
		
		//entrada.close();
		main(null);
	}

	private static void aprenderDoWhile() {
		System.out.println("Vamos aprender o DO WHILE aqui.");
		Scanner entrada = new Scanner(System.in);
		String resposta;
		do {
			System.out.println("Existiam 2 dogs PITA e REPITA, PITA morreu quem ficou?");
			resposta = entrada.next();
		} while(resposta.equalsIgnoreCase("repita"));
		System.out.println("Entendeu né? ;D");
		
		
		byte dia;
		
		do {
			System.out.println("Informe o dia do seu aniversário");
			dia=entrada.nextByte();
		} while(dia>31); // repetir enquanto informar algo maior que 31
		System.out.println("Espero que não tenha errado muito...");
		
		byte mes;
		byte contador=0;
		do {
			System.out.println("Informe o dia do seu aniversário, ex(1 até 31)");
			dia=entrada.nextByte();
			System.out.println("Informe o mes do seu aniversário, ex(1 até 12)");
			mes=entrada.nextByte();
			contador++;
		} while(dia<1 || dia>31 || mes<1 || mes>12);
		System.out.println("Finalmente você digitou certo"+dia+"/"+mes+" errou "+contador--);
		System.out.println(contador);
		
		main(null);
	}
}
