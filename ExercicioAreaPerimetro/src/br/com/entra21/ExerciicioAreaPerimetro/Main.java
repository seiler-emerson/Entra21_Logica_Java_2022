package br.com.entra21.ExerciicioAreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.");

		System.out.println("Sabendo que a área é calculada com base no produto entre base e altura.");
		System.out.println("O perímetro é obtido ao somar todos os vertices do retângulo.");
		
		//Criar variaveis
		float base, altura, area, perimetro; //Boas praticas de nomenclatura.
		
		Scanner entrada = new Scanner(System.in);
		
		//Definir valores as variaveis
		System.out.println("Digite a base do retângulo: ");
		base = entrada.nextFloat();
		
		System.out.println("Digite a altura do retângulo: ");
		//altura = entrada.nextInt();  //Continua float, porém ele trunca para inteiro.
		altura = entrada.nextFloat();
		
		//Momento de processamento
		area = base * altura;
		perimetro = base * 2 + altura * 2;
		
		//Apresentação dos resultados
		System.out.println("Area é "+base+" x "+altura);
		System.out.println("Perimetro é "+base+" + "+base+" + "+altura+" + "+altura);
		System.out.println("A area do retângulo é: "+area+" e o perimetro do retângulo é: "+perimetro);
		
		
	}

}
