package br.com.entra21.exercicio.calculadora.com.funcao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fa�a um programa de calculara");
		System.out.println("Capture 2 n�meros e calcule a op��o matem�tica correspondente");
		
		float numeroA, numeroB;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor digite um n�mero: ");
		numeroA = entrada.nextFloat();
		
		System.out.println("Por favor digite outro n�mero: ");
		numeroB = entrada.nextFloat();
		
		
		
		soma(numeroA,numeroB);
		

	}
	public static float soma(float numeroA, float numeroB){

		float resultado = numeroA + numeroB;

		System.out.println("O resultado da soma entre "+numeroA+" e o "+numeroB+" � "+resultado);
		
		return resultado;

	}

}
