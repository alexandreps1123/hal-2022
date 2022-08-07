
public class Comparando {
	
	static void comparaLocalMemoria(String s1, String s2) {
		if(s1 == s2) {
			System.out.println("Apontado para o mesmo endereco de memoria");
		}
		else System.out.println("Apontado para endereco de memoria diferente");
	}
	
	static void comparaConteudo(String s1, String s2) {
		if(s1.equals(s2)) {
			System.out.println("Conteudos iguais");
		}
		else System.out.println("Conteudos diferentes");
	}

	public static void main(String[] args) {
		String s1 = "teste";
		String s2;
		
		// aponta para o mesmo local de memoria		
		s2 = s1;
		
		// new aloca um novo espaco de memoria para o objeto		
		String s3 = new String("teste");
		String s4 = new String("teste");

		comparaLocalMemoria(s1, s2);
		comparaLocalMemoria(s3, s4);
		
		comparaConteudo(s1, s2);
		comparaConteudo(s3, s4);
		
		// novo espaco de memoria eh alocado		
		s2 = "outro role";
		
		comparaLocalMemoria(s1, s2);
		comparaConteudo(s1, s2);
	}

}
