package br.com.entra21.exercicio.operadores.relacional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que informe se o 1º numero é maior que o 2º numero");
		System.out.println("Faça um programa que informe se o 1º numero é maior ou igual que o 2º numero");
		System.out.println("Faça um programa que informe se o 1º numero é menor que o 2º numero");
		System.out.println("Faça um programa que informe se o 1º numero é menor ou igual que o 2º numero");
	
		float numero1, numero2;
		boolean resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		numero1 = entrada.nextFloat();
		System.out.println("Insira o segundo número: ");
		numero2 = entrada.nextFloat();
		
		resultado = numero1 > numero2;
		
		System.out.println(numero1+" é maior que "+numero2+": "+resultado);
		
		resultado = numero1 >= numero2;
		
		System.out.println(numero1+" é maior ou igual que "+numero2+": "+resultado);
		
		resultado = numero1 < numero2;
		
		System.out.println(numero1+" é menor que "+numero2+": "+resultado);
		
		resultado = numero1 <= numero2;
		
		System.out.println(numero1+" é menor ou igual que "+numero2+": "+resultado);
	}

}
