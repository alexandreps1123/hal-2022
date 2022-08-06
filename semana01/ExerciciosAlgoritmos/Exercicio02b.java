package semana01.Exercicios;

import java.util.Scanner;

// calcular area de um retangulo, a partir da base e da altura
public class Exercicio02b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        double altura;
        double areaRetangulo;

        base = teclado.nextDouble();
        altura = teclado.nextDouble();

        areaRetangulo = base * altura;

        System.out.printf("%.2f\n", areaRetangulo);

        teclado.close();
    }   
}
