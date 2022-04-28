package br.com.entra21.ExercicioPrecoCusto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer, ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.");
		
		String nomeProduto;
		float precoCusto, precoVenda;
		
		Scanner entrada = new Scanner(System.in);
		
		//Recebendo dados de entrada
		System.out.println("Digite o nome do produto: ");
		nomeProduto = entrada.nextLine(); //nextLine permite capturar textos com espa�os.
		
		System.out.println("Digite o valor de custo do produto R$:");
		precoCusto = entrada.nextFloat();
		
		//Processamento de dados
		//precoVenda = precoCusto * 65/100 + precoCusto;
		precoVenda = precoCusto * 1.65f;
		
		//Apresenta��o resultados
		System.out.println("O produto selecionado �: "+nomeProduto);
		System.out.println("O Pre�o de custo �: R$"+precoCusto);
		System.out.println("O Pre�o de venda �: R$"+precoVenda);
		
	}

}
