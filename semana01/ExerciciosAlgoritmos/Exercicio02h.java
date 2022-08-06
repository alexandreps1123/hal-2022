import java.text.CollationElementIterator;
import java.util.Scanner;

// calcular volume de um cilindro, a partir do diametro e da altura
public class Exercicio02h {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double diametro;
        double altura;
        double volumeCilindro;

        System.out.println("Digite o valor do diametro do cilindro:");
        diametro = teclado.nextDouble();

        System.out.println("Digite o valor da altura do cilindro:");
        altura = teclado.nextDouble();

        volumeCilindro = Math.PI * Math.pow(diametro/2.0, 2) * altura;

        System.out.printf("Volume do cilindro: %.2f\n", volumeCilindro);

        teclado.close();
    
    }
    
}