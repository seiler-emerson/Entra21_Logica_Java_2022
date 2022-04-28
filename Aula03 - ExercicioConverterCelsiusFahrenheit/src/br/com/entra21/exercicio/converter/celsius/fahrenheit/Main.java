package br.com.entra21.exercicio.converter.celsius.fahrenheit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que converta graus Celsius em Fahrenheit");

		float temperaturaFahrenheit, temperaturaCelsius;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite a temperatura em Celsius para a conversão: ");
		temperaturaCelsius = entrada.nextFloat();
		
		temperaturaFahrenheit = (temperaturaCelsius * 1.8f) + 32;
		
		System.out.println("A temperatura de "+temperaturaCelsius+"°C em Farenheit é "+temperaturaFahrenheit+"°F");

	}

}
