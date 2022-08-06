import java.util.Scanner;

/*
 * ler um valor inteiro N (1 < N < 1000)
 * N = quantidade de linhas de saída
 * 
 * 
 */
public class BC1115 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        for(int i = 0; i < n; i++) {
            Math.pow(i+1, 1);
            System.out.printf("%d %d %d\n", Math.pow(i+1, 1), Math.pow(i+1, 2), Math.pow(i+1, 3));
        }

        teclado.close();
    }
}
