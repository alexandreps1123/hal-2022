package semana01.Exercicios;

import java.util.Scanner;

// calcular area de um quadrado, a partir dos lados
public class Exercicio02a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1;
        double lado2;
        double areaQuadrado;

        lado1 = teclado.nextDouble();
        lado2 = teclado.nextDouble();

        areaQuadrado = lado1 * lado2;

        System.out.printf("%.2f\n", areaQuadrado);

        teclado.close();
    }
}
