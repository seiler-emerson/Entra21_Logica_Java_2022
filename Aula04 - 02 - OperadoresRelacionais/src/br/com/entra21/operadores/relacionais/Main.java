package br.com.entra21.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operadores Relacionais");

		System.out.println("Menor < (Dica voltando ou apagando) ");
		
		byte idadeA=30, idadeB=30;
		boolean resultado;
		
		resultado = idadeA < idadeB; //idadeA � menor que idadeB?
		
		System.out.println("idadeA � menor(<) que idadeB? "+resultado);
		
		System.out.println("idadeA � menor(<) que idadeB? "+(idadeA<idadeB));
		
		resultado = idadeA <= idadeB;
		
		System.out.println(idadeA+" � menor ou igual(<=) que "+idadeB+"? "+resultado);
		
		System.out.println("Maior > (Dica em frnete) ");
		resultado = idadeA > idadeB;
		
		System.out.println(idadeA+" � maior(>) que "+idadeB+"? "+resultado);
		
		resultado = idadeA >= idadeB;
		
		System.out.println(idadeA+" � maior ou igual(>=) que "+idadeB+"? "+resultado);
		
	}

}
