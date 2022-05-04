package br.com.entra21.exercicio.revisao.estrutura.controle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que: - Defina como constante a altura minima permitida
		 * para entrar em um brinquedo (Aten��o a nomenclatura e utilize a constante no
		 * IF) - Capture nome e altura do usu�rio - Validar se a altura informada �
		 * MENOR que a permitida - Caso seja MENOR informar de forma educada mencionando
		 * o nome do usu�rio e sua altura qual o par�metro minimo para entrar no
		 * brinquedo -Caso n�o seja MENOR informar que a entrada est� liberada.
		 */

		final float alturaMinima=1.5f;
		String nomeUsuario;
		float alturaUsuario;
		byte idade;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nomeUsuario = entrada.nextLine();
		
		System.out.println("Digite sua altura em metros: ");
		alturaUsuario = entrada.nextFloat();
		
		if (alturaUsuario<alturaMinima) {
			System.out.println("Desculpe "+nomeUsuario+", voc� n�o vai poder entrar no brinquedo.");
			System.out.println("Voc� tem "+alturaUsuario+" metros, por�m o brinquedo exige "+alturaMinima+" metros.");
		} else if (alturaUsuario>=alturaMinima) {
			System.out.println("Legal "+nomeUsuario+", voc� vai poder entrar no brinquedo.");
			System.out.println("Voc� tem "+alturaUsuario+" metros, e o brinquedo exige "+alturaMinima+" metros.");
		} else {
			
		}
		
	}

}
