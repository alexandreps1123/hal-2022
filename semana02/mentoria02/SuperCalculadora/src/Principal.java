import java.util.Scanner;

public class Principal {
	
	static void menu() {
		System.out.println("Escolha uma opcao:");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("0 - Sair");
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2;
		String opcao;
		
		System.out.println("Informe o primeiro numero:");
		num1 = teclado.nextDouble();
		
		System.out.println("Informe o segundo numero:");
		num2 = teclado.nextDouble();
		
		teclado.nextLine();
		
		do {
			menu();
			opcao = teclado.nextLine();
			
			switch (opcao) {
				case "1":
					OperacaoAdicao somar = new OperacaoAdicao();
					somar.adicao(num1, num2);
					break;
				case "2":
					OperacaoSubtracao subtrair = new OperacaoSubtracao();
					subtrair.subtracao(num1, num2);
					break;
				case "3":
					OperacaoMultiplicacao multiplicar = new OperacaoMultiplicacao();
					multiplicar.multiplicacao(num1, num2);
					break;
				case "4":
					OperacaoDivisao dividir = new OperacaoDivisao();
					dividir.divisao(num1, num2);
					break;
					
				case "0":
					teclado.close();
					return;
					
				default:
					System.out.println("Opcao invalida.");
			}
		}while(true);
		
	}

}

//Programa:SuperCalculadora
//5 classes.
//
//1ª Classe - Principal
//Entrada de dois Números
//Menu Switch Case 
//1 - Adição
//2 - Subtração
//3 - Multiplicação
//4 - Divisão
//
//2ª recebe dois parâmetros e executa o calculo com println(adição)
//3ª recebe dois parâmetros e executa o calculo com println(subtração)
//4ªrecebe dois parâmetros e executa o calculo com println(multiplicação)
//5ªrecebe dois parâmetros e executa o calculo com println(divisão)

