import java.util.Scanner;

// calcular area de um trapezio, a partir das bases e da altura
public class Exercicio02e {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double baseMaior;
        double baseMenor;
        double altura;
        double areaTrapezio;

        System.out.println("Digite o valor da base maior do trapezio:");
        baseMaior = teclado.nextDouble();

        System.out.println("Digite o valor da base menor do trapezio:");
        baseMenor = teclado.nextDouble();

        System.out.println("Digite o valor da altura do trapezio:");
        altura = teclado.nextDouble();

        areaTrapezio = (baseMaior + baseMenor) * altura / 2.0;

        System.out.printf("Area do trapezio: %.2f\n", areaTrapezio);

        teclado.close();
    
    }
    
}