import java.util.Scanner;

/*
 * ler um valor inteiro N (1 < N < 1000)
 * N = quantidade de linhas de saída
 */

public class BC1143 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", (i+1), (i+1) * (i+1), (i+1) * (i+1) * (i+1));
        }

        teclado.close();
    }
}
