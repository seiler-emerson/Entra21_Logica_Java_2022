package br.com.entra21.exercicio.calculadora.imc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Fa�a um programa que calcule o IMC");
		System.out.println("O IMC � o �ndice de Massa Corp�rea e � calculado com a formula peso dividido pela altura ao quadrado");
		
		float peso, altura, imc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso em quilos.");
		peso = entrada.nextFloat();
		
		System.out.println("Digite sua altura em metros.");
		altura = entrada.nextFloat();
		
		imc = peso / (altura*altura);
		
		System.out.println("O valor do seu IMC � de: "+imc);
	}

}
