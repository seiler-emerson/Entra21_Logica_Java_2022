package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO

		byte idade;
		idade = 33;

		byte outraIdade = 34;

		short ano = 2022;

		short anoPassado;

		anoPassado = 2021;
		
		System.out.println("Minha idade é "+(idade+outraIdade));
		
		System.out.println("Estamos em "+ano+" e ano passado foi "+anoPassado+".");
		
		System.out.println("Ano =>"+ano);
		
		int habitantesBrasil = 2120600;
		
		System.out.println("No Brasil em "+ano+" temos exatamente "+habitantesBrasil+" habitantes.");
		
		long habitantesTerra1500;
		habitantesTerra1500=790000000;
		
		float peso = 70.5f, altura=2.05f;
		
		System.out.println("Meu peso é "+peso);
		System.out.println("Minha altura é"+altura);
		
		char letra='R';
		
		boolean intervaloAntesdasOito=false;
		boolean intervaloAgora=true;

		String nome;
		byte minhaIdade;
		float minhaAltura=0f, salario=0f;

		System.out.println("Idade: " + idade);
		System.out.println("Outra idade: " + outraIdade);
		System.out.println("Ano: " + ano);
		System.out.println("Ano Passado: " + anoPassado);

		Scanner entrada;
		entrada = new Scanner(System.in);

		/*
		  System.out.println("Por favor qual é o seu nome?"); nome = entrada.nextLine();
		  
		  System.out.println("Informe sua idade:"); minhaIdade = entrada.nextByte();
		  
		  System.out.println("Informe sua altura:"); minhaAltura = entrada.nextFloat();
		  
		  System.out.println("Informe seu salario:"); salario = entrada.nextFloat();
		  
		  System.out.println("Bem vindo " + nome + " agora consigo interagir com humanos, já sei que vc tem " + minhaIdade + " anos. Sua altura é " + minhaAltura + " e seu salario é R$" + salario);
		*/

		nome = JOptionPane.showInputDialog("Informe seu nome completo: ");

		JOptionPane.showMessageDialog(null, "Legal, agora aprendi seu nome " + nome);
	
		minhaIdade = Byte.parseByte(
				JOptionPane.showInputDialog("Informe sua idade:")
				);
		JOptionPane.showMessageDialog(null, "Legal sua idade é "+minhaIdade+" anos");
		
		salario = Float.parseFloat(
				JOptionPane.showInputDialog("Informe seu salário: ")
				);
		JOptionPane.showMessageDialog(null, "Seu salario é R$"+salario);
	}

}
