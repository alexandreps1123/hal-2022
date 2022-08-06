import java.util.Scanner;

/*
 * fonte lista dos carros, acessado 05/ago/2022
 * https://garagem360.com.br/50-carros-mais-vendidos-em-maio-de-2022-lista-completa/
 * 
*/

/*
	- Cadastrar 10 carros
	- 3 opcoes
	- 1 mostra todos os carros
	- 2 abra um pergunta para escolher o numero do carro e mostra o carro correspondente
	- 3 permite fechar o programa

	Default
*/
public class ProcessaLocacao {

    static void menu() {
        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Mostrar todos os carros");
        System.out.println("2 - Buscar carro por numero:");
        System.out.println("3 - Fechar o Programa!");
    }
    
    static void imprimirCarros(String carros[]) {
        for(int i = 0; i < carros.length; i++) {
            System.out.printf("%2d - %s\n", (i+1), carros[i]);
        }
        
    }
    
    static void imprimirCarroPorIndice(String carros[], int i) {
        System.out.printf("%2d - %s\n", (i+1), carros[i]);
    }

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        String [] carros = {"Gol", "Fiat Strada", "Onix", "HB20", "Onix Plus", 
        					"Fiat Argo", "Tracker", "Fiat Pulse", "Kicks", "Creta"};
        int opcao, numeroCarro;
        
        do {
            menu();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    imprimirCarros(carros);
                    break;
                case 2:
                    System.out.println("Digite um numero entre 1 e 10");
                    numeroCarro = teclado.nextInt();

                    imprimirCarroPorIndice(carros, numeroCarro-1);
                    break;
                case 3:
                    System.out.println("Programa Finalizado!");
                    
                    teclado.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
            
        }while (true);
	}

}