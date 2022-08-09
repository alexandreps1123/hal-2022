
public class BDMySQL implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Conectou MySQL");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("Executou MySQL "+comando);
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectou MySQL");
		
	}

}
