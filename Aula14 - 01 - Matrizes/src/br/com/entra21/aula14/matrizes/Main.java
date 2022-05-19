package br.com.entra21.aula14.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	// Definindo minha variavel entrada do tipo scanner acessivel em toda a classe
	// Main
	// como o metodo main é static, tanto metodos ou variaveis devem ser static para
	// se relacionarem com o metodo main.

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println(escreverMenuMatrizes());
			opcao = input.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				aprenderMatrizesSimples();
				break;
			case 2:
				aprenderMatrizesInicializadas();
				break;
			default:

				break;
			}

		} while (opcao != 0);
		System.out.println("Fim da aula sobre matrizes!");

	}

	private static String escreverMenuMatrizes() {
		String conteudoMenu = "Escolha uma opcao para aprender:\n";
		conteudoMenu += "\t1 - Inicializando matrizes com tamanho definido\n";
		conteudoMenu += "\t2 - Inicializando matrizes com valores predeterminado\n";
		return conteudoMenu;
	}

	private static void aprenderMatrizesSimples() {
		System.out.println("Aprendendo sobre matrizes simples.");

		System.out.println("Armazenar as 3 notas de todos os 10 alunos");
		float notas[][];
		notas = new float[10][3]; // Aqui eu defini diretamente no código o tamanho da minha matriz.
		// Primeiro indice é a quantidade de vetores(10).
		// Segundo é a capacidade de cada vetor (quantidade de notas(3)).
		// Apenas no ultimo indice da criacao pela sintaxe ficam os valores.

		byte quantidadeAlunos, quantidadeNotas;
		System.out.println("Informe a quantidade de alunos:");
		quantidadeAlunos = input.nextByte();

		System.out.println("Informe a quantidade de notas para cada aluno");
		quantidadeNotas = input.nextByte();

		// Quem decide o tamanho da minha matriz é o usuario.
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for (byte aluno = 0; aluno < novasNotas.length; aluno++) {
			System.out.println("Nessa posicao ["+aluno+"] temos "+novasNotas[aluno].length+" notas");
		
			for(byte nota=0;nota<novasNotas[aluno].length;nota++) {
				System.out.println("\t Valor da nota ["+nota+"] ==> "+novasNotas[aluno][nota]);
				
			}
		
		}
		System.out.println("");
		System.out.println("Confiando que tenho no minimo 2 alunos");
		System.out.println("Olha as notas do segundo aluno");
		System.out.println(novasNotas[1][0]);
		System.out.println(novasNotas[1][1]);
		System.out.println(novasNotas[1][2]);

	}

	private static void aprenderMatrizesInicializadas() {
		System.out.println("Aprendendo sobre matrizes inicializadas e irregulares.");
		
		float salarioAlunos[][] = {
				{1000  , 1250.5f  , 2500.35f}, //	===>> [0][0]  |  [0][1]  |  [0][2]
				{2600  , 3500     , 4500    }, // 	===>> [1][0]  |  [1][1]  |  [1][2]
				{50000 , 150000   , 2000000 }, //	===>> [2][0]  |  [2][1]  |  [2][2]
				{50000 , 150000   , 2000000 }, //	===>> [3][0]  |  [3][1]  |  [3][2]
		};
		
		byte matrizIrregular[][] = {
				{1,2,3,4,5,6,7},	// Length 7
				{4,3,2,1},			// Length 4
				{10,12},			// Length 2
				{-127,0,127},		// Length 3
		}; // Length 4
		
		String ementa[][] = {
				{"Metodologias Ageis","Introducao","Metodologias","Git"},
				{"Logica com Java","Variaveis","Constantes","Comentarios","Desvios Condicionais","Lacos de Repeticao"},
				{"POO","Classes","Objetos","Heranca","Polimorfismo","Encapsulamento","Conceitos"},
		};
		
		System.out.println(ementa);
		
	}

}
