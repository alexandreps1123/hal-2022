import java.util.Scanner;

// calcular volume de um cubo, a partir do lado
public class Exercicio02g {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado;
        double volumeCubo;

        System.out.println("Digite o valor da lado do cubo:");
        lado = teclado.nextDouble();

        volumeCubo = Math.pow(lado, 3);

        System.out.printf("Volume do cubo: %.2f\n", volumeCubo);

        teclado.close();
    
    }
    
}