package br.com.entra21.exercicio.operadores.logicos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Fa�a um programa que capture 3 informa��es o nome,  idade e altura. Deve ser informado se o usu�rio � maior ou igual que 170cm E tem � maior de idade (utilizar o &&)");
		System.out.println("Fa�a um programa que capture 3 informa��es o nome,  idade e altura. Deve ser informado se o usu�rio � maior ou igual que 170cm OU tem � maior de idade (utilizar o ||)");
			
		String nome;
		byte idade;
		float altura;
		boolean resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o nome: ");
		nome = entrada.nextLine();
		System.out.println("Insira sua idade: ");
		idade = entrada.nextByte();
		System.out.println("Insira sua altura: ");
		altura = entrada.nextFloat();
		
		resultado = (idade>=18) && (altura>=1.7f);
		
		System.out.println(nome+" Sua idade � maior que 18 anos e sua altura � maior ou igual a 1.7m?: "+resultado);
		
		resultado = (idade>=18) || (altura>=1.7f);
		
		System.out.println(nome+" Sua idade � maior que 18 anos ou sua altura � maior ou igual a 1.7m?: "+resultado);
		
		
	}

}
