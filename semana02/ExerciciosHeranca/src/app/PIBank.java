package app;

import model.Conta;
import model.ContaEspecial;

public class PIBank {

	public static void main(String[] args) {
		Conta c1 = new Conta("Alexandre", "123.456.789-00", 1234, 2000);
		
		// ContaEspecial eh uma Conta		
		Conta c2 = new ContaEspecial("Alexandre", "123.456.789-00", 1234, 2000, 300);

		System.out.println(c1);
		System.out.println(c2);
	}

}
