package br.com.entra21.exercicio.funcoes.curriculo;

public class Main {

	public static void main(String[] args) {
		System.out.println("CURRICULO VITAE");
		System.out.println("");
		
		System.out.println(dadosPessoais());
		System.out.println("");
		
		System.out.println(formacao());
		System.out.println("");
		
		System.out.println(experienciaProfissional());
		System.out.println("");
		
	}
	
	public static String dadosPessoais(){
		String dadosPessoais = "DADOS PESSOAIS\r\n"
				+ "NOME: Emerson Seiler\r\n"
				+ "IDADE: 27 anos\r\n"
				+ "CIDADE: Navegantes\r\n"
				+ "ESTADO: Santa Catarina";
						
		   return dadosPessoais;
	}
	
	public static String formacao(){
		String formacao = "FORMA��O ACAD�MICA\r\n"
				+ "\r\n"
				+ "GRADUA��O: Engenharia Mec�nica\r\n"
				+ "INSTITUI��O: Faculdade Anhanguera\r\n"
				+ "PER�ODO: 2014 - 2018\r\n"
				+ "\r\n"
				+ "P�S-GRADUA��O: Engenharia Biom�dica com �nfase em Engenharia Cl�nica\r\n"
				+ "INSTITUI��O: Est�cio de S�\r\n"
				+ "PER�ODO: 2020 - 2021\r\n"
				+ "\r\n"
				+ "CURSO: Capacita��o Java\r\n"
				+ "INSTITUI��O: ENTRA21 - Blusoft Proway\r\n"
				+ "PER�ODO: 2022";
						
		   return formacao;
	}
	
	public static String experienciaProfissional(){
		String experienciaProfissional = "EXPERI�NCIA PROFISSIONAL\r\n"
				+ "\r\n"
				+ "CARGO: ENGENHEIRO\r\n"
				+ "ESPRESA: VCOM Produtos e Servi�os M�dico Hospitalar\r\n"
				+ "LOCAL: Santa Catarina\r\n"
				+ "PER�ODO: 2020 - 2022\r\n"
				+ "\r\n"
				+ "CARGO: ENGENHEIRO\r\n"
				+ "ESPRESA: Seiler 3D\r\n"
				+ "LOCAL: Itaja� - Santa Catarina\r\n"
				+ "PER�ODO: 2017 - 2020\r\n"
				+ "\r\n"
				+ "CARGO: PROFESSOR\r\n"
				+ "ESPRESA: Jumper Profiss�es e Idiomas\r\n"
				+ "LOCAL: S�o Francisco do Sul- Santa Catarina\r\n"
				+ "PER�ODO: 2016 - 2017\r\n"
				+ "\r\n"
				+ "CARGO: Coordenador de Manuten��o/TI\r\n"
				+ "ESPRESA: Hospital Nossa Senhora da Gra�a\r\n"
				+ "LOCAL: S�o Francisco do Sul- Santa Catarina\r\n"
				+ "PER�ODO: 2013 - 2015";
						
		   return experienciaProfissional;
	}

}
