package br.com.entra21.exercicio.media.aluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Capturar 3 notas do aluno para calcular a média e informar se está aprovado ou reprovado");
		
		float nota1,nota2,nota3,media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextFloat();

		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
				
		System.out.println(media>=7?"A media do aluno foi "+media+" ele está aprovado.":"A media do aluno foi "+media+" ele está reprovado.");
	}

}
