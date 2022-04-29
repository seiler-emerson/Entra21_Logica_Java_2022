package br.com.entra21.exercicio.operadores.igualdade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que compare 2 números e informe se o 1º é igual ao 2º numero");
		System.out.println("Faça um programa que compare 2 números e informe se o 1º é diferente do 2º numero");
		
		float numero1, numero2;
		boolean comparacao1, comparacao2;
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Insira um numero: ");
		numero1 = entrada.nextFloat();
		
		System.out.println("Insira um numero: ");
		numero2 = entrada.nextFloat();
		
		comparacao1 = numero1 == numero2;
		
		comparacao2 = numero1 != numero2;
		
		System.out.println(numero1+" é igual a "+numero2+" : "+comparacao1);
		System.out.println(numero1+" é diferente de "+numero2+" : "+comparacao2);		
	
	
	
	}

}
