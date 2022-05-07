package br.com.entra21.signo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// PROGRAMA 01
		// Crie um programa que informe o signo do usuário
		// Capturar nome, dia e mês de aniversario
		// Criar constante para numero limite do dia do mes, no caso 31
		// Se
		// o dia for maior que o limite = Informar o valor limite para um dia do mes
		// Senão
		// escolher o mes correspondente para fazer as validações especificas
		// nesse mês existe esse dia?
		// com base no dia do mes qual e o signo
		// mes invalido
		
		//VALIDAR SE A QUANTIDADE DE DIAS ESTA CORRETA
		//VALIDAR O PERIODO E RETORNAR UM SIGNO
		
		//FUNCOES - MODULARIZAR O CODIGO
		//SWITCH
		//CONSTANTE
		//VARIAVEIS
		
		startSystem(); //Iniciar a funcao para capturar os dados do usuario. (Conceito de recursividade para implementar loops)

	}
	
	//----------- INICIO SISTEMA  --------------//
	public static void startSystem() {
		String completeName = nameUser(); 	// Executa uma funcao para capturar o nome (conceito de recursividade para implementar loops)
		captureDates(completeName);			// Executa uma funcao para capturar o dia e mes de aniversário do usuário. (conceito de recursividade para implementar loops)
	}
	
	//----------- CAPTURANDO NOME USUARIO --------------//
	public static String nameUser() {
		Scanner input = new Scanner(System.in); 												//Atribuindo a Class Scanner a variavel input
		String firstNameUser, finalNameUser; 													//Definindo a variavel que vai receber o mes do aniversario
		
		System.out.println("Hello, whats your first name?"); 									//Perguntando o primeiro nome do usuario.
		firstNameUser = input.nextLine();														//Capturando o primeiro nome usuario
		
		System.out.println("Hello, what your final name?"); 									//Perguntando o ultimo nome do usuario.
		finalNameUser = input.nextLine();														//Capturando o ultimo nome usuario
				
		String firstLetterName = firstNameUser.substring(0, 1).toUpperCase();					//Pegar a primeira letra do nome informado e colocando em maiuscula
		firstNameUser = firstLetterName+firstNameUser.substring(1).toLowerCase(); 				//Concatenando a primeira letra do nome informado, com as demais letras dsddo nome, removendo a primeira letra da string nameUser
		
		String finalLetterName = finalNameUser.substring(0, 1).toUpperCase();					//Pegar a primeira letra do ultimo nome informado e colocando em maiuscula
		finalNameUser = finalLetterName+finalNameUser.substring(1).toLowerCase(); 				//Concatenando a primeira letra do ultimo nome informado, com as demais letras dsddo nome, removendo a primeira letra da string nameUser
		
		String completeName = firstNameUser+" "+finalNameUser;									//Concatenando o nome completo
		return completeName;																	//Retornar nome completo
	}

	//----------- CAPTURANDO ANIVERSARIO/MES USUARIO --------------//
	public static void captureDates(String completeName) {
		Scanner input = new Scanner(System.in); 												//Atribuindo a Class Scanner a variavel input
		byte dayBirthday; 																		//Definindo a variavel que vai receber o dia do aniversario
		String monthBirthday; 																	//Definindo a variavel que vai receber o mes do aniversario
		
		System.out.println(completeName+", em que dia nos fomos agraciados com a sua vinda a terra?");	//Perguntando quando voce nasceu
		dayBirthday = input.nextByte();																	//Capturando a informacao
		
		System.out.println(completeName+", em que mes nos fomos agraciados com a sua vinda a terra?\nSelecione o mes correspondente na lista:");	//Perguntando o mes em que ele nasceu.
		System.out.println("1 - Janeiro    |  2 - Fevereiro   |  3 - Marco");
		System.out.println("4 - Abril      |  5 - Maio        |  6 - Junho");
		System.out.println("7 - Julho      |  8 - Agosto      |  9 - Setembro");
		System.out.println("10 - Outubro   |  11 - Novembro   |  12 - Dezembro");
				
		monthBirthday = input.next();
		
		switch(monthBirthday.toLowerCase()) {
		case "1":
		case "janeiro":
			//trazer a verificacao do mes janeiro
			validationThirtyOne(dayBirthday, completeName, 1); //funcao do tipo void que recebe o numero de dias maximos daquele mes.
			break;
		case "2","fevereiro":
			//trazer a verificacao do mes fevereiro
			validationTwentyNine(dayBirthday, completeName, 2);
			break;
		case "3","marco":
			//trazer a verificacao do mes marco
			validationThirtyOne(dayBirthday, completeName, 3);
			break;
		case "4","abril":
			//trazer a verificacao do mes abril
			validationThirty(dayBirthday, completeName, 4);
			break;
		case "5","maio":
			//trazer a verificacao do mes maio
			validationThirtyOne(dayBirthday, completeName, 5);
			break;
		case "6","junho":
			//trazer a verificacao do mes junho
			validationThirty(dayBirthday, completeName, 6);
			break;
		case "7","julho":
			//trazer a verificacao do mes julho
			validationThirtyOne(dayBirthday, completeName, 7);
			break;
		case "8","agosto":
			//trazer a verificacao do mes agosto
			validationThirtyOne(dayBirthday, completeName, 8);
			break;
		case "9","setembro":
			//trazer a verificacao do mes setembro
			validationThirty(dayBirthday, completeName, 9);
			break;
		case "10","outubro":
			//trazer a verificacao do mes outubro
			validationThirtyOne(dayBirthday, completeName, 10);
			break;
		case "11","novembro":
			//trazer a verificacao do mes novembro
			validationThirty(dayBirthday, completeName, 11);
			break;
		case "12","dezembro":
			//trazer a verificacao do mes dezembro
			validationThirtyOne(dayBirthday, completeName, 12);
			break;
		default:
			System.out.println("Please, enter a valid value for the day of the month.");
			captureDates(completeName);
		}
	}
	
	//----------- VALIDAÇÃO PARA MESES COM 31 DIAS --------------//
	public static void validationThirtyOne(byte dayBirthday, String nameUser, int monthBirthday){	//Função que recebe o dia do aniversario e nome do usuario
		final byte DAYLIMIT=31; 																	//Definindo o dia limite como uma CONSTANTE.
		if(dayBirthday>DAYLIMIT) {																	//Se dia de aniversario do usuario foir maior que o dia de limite.
			System.out.println("Please, enter a valid value for the day of the month.");			//Texto para número do mês inválido.
			captureDates(nameUser);																	//Reinicia a captura de dados da data.
		} else {																					//Se não
			verifyZodiacSign(dayBirthday,monthBirthday, nameUser);   								//Iniciar função para verificar qual o signo da pessoa.
		}
	}
	
	//----------- VALIDAÇÃO PARA MESES COM 30 DIAS --------------//
	public static void validationThirty(byte dayBirthday, String nameUser, int monthBirthday) {		//Função que recebe o dia do aniversario e nome do usuario
		final byte DAYLIMIT=30;																		//Definindo o dia limite como uma CONSTANTE.
		if(dayBirthday>DAYLIMIT) {																	//Se dia de aniversario do usuario foir maior que o dia de limite.
			System.out.println("Please, enter a valid value for the day of the month.");			//Texto para número do mês inválido.
			captureDates(nameUser);																	//Reinicia a captura de dados da data.
		} else {																					//Se não
			verifyZodiacSign(dayBirthday, monthBirthday, nameUser);   								//Iniciar função para verificar qual o signo da pessoa.
		}
	}
	
	//----------- VALIDAÇÃO PARA MESES COM 29 DIAS --------------//
	public static void validationTwentyNine(byte dayBirthday, String nameUser, int monthBirthday){	//Função que recebe o dia do aniversario e nome do usuario
		final byte DAYLIMIT=29;																		//Definindo o dia limite como uma CONSTANTE.
		if(dayBirthday>DAYLIMIT) {																	//Se dia de aniversario do usuario foir maior que o dia de limite.
			System.out.println("Please, enter a valid value for the day of the month.");			//Texto para número do mês inválido.
			captureDates(nameUser);																	//Reinicia a captura de dados da data.
		} else {																					//Se não
			verifyZodiacSign(dayBirthday, monthBirthday, nameUser);    								//Iniciar função para verificar qual o signo da pessoa.
		}
	}
	
	//----------- VERIFICANDO O SIGNO DO USUARIO --------------//
	private static void verifyZodiacSign(byte dayBirthday, int monthBirthday, String nameUser) {
		
		if(dayBirthday>=21 && monthBirthday==3 || dayBirthday<=20 && monthBirthday==4) {
			System.out.println(nameUser+ " seu signo e ARIES!");
		} else if(dayBirthday>=21 && monthBirthday==4 || dayBirthday<=20 && monthBirthday==5) {
			System.out.println(nameUser+ " seu signo e TOURO!");
		} else if(dayBirthday>=21 && monthBirthday==5 || dayBirthday<=20 && monthBirthday==6) {
			System.out.println(nameUser+ " seu signo e GEMEOS!");
		} else if(dayBirthday>=21 && monthBirthday==6 || dayBirthday<=22 && monthBirthday==7) {
			System.out.println(nameUser+ " seu signo e CANCER!");
		} else if(dayBirthday>=23 && monthBirthday==7 || dayBirthday<=22 && monthBirthday==8) {
			System.out.println(nameUser+ " seu signo e LEAO!");
		} else if(dayBirthday>=23 && monthBirthday==8 || dayBirthday<=22 && monthBirthday==9) {
			System.out.println(nameUser+ " seu signo e VIRGEM!");
		} else if(dayBirthday>=23 && monthBirthday==9 || dayBirthday<=22 && monthBirthday==10) {
			System.out.println(nameUser+ " seu signo e LIBRA!");
		} else if(dayBirthday>=23 && monthBirthday==10 || dayBirthday<=21 && monthBirthday==11) {
			System.out.println(nameUser+ " seu signo e ESCORPIAO!");
		} else if(dayBirthday>=22 && monthBirthday==11 || dayBirthday<=21 && monthBirthday==12) {
			System.out.println(nameUser+ " seu signo e SAGITARIO!");
		} else if(dayBirthday>=22 && monthBirthday==12 || dayBirthday<=20 && monthBirthday==1) {
			System.out.println(nameUser+ " seu signo e CAPRICORNIO!");
		} else if(dayBirthday>=21 && monthBirthday==1 || dayBirthday<=18 && monthBirthday==2) {
			System.out.println(nameUser+ " seu signo e AQUARIO!");
		} else if(dayBirthday>=19 && monthBirthday==2 || dayBirthday<=20 && monthBirthday==3) {
			System.out.println(nameUser+ " seu signo e PEIXES!");
		} else {
			System.out.println(nameUser+"Voce se superou! Como voce chegou ate aqui?!");
		}
		
	}
	
}