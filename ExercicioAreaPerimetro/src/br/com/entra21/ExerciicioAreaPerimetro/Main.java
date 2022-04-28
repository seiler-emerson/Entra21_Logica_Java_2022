package br.com.entra21.ExerciicioAreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fa�a um programa que solicite a base e altura de um ret�ngulo e informe sua �rea e perimetro.");

		System.out.println("Sabendo que a �rea � calculada com base no produto entre base e altura.");
		System.out.println("O per�metro � obtido ao somar todos os vertices do ret�ngulo.");
		
		//Criar variaveis
		float base, altura, area, perimetro; //Boas praticas de nomenclatura.
		
		Scanner entrada = new Scanner(System.in);
		
		//Definir valores as variaveis
		System.out.println("Digite a base do ret�ngulo: ");
		base = entrada.nextFloat();
		
		System.out.println("Digite a altura do ret�ngulo: ");
		//altura = entrada.nextInt();  //Continua float, por�m ele trunca para inteiro.
		altura = entrada.nextFloat();
		
		//Momento de processamento
		area = base * altura;
		perimetro = base * 2 + altura * 2;
		
		//Apresenta��o dos resultados
		System.out.println("Area � "+base+" x "+altura);
		System.out.println("Perimetro � "+base+" + "+base+" + "+altura+" + "+altura);
		System.out.println("A area do ret�ngulo �: "+area+" e o perimetro do ret�ngulo �: "+perimetro);
		
		
	}

}
