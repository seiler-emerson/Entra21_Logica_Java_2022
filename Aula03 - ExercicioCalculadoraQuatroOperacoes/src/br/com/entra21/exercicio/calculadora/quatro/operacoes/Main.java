package br.com.entra21.exercicio.calculadora.quatro.operacoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Capture o nome do usuário e 2 valores numéricos.");
		System.out.println("Após a captura dos numeros, exiba de forma individual o resultado utilizando os operadores matemáticos.");

		String nomeUsuario;
		float numero1, numero2, soma, subtracao, multiplicacao, divisao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		nomeUsuario = entrada.nextLine();
		
		System.out.println("Insira o primeiro número: ");
		numero1 = entrada.nextFloat();
		
		System.out.println("Insira o segundo número: ");
		numero2 = entrada.nextFloat();
		
		//Processamento de dados
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		//Apresentacao dos resultados
		System.out.println(nomeUsuario+" o resultado entre a soma do "+numero1+" e "+numero2+" foi: "+soma);
		System.out.println(nomeUsuario+" o resultado entre a subtração do "+numero1+" e "+numero2+" foi: "+subtracao);
		System.out.println(nomeUsuario+" o resultado entre a multiplicação do "+numero1+" e "+numero2+" foi: "+multiplicacao);
		System.out.println(nomeUsuario+" o resultado entre a divisão do "+numero1+" e "+numero2+" foi: "+divisao);
	}

}
