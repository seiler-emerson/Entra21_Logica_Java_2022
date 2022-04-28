package br.com.entra21.ExercicioPrecoCusto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer, após, processe um aumento de 65% e informe qual será o preço de venda.");
		
		String nomeProduto;
		float precoCusto, precoVenda;
		
		Scanner entrada = new Scanner(System.in);
		
		//Recebendo dados de entrada
		System.out.println("Digite o nome do produto: ");
		nomeProduto = entrada.nextLine(); //nextLine permite capturar textos com espaços.
		
		System.out.println("Digite o valor de custo do produto R$:");
		precoCusto = entrada.nextFloat();
		
		//Processamento de dados
		//precoVenda = precoCusto * 65/100 + precoCusto;
		precoVenda = precoCusto * 1.65f;
		
		//Apresentação resultados
		System.out.println("O produto selecionado é: "+nomeProduto);
		System.out.println("O Preço de custo é: R$"+precoCusto);
		System.out.println("O Preço de venda é: R$"+precoVenda);
		
	}

}
