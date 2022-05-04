package br.com.entra21.exercicio.revisao.estrutura.de.controle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que: 
		 * - Defina como constante a quantidade de notas de um
		 * aluno Capture nome e cada uma das notas Calcule a média Informe se reprovou
		 * (<3) senao se , em recuperação (<7) senão se, passou com a nota minima (=7)
		 * senão se, passou mas poderia ser melhor (<10) senão se, nota maxima (=10)
		 * senão (tem algo de errado com o seu calculo de média)
		 */

		final byte quantidadeNotas=3;
		String nomeAluno;
		float nota1,nota2,nota3,media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		nomeAluno = entrada.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextFloat();
		
		media = (nota1 + nota2 + nota3) /3;
		
		if(media<3) {
			System.out.println("O aluno reprovou!");
		} else if (media<7) {
			System.out.println("O aluno está de recuperação!");			
		} else if (media<10) {
			System.out.println("O aluno passou, mas poderia ser melhor!");			
		} else if (media==10) {
			System.out.println("O aluno passou, nota maxima!");			
		} else {
			System.out.println("Há algo de errado com sua média!");		
		}

		
	}

}
