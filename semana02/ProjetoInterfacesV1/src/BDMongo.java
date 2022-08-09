
public class BDMongo implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Conectou Mongo");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("Executou Mongo "+comando);
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectou Mongo");
		
	}

}
