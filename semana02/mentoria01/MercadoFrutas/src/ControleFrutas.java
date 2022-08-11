import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas {
	
	static void menu() {
		System.out.println("Escolha uma opcao:");
		System.out.println("1 - Cadastrar fruta");
		System.out.println("2 - Listar Frutas");
		System.out.println("3 - Excluir fruta");
		System.out.println("4 - Listar fruta por ID");
		System.out.println("5 - Modificar uma fruta");
		System.out.println("0 - Sair");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();
		String indice;
		String fruta;
		String opcao;
		
		do {
			menu();
			opcao = teclado.nextLine();
			
			switch(opcao) {
				case "1":
					fruta = teclado.nextLine();
					frutas.add(fruta);
					break;
					
				case "2":
					for(String frutaLista: frutas) {
						System.out.println(frutaLista);
					}
					break;
					
				case "3":
					indice = teclado.nextLine();
					frutas.remove(Integer.parseInt(indice));
					break;
					
				case "4":
					indice = teclado.nextLine();
					System.out.println(frutas.get(Integer.parseInt(indice))); 
					break;
					
				case "5":
					System.out.println("Informe o indice:");
					indice = teclado.nextLine();
					
					System.out.println("Informe a nova fruta:");
					fruta = teclado.nextLine();
					
					System.out.println("Fruta anterior: "+frutas.get(Integer.parseInt(indice)));
					frutas.set(Integer.parseInt(indice), fruta);
					
					System.out.println("Nova fruta: "+frutas.get(Integer.parseInt(indice)));
					break;
					
				case "0":
					teclado.close();
					return;
					
				default:
					System.out.println("opcao invalida");
			}		
		}while(true);
	}
}
