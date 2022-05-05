package br.com.entra21.avaliacao.signo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// PROGRAMA 01
		// Crie um programa que informe o signo do usuário
		// Capturar nome , dia e mês de aniversário
		// Criar constante para numero limite do dia do mês, no caso 31
		// Se
		// o dia for maior que o limite = Informar o valor limite para um dia do mês
		// Senão
		// escolher o mês correspondente para fazer as validações especificas
		// nesse mês existe esse dia?
		// com base no dia do mês qual é o signo
		// mês invalido
		
		startSigno();

	}
	
	public static void startSigno() {
		String nomeUsuario, signo, opcao;
		byte diaAniversario, mesAniversario = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("|===============================================================|");
		System.out.println("|==================== VERIFICADOR DE SIGNOS ====================|");
		System.out.println("|===============================================================|");
		
		System.out.println("Digite seu nome:");
		nomeUsuario = entrada.nextLine();
		System.out.println("|---------------------------------------------------------------|");

		System.out.println("Digite o dia do seu anivesario:");
		diaAniversario = entrada.nextByte();
		System.out.println("|---------------------------------------------------------------|");
		
		System.out.println("Selecione o numero correspondente ao mes do seu anivesario:");
		System.out.println(
				"1 - JANEIRO     2- FEVEREIRO     3 - MARCO\n4 - ABRIL       5 - MAIO         6 - JUNHO\n7 - JULHO       8 - AGOSTO       9 - SETEMBRO\n10 - OUTUBRO    11 - NOVEMBRO    12 - DEZEMBRO");
		opcao = entrada.next();
		System.out.println("|---------------------------------------------------------------|");

		switch (opcao.toLowerCase()) {
		case "1":
		case "janeiro":
			mesAniversario = 1;
			break;
		case "2":
		case "fevereiro":
			mesAniversario = 2;
			break;
		case "3":
		case "marco":
			mesAniversario = 3;
			break;
		case "4":
		case "abril":
			mesAniversario = 4;
			break;
		case "5":
		case "maio":
			mesAniversario = 5;
			break;
		case "6":
		case "junho":
			mesAniversario = 6;
			break;
		case "7":
		case "julho":
			mesAniversario = 7;
			break;
		case "8":
		case "agosto":
			mesAniversario = 8;
			break;
		case "9":
		case "setembro":
			mesAniversario = 9;
			break;
		case "10":
		case "outubro":
			mesAniversario = 10;
			break;
		case "11":
		case "novembro":
			mesAniversario = 11;
			break;
		case "12":
		case "dezembro":
			mesAniversario = 12;
			break;
		default:
			System.out.println("Opcao invalida! Tente novamente!");
		}
		
		verificarDiaMes(mesAniversario,diaAniversario);
		
		signo = verificarSigno(mesAniversario, diaAniversario);
		if (signo == "error") {
			System.out.println("Houve algum erro no processo! Tente novamente!");
			startSigno();
		} else {
			System.out.println("|===============================================================|");
			System.out.println("-- "+nomeUsuario.toUpperCase() + " você nasceu no dia "+diaAniversario+" do mes "+mesAniversario+" seu signo é " + signo+"! --");
			System.out.println("|===============================================================|");
		}
	}
	
	public static void verificarDiaMes(byte mesAniversario, byte diaAniversario) {
		final byte diasLimiteMes29 = 29;
		final byte diasLimiteMes30 = 30;
		final byte diasLimiteMes31 = 31;
		
		if (mesAniversario == 2 && diaAniversario >diasLimiteMes29) {
			System.out.println("Por favor, digite uma opção válida FEVEREIRO TEM no máximo 29 dias.");
		} else if (mesAniversario == 4 && diaAniversario >diasLimiteMes30) {
			System.out.println("Por favor, digite uma opção válida ABRIL TEM no máximo 30 dias.");
		} else if (mesAniversario == 6 && diaAniversario >diasLimiteMes30) {
			System.out.println("Por favor, digite uma opção válida JUNHO TEM no máximo 30 dias.");
		} else if (mesAniversario == 9 && diaAniversario >diasLimiteMes30) {
			System.out.println("Por favor, digite uma opção válida SETEMBRO TEM no máximo 30 dias.");
		} else if (mesAniversario == 11 && diaAniversario >diasLimiteMes30) {
			System.out.println("Por favor, digite uma opção válida NOVEMBRO TEM no máximo 30 dias.");
		} else if (diaAniversario >diasLimiteMes31){
			System.out.println("Por favor, digite uma opção válida. Um mês tem no máximo 31 dias.");
		} else {
			verificarSigno(mesAniversario,diaAniversario);
		}
	}
	
	
	public static String verificarSigno(byte mesAniversario, byte diaAniversario) {

		String signo;

		if (mesAniversario == 3 && diaAniversario >= 21 && diaAniversario <= 31 || mesAniversario == 4 && diaAniversario <= 20) {
			signo = "ARIES";
		} else if (mesAniversario == 4 && diaAniversario >= 21 && diaAniversario <= 30 || mesAniversario == 5 && diaAniversario <= 20) {
			signo = "TOURO";
		} else if (mesAniversario == 5 && diaAniversario >= 21 && diaAniversario <= 31 || mesAniversario == 6 && diaAniversario <= 20) {
			signo = "GEMEOS";
		} else if (mesAniversario == 6 && diaAniversario >= 21 && diaAniversario <= 30 || mesAniversario == 7 && diaAniversario <= 22) {
			signo = "CANCER";
		} else if (mesAniversario == 7 && diaAniversario >= 23 && diaAniversario <= 31 || mesAniversario == 8 && diaAniversario <= 22) {
			signo = "LEAO";
		} else if (mesAniversario == 8 && diaAniversario >= 23 && diaAniversario <= 31 || mesAniversario == 9 && diaAniversario <= 22) {
			signo = "VIRGE";
		} else if (mesAniversario == 9 && diaAniversario >= 23 && diaAniversario <= 30 || mesAniversario == 10 && diaAniversario <= 22) {
			signo = "LIBRA";
		} else if (mesAniversario == 10 && diaAniversario >= 23 && diaAniversario <= 31 || mesAniversario == 11 && diaAniversario <= 21) {
			signo = "ESCORPIAO";
		} else if (mesAniversario == 11 && diaAniversario >= 22 && diaAniversario <= 30 || mesAniversario == 12 && diaAniversario <= 21) {
			signo = "SAGITARIO";
		} else if (mesAniversario == 12 && diaAniversario >= 22 && diaAniversario <= 31 || mesAniversario == 1 && diaAniversario <= 20) {
			signo = "CAPRICORNIO";
		} else if (mesAniversario == 1 && diaAniversario >= 21 && diaAniversario <= 31 || mesAniversario == 2 && diaAniversario <= 18) {
			signo = "AQUARIO";
		} else if (mesAniversario == 2 && diaAniversario >= 19 && diaAniversario <= 29|| mesAniversario == 3 && diaAniversario <= 20) {
			signo = "PEIXES";
		} else {
			signo = "error";
		}

		return signo;
	}
}
