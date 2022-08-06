import java.util.Scanner;

// entrar com um numero de 3 digitos e inverte-los
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, centenas, dezenas, unidades, resto;

        System.out.println("Escreva um numero com 3 digitos:");
        numero = teclado.nextInt();

        centenas = numero / 100;
        resto = numero % 100;

        dezenas = resto / 10;

        unidades = resto % 10;

        System.out.printf("%d%d%d\n", unidades, dezenas, centenas);

        teclado.close();
    }
}
