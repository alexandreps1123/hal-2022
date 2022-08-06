package semana01.Exercicios;

import java.util.Scanner;

// calcular area de um triangulo, a partir da base e da altura
public class Exercicio02c {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        double altura;
        double areaTriangulo;

        base = teclado.nextDouble();
        altura = teclado.nextDouble();

        areaTriangulo = base * altura;

        System.out.printf("%.2f\n", areaTriangulo);

        teclado.close();
    
}