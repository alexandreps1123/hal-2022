
public class MeuSistema {
	public static void main(String[] args) {
		InterfaceBD ibd = new BDMySQL();
		InterfaceBD ibdMongo = new BDMongo();
		
		ibd.conectar();
		ibd.executar("SELECT * FROM tb_alexandre");
		ibd.desconectar();
		
		
		ibdMongo.conectar();
		ibdMongo.executar("SELECT * FROM tb_alexandre");
		ibdMongo.desconectar();
	}
}
