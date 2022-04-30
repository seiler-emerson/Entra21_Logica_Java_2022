package br.com.entra21.exercicio.numero.maior;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Capturar 2 números e informar qual é o maior");
		
		float numero1, numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		numero1 = entrada.nextFloat();
		
		System.out.println("Insira o segundo número: ");
		numero2 = entrada.nextFloat();
		
		if(numero1>numero2) {
			System.out.println("O numero 01 é o maior pois "+numero1+" é maior que "+numero2);
		} else {
			System.out.println("O numero 02 é o maior pois "+numero2+" é maior que "+numero1);
		}

	}

}
