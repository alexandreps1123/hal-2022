import java.util.Scanner;

/*
 * ler 4 valores inteiros A, B, C e D
 * se B maior que C
 * e D maior que A
 * e C+D maior que A+B
 * e C e D maior igual a 0
 * e A par
 * escrever "Valores aceitos"
 * se não "Valores nao aceitos"
 */
public class BC1035 {

    static boolean valida(int A, int B, int C, int D) {
        return B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();

        if(valida(A, B, C, D)) {
            System.out.println("Valores aceitos");
        }
        else
            System.out.println("Valores nao aceitos");

        teclado.close();
    }   
}
