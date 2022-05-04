package br.com.entra21.exercicio.revisao.estrutura.controle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que: - Defina como constante a altura minima permitida
		 * para entrar em um brinquedo (Atenção a nomenclatura e utilize a constante no
		 * IF) - Capture nome e altura do usuário - Validar se a altura informada é
		 * MENOR que a permitida - Caso seja MENOR informar de forma educada mencionando
		 * o nome do usuário e sua altura qual o parâmetro minimo para entrar no
		 * brinquedo -Caso não seja MENOR informar que a entrada está liberada.
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
			System.out.println("Desculpe "+nomeUsuario+", você não vai poder entrar no brinquedo.");
			System.out.println("Você tem "+alturaUsuario+" metros, porém o brinquedo exige "+alturaMinima+" metros.");
		} else if (alturaUsuario>=alturaMinima) {
			System.out.println("Legal "+nomeUsuario+", você vai poder entrar no brinquedo.");
			System.out.println("Você tem "+alturaUsuario+" metros, e o brinquedo exige "+alturaMinima+" metros.");
		} else {
			
		}
		
	}

}
