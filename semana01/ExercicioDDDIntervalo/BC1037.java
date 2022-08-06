import java.util.Scanner;

/*
* ler um numero
* mensagem se esta nos intervalos
* [0, 25], (25, 50], (50, 75], (75, 100]
* foram do intervalo imprime "Fora do intervalo"
*/

public class BC1037 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		double numero = teclado.nextDouble();

		if(numero >= 0 && numero <= 25.0) System.out.println("Intervalo [0, 25]");
		else if(numero > 25.0 && numero <= 50.0) System.out.println("Intervalo (25, 50]");
		else if(numero > 50.0 && numero <= 75.0) System.out.println("Intervalo (50, 75]");
		else if(numero > 75.0 && numero <= 100.0) System.out.println("Intervalo (75, 100]");
		else System.out.println("Fora do intervalo");
		
		teclado.close();
	}
}
