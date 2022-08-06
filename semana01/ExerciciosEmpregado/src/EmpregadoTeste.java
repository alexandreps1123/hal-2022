
public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado e = new Empregado("Alexandre", 20000.00);

		System.out.println(e.exibir());
		
		e.aumentarSalario(10);
		System.out.println(e.exibir());
	}

}
