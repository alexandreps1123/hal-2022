import java.util.Scanner;

public class Exercicio03 {
    /*
     * 100kW corresponde 1/7 salario minimo
     * recebe salario minimo e
     * quantidade em kW gasta por uma residencia
     * a) calcular valor em reais de cada kW
     * b) calcular valor em reais a ser pago
     * c) calcular valor em reais a ser pago, com desconto de 10%
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioMin;
        double consumoResidencia;
        double desconto = 0.9;
        double valorUnidadekW;
        double valorPagar;
        double valorComDesconto;

        System.out.println("Digite o valor do salario minimo:");
        salarioMin = teclado.nextDouble();

        System.out.println("Digite a quantidade consumida em kW:");
        consumoResidencia = teclado.nextDouble();

        valorUnidadekW = salarioMin/ (7.0 *100.0);
        valorPagar = consumoResidencia * valorUnidadekW;
        valorComDesconto = desconto * valorPagar;

        System.out.printf("valor em reais de cada kW: %.2f\n", valorUnidadekW);
        System.out.printf("valor total a ser pago em reais: %.2f\n", valorPagar);
        System.out.printf("valor total a ser pago em reais com desconto de 10%%: %.2f\n", valorComDesconto);

        teclado.close();
    }
}
