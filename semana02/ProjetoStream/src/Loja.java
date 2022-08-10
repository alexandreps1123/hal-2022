import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Loja {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "celular", 1000));
		lista.add(new Produto(2, "armazem", 2000));
		lista.add(new Produto(3, "bateria", 3000));
		
		lista.stream().forEach((p) -> {
			System.out.println(p);
		});
		
		System.out.println("Produtos em ordem alfabetica");
		lista.stream().sorted(Comparator.comparing(p->p.getNome()))
						.forEach(p->System.out.println(p));
		
		System.out.println("Produto mais caro");
		Produto produtoMaisCaro;
		produtoMaisCaro = lista.stream().max(Comparator.comparing(p->p.getPreco()))
										.orElse(null);
		
		if(produtoMaisCaro != null) {
			System.out.println(produtoMaisCaro);
		}
	}

}
