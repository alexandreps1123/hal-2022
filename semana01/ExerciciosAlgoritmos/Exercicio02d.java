import java.util.Scanner;

// calcular area de um losango, a partir das diagonais
public class Exercicio02d {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double diagonalMenor;
        double diagonalMaior;
        double areaLosango;

        System.out.println("Digite o valor da diagonal menor do losango:");
        diagonalMenor = teclado.nextDouble();

        System.out.println("Digite o valor da diagonal maior do losango:");
        diagonalMaior = teclado.nextDouble();

        areaLosango = diagonalMenor * diagonalMaior / 2.0;

        System.out.printf("Area do losango: %.2f\n", areaLosango);

        teclado.close();
    
    }
    
}