package br.com.entra21.exercicio.numero.maior;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Capturar 2 n�meros e informar qual � o maior");
		
		float numero1, numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero: ");
		numero1 = entrada.nextFloat();
		
		System.out.println("Insira o segundo n�mero: ");
		numero2 = entrada.nextFloat();
		
		if(numero1>numero2) {
			System.out.println("O numero 01 � o maior pois "+numero1+" � maior que "+numero2);
		} else {
			System.out.println("O numero 02 � o maior pois "+numero2+" � maior que "+numero1);
		}

	}

}
