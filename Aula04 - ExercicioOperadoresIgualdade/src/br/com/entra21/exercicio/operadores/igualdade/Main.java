package br.com.entra21.exercicio.operadores.igualdade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fa�a um programa que compare 2 n�meros e informe se o 1� � igual ao 2� numero");
		System.out.println("Fa�a um programa que compare 2 n�meros e informe se o 1� � diferente do 2� numero");
		
		float numero1, numero2;
		boolean comparacao1, comparacao2;
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Insira um numero: ");
		numero1 = entrada.nextFloat();
		
		System.out.println("Insira um numero: ");
		numero2 = entrada.nextFloat();
		
		comparacao1 = numero1 == numero2;
		
		comparacao2 = numero1 != numero2;
		
		System.out.println(numero1+" � igual a "+numero2+" : "+comparacao1);
		System.out.println(numero1+" � diferente de "+numero2+" : "+comparacao2);		
	
	
	
	}

}
