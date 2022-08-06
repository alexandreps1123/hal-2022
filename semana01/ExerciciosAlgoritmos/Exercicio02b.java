import java.util.Scanner;

// calcular area de um retangulo, a partir da base e da altura
public class Exercicio02b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        double altura;
        double areaRetangulo;

        System.out.println("Digite o valor da base do retangulo:");
        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do retangulo:");
        altura = teclado.nextDouble();

        areaRetangulo = base * altura;

        System.out.printf("Area do retangulo: %.2f\n", areaRetangulo);

        teclado.close();
    }   
}
