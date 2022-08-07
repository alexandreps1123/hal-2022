package utilitarios;

import java.util.Scanner;

import conta.ContaBancaria;

public class Utilitario {
	public static void menu() {
		System.out.println("Menu principal:");
		System.out.println("opcao 1 - deposito");
		System.out.println("opcao 2 - saque");
		System.out.println("opcao 3 - dados da conta");
		System.out.println("opcao 4 - sair da aplicacao");
	}
	
	public static void deposito(ContaBancaria conta) {
		Scanner teclado = new Scanner(System.in);
		double valor;
		
		System.out.println("Digite o valor a ser depositado:");
		valor = teclado.nextDouble();
		
		conta.depositar(valor);
	}
	
	public static void saque(ContaBancaria conta) {
		Scanner teclado = new Scanner(System.in);
		double valor;
		
		System.out.println("Digite o valor a ser sacado:");
		valor = teclado.nextDouble();
		
		if(conta.sacar(valor)) {
			System.out.println("Operacao realizada com sucesso!");
		}
		else System.out.println("Saldo Insuficiente...");
	}
	
}
