package br.com.entra21.exercicio.calculadora.com.funcao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String opcao;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escolha um exercicio para executar:");
		System.out.println("1 - Calculadora");
		System.out.println("2 - Curriculo");

		opcao = entrada.next();

		switch (opcao.toLowerCase()) {
		case "1":
		case "calculadora":
			String opcaoCalculo;
			float numeroA, numeroB;
//			Scanner entrada = new Scanner(System.in);

			System.out.println("Voc� escolheu calcular, digite o primeiro n�mero:");
			numeroA = entrada.nextFloat();
			System.out.println("Digite o segundo n�mero:");
			numeroB = entrada.nextFloat();

			System.out.println("Selecione uma opera��o matem�tica:");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtracao");
			System.out.println("3 - Divisao");
			System.out.println("4 - Multiplicacao");
			opcaoCalculo = entrada.next();

			switch (opcaoCalculo.toLowerCase()) {
			case "1":
			case "soma":
				System.out.println("O resultado da soma  entre "+numeroA+" e "+numeroB+" � "+somar(numeroA,numeroB));
				break;			
			case "2":
			case "subtracao":
				System.out.println("O resultado da subtra��o  entre "+numeroA+" e "+numeroB+" � "+subtrair(numeroA,numeroB));
				break;
			case "3":
			case "divisao":
				System.out.println("O resultado da divis�o  entre "+numeroA+" e "+numeroB+" � "+dividir(numeroA,numeroB));
				break;
			case "4":
			case "multiplicacao":
				System.out.println("O resultado da subtra��o  entre "+numeroA+" e "+numeroB+" � "+multiplicar(numeroA,numeroB));
				break;
			default:
				System.out.println("Digite uma op��o v�lida.");
				break;
			}
		case "2":
		case "curriculo":
			String nome,idade, cidade, formacao, empresa, cargo, dataInicio;
			
			System.out.println("Vamos criar o seu curr�culo:");
			System.out.println("Digite seu nome:");
			nome = entrada.next();
			
			System.out.println("Digite sua idade: ");
			idade = entrada.next();
			
			System.out.println("Digite sua cidade/estado: ");
			cidade = entrada.next();
			
			System.out.println("Digite sua forma��o/ano: ");
			formacao = entrada.next();
			
			System.out.println("Digite a empresa que voc� trabalha atualmente: ");
			empresa = entrada.next();
			
			System.out.println("Digite seu cargo: ");
			cargo = entrada.next();
			
			System.out.println("Digite a data de inicio na empresa: ");
			dataInicio = entrada.next();
			
			criarCurriculo(nome, cidade, formacao, empresa, cargo, dataInicio, idade);
			break;

	}

}

	public static float somar(float numeroA, float numeroB) {
		return numeroA + numeroB;
	}
	
	public static float subtrair(float numeroA, float numeroB) {
		return numeroA - numeroB;
	}
	
	public static float dividir(float numeroA, float numeroB) {
		return numeroA / numeroB;
	}
	
	public static float multiplicar(float numeroA, float numeroB) {
		return numeroA * numeroB;
	}
	
	public static void criarCurriculo(String nome, String cidade, String formacao, String empresa, String cargo, String dataInicio, String idade) {
		System.out.println("DADOS PESSOAIS");
		System.out.println("NOME"+nome);
		System.out.println("IDADE"+idade+"anos");
		System.out.println("CIDADE"+cidade);
		System.out.println("");
		System.out.println("FORMA��O ACAD�MICA");
		System.out.println("CURSO"+formacao);
		System.out.println("");
		System.out.println("EXPERI�NCIA PROFISSIONAL");
		System.out.println("EMPRESA"+empresa);
		System.out.println("CARGO"+cargo);
		System.out.println("DATA INICIO"+dataInicio);
	}
	
}