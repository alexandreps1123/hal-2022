import java.util.Scanner;

public class ProcessaCalculos {

	public static void main(String[] args) {
		// entrada
		Scanner teclado = new Scanner(System.in);
		int resultado, num1, num2;
		
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
		
//		processamento
		resultado = num1 + num2;
		
//		saida
		System.out.printf("O resultado da soma entre %d+%d é ugual a %d.\n", num1, num2, resultado);

		teclado.close();
	}

}
