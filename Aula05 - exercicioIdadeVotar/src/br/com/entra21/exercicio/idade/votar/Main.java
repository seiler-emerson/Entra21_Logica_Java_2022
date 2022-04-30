package br.com.entra21.exercicio.idade.votar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Capturar ano de nascimento e informar se já tem idade para votar");
		
		int anoNascimento, idade;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o ano do seu nascimento: ");
		anoNascimento = entrada.nextInt();
		
		idade = 2022 - anoNascimento;
		
		if(idade>=16) {
			System.out.println("Você tem "+idade+" anos, ja pode votar.");
		} else {
			System.out.println("Você tem "+idade+" anos, não pode votar ainda.");
		}

	}

}
