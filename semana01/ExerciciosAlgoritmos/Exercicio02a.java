import java.util.Scanner;

// calcular area de um quadrado, a partir dos lados
public class Exercicio02a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1;
        double lado2;
        double areaQuadrado;

        System.out.println("Digite o valor do lado 1 do quadrado:");
        lado1 = teclado.nextDouble();

        System.out.println("Digite o valor do lado 2 do quadrado:");
        lado2 = teclado.nextDouble();

        areaQuadrado = lado1 * lado2;

        System.out.printf("Area quadrado: %.2f\n", areaQuadrado);

        teclado.close();
    }
}
