package br.com.entra21.elseif;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre else if (ou seja o if antes do else)");

		float altura=1.5f;
		double dinheiro=2300;
		
		if(altura<=1.5) {
			System.out.println("é baixo");
		} else if(altura<=1.9f) {
			System.out.println("é alto");
		} else {
			//mesmo que não queira fazer nada aqui, por boa pratica é bom existir.
		}
		
		
		//se até 1200, ate 1800, ate 2000, qualquer valor acima.
		if(dinheiro<=1200) {
			System.out.println("Salario minimo");
		} else if(dinheiro<=1800) {
			System.out.println("ta ficando rico");
		} else if(dinheiro<=2000) {
			System.out.println("me empresta :)");
		} else {
			System.out.println("Me contrata vai.");
		}
		
	}

}
