import java.util.Scanner;

/*
 * ler coordenadas X e Y, quantidade indeterminada
 * escrever o quadrante de cada par ordenado
 * encerra se algum valor for NULA (não escreve mensagem)
 * 
 */

public class BC1115 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int y;

        do {
            x = teclado.nextInt();
            y = teclado.nextInt();

            if(x ==0 || y == 0) {
                teclado.close();
                break;
            } 
            else if(x > 0 && y > 0) System.out.println("primeiro");
            else if(x < 0 && y > 0) System.out.println("segundo");
            else if(x < 0 && y < 0) System.out.println("terceiro");
            else System.out.println("quarto");
                
        } while(true);
        
    }
}
