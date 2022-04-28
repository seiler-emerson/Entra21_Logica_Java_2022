package br.com.entra21.exercicio.converter.fahrenheit.celsius;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Faça um programa que converta graus Fahrenheit em Celsius");

		float temperaturaFahrenheit, temperaturaCelsius;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite a temperatura em Fahrenheit para a conversão: ");
		temperaturaFahrenheit = entrada.nextFloat();
		
		temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8f;
		
		System.out.println("A temperatura de "+temperaturaFahrenheit+"°F em Celsius é "+temperaturaCelsius+"°C");
	}

}
