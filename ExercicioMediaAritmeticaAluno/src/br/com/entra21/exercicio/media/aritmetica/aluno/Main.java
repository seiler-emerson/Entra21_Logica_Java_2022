package br.com.entra21.exercicio.media.aritmetica.aluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Fa�a um programa que calcule a m�dia aritm�tica de um aluno.");
		System.out.println("Capture o nome do aluno e valor de suas 3 notas para informar a m�dia.");
		System.out.println("A formula da m�dia � a soma das notas dividido pela quantidade de notas");
		
		String nomeAluno;
		float nota1, nota2, nota3, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o nome do aluno: ");
		nomeAluno = entrada.nextLine();
		
		System.out.println("Informe a primeira nota: ");
		nota1 = entrada.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = entrada.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = entrada.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A m�dia do aluno "+nomeAluno+" foi "+media);
	}

}
