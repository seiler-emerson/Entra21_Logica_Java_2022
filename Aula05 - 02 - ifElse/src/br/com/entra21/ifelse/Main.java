package br.com.entra21.ifelse;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo a usar o if com o else");

		if(true) {
			System.out.println("Vao passar aqui quando a condi��o resultar em true");
		} else {
			System.out.println("Vao passar aqui quando a condi��o resultar em false");
		}
		
		byte idade=15;
		
		if(idade>17) {
			System.out.println("Essa pessoa � maior de idade.");
		} else {
			System.out.println("Essa pessoa n�o � maior de idade.");
		}
	}

}
