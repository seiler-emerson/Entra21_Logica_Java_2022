package br.com.entra21.exercicio.operadores.relacional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fa�a um programa que informe se o 1� numero � maior que o 2� numero");
		System.out.println("Fa�a um programa que informe se o 1� numero � maior ou igual que o 2� numero");
		System.out.println("Fa�a um programa que informe se o 1� numero � menor que o 2� numero");
		System.out.println("Fa�a um programa que informe se o 1� numero � menor ou igual que o 2� numero");
	
		float numero1, numero2;
		boolean resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero: ");
		numero1 = entrada.nextFloat();
		System.out.println("Insira o segundo n�mero: ");
		numero2 = entrada.nextFloat();
		
		resultado = numero1 > numero2;
		
		System.out.println(numero1+" � maior que "+numero2+": "+resultado);
		
		resultado = numero1 >= numero2;
		
		System.out.println(numero1+" � maior ou igual que "+numero2+": "+resultado);
		
		resultado = numero1 < numero2;
		
		System.out.println(numero1+" � menor que "+numero2+": "+resultado);
		
		resultado = numero1 <= numero2;
		
		System.out.println(numero1+" � menor ou igual que "+numero2+": "+resultado);
	}

}
