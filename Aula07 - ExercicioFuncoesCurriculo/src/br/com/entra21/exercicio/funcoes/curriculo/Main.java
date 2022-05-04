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
		String formacao = "FORMAÇÃO ACADÊMICA\r\n"
				+ "\r\n"
				+ "GRADUAÇÃO: Engenharia Mecânica\r\n"
				+ "INSTITUIÇÃO: Faculdade Anhanguera\r\n"
				+ "PERÍODO: 2014 - 2018\r\n"
				+ "\r\n"
				+ "PÓS-GRADUAÇÃO: Engenharia Biomédica com Ênfase em Engenharia Clínica\r\n"
				+ "INSTITUIÇÃO: Estácio de Sá\r\n"
				+ "PERÍODO: 2020 - 2021\r\n"
				+ "\r\n"
				+ "CURSO: Capacitação Java\r\n"
				+ "INSTITUIÇÃO: ENTRA21 - Blusoft Proway\r\n"
				+ "PERÍODO: 2022";
						
		   return formacao;
	}
	
	public static String experienciaProfissional(){
		String experienciaProfissional = "EXPERIÊNCIA PROFISSIONAL\r\n"
				+ "\r\n"
				+ "CARGO: ENGENHEIRO\r\n"
				+ "ESPRESA: VCOM Produtos e Serviços Médico Hospitalar\r\n"
				+ "LOCAL: Santa Catarina\r\n"
				+ "PERÍODO: 2020 - 2022\r\n"
				+ "\r\n"
				+ "CARGO: ENGENHEIRO\r\n"
				+ "ESPRESA: Seiler 3D\r\n"
				+ "LOCAL: Itajaí - Santa Catarina\r\n"
				+ "PERÍODO: 2017 - 2020\r\n"
				+ "\r\n"
				+ "CARGO: PROFESSOR\r\n"
				+ "ESPRESA: Jumper Profissões e Idiomas\r\n"
				+ "LOCAL: São Francisco do Sul- Santa Catarina\r\n"
				+ "PERÍODO: 2016 - 2017\r\n"
				+ "\r\n"
				+ "CARGO: Coordenador de Manutenção/TI\r\n"
				+ "ESPRESA: Hospital Nossa Senhora da Graça\r\n"
				+ "LOCAL: São Francisco do Sul- Santa Catarina\r\n"
				+ "PERÍODO: 2013 - 2015";
						
		   return experienciaProfissional;
	}

}
