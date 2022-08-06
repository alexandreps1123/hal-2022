import java.util.Scanner;

// calcular area de um triangulo, a partir da base e da altura
public class Exercicio02c {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        double altura;
        double areaTriangulo;

        System.out.println("Digite o valor da base do triangulo:");
        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do retangulo:");
        altura = teclado.nextDouble();

        areaTriangulo = base * altura / 2.0;

        System.out.printf("Area do triangulo: %.2f\n", areaTriangulo);

        teclado.close();
    
    }
}