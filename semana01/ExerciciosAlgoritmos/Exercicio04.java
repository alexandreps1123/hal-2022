import java.util.Scanner;

/*
 * calcula salario liquido
 * entrada: valor hora
 *          quantidade de horas trabalhadas
 *          percentagem de desconto INSS
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorHora;
        double quantidadeHoras;
        double descontoINSS;
        double salarioLiquido;

        System.out.println("Digite o valor da hora trabalhada:");
        valorHora = teclado.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        quantidadeHoras = teclado.nextDouble();

        System.out.println("Digite a porcentagem a ser descontada pelo INSS:");
        descontoINSS = teclado.nextDouble();

        salarioLiquido = valorHora * quantidadeHoras * (100-descontoINSS) / 100.0;

        System.out.printf("salario liquido: %.2f\n", salarioLiquido);

        teclado.close();
    }
}
