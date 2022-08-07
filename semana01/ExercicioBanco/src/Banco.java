import java.util.Scanner;

import conta.ContaBancaria;
import utilitarios.Utilitario;

public class Banco {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(1000, "1", "Alexandre", "12345678901", 100.00);
		Scanner teclado = new Scanner(System.in);
		int opcao;

		do {
			Utilitario.menu();
			opcao = teclado.nextInt();

			switch (opcao) {
				case 1:
					Utilitario.deposito(conta);
					break;
				case 2:
					Utilitario.saque(conta);
					break;
				case 3:
					System.out.println(conta);
					break;
				case 4:
					teclado.close();
					return;
				default:
					System.out.println("opcao invalida");
			}
		} while (true);
	}
	
}
