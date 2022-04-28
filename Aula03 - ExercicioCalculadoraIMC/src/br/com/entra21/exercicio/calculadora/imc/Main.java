package br.com.entra21.exercicio.calculadora.imc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Faça um programa que calcule o IMC");
		System.out.println("O IMC é o Índice de Massa Corpórea e é calculado com a formula peso dividido pela altura ao quadrado");
		
		float peso, altura, imc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso em quilos.");
		peso = entrada.nextFloat();
		
		System.out.println("Digite sua altura em metros.");
		altura = entrada.nextFloat();
		
		imc = peso / (altura*altura);
		
		System.out.println("O valor do seu IMC é de: "+imc);
	}

}
