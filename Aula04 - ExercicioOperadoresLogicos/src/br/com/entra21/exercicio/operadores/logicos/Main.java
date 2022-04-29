package br.com.entra21.exercicio.operadores.logicos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Faça um programa que capture 3 informações o nome,  idade e altura. Deve ser informado se o usuário é maior ou igual que 170cm E tem é maior de idade (utilizar o &&)");
		System.out.println("Faça um programa que capture 3 informações o nome,  idade e altura. Deve ser informado se o usuário é maior ou igual que 170cm OU tem é maior de idade (utilizar o ||)");
			
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
		
		System.out.println(nome+" Sua idade é maior que 18 anos e sua altura é maior ou igual a 1.7m?: "+resultado);
		
		resultado = (idade>=18) || (altura>=1.7f);
		
		System.out.println(nome+" Sua idade é maior que 18 anos ou sua altura é maior ou igual a 1.7m?: "+resultado);
		
		
	}

}
