import java.util.Scanner;

// calcular volume de um paralelepipedo, a partir das dimensoes
public class Exercicio02f {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        double altura;
        double profundidade;
        double volumeParalelepipedo;

        System.out.println("Digite o valor da base do paralelepipedo:");
        base = teclado.nextDouble();

        System.out.println("Digite o valor da altura do paralelepipedo:");
        altura = teclado.nextDouble();

        System.out.println("Digite o valor da profundidade do paralelepipedo:");
        profundidade = teclado.nextDouble();

        volumeParalelepipedo = base * altura * profundidade;

        System.out.printf("Volume do paralelepipedo: %.2f\n", volumeParalelepipedo);

        teclado.close();
    
    }
    
}