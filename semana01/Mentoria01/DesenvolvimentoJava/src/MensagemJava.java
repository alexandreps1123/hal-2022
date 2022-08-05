
public class MensagemJava {

	public static void main(String[] args) {
		
//		entradas
		String nome="Alexandre Ferreira";
		int idade = 29;
		
		int num1=10;
		int num2=20;
		
//		processamento
		float resultado_soma= num2 + num1;
		float resultado_sub= num2 - num1;
		float resultado_mul= num2 * num1;
		float resultado_div= num2 / num1;
		
//		saidas
		System.out.printf("Olá %s você tem %d anos.\n", nome, idade);
		
		System.out.printf("O resultado da adição entre %d+%d é igual %.2f.\n", num2, num1, resultado_soma);
		System.out.printf("O resultado da subtração entre %d-%d é igual %.2f.\n", num2, num1, resultado_sub);
		System.out.printf("O resultado da divisão entre %d/%d é igual %.2f.\n", num2, num1, resultado_div);
		System.out.printf("O resultado da multiplicação entre %d*%d é igual %.2f.\n", num2, num1, resultado_mul);

	}

}
