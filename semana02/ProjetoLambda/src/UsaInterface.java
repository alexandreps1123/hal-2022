
public class UsaInterface {
	public static void main(String[] args) {
		
		InterfaceServico i;
		
		// instancia anonima - nao tem um tipo associado que implementa a interface		
		i = new InterfaceServico() {
			
			@Override
			public void executa() {
				// TODO Auto-generated method stub
				System.out.println("Doidera...");
			}
		};
		
		i.executa();
		
		InterfaceServico i2 = new InterfaceServico() {
			
			@Override
			public void executa() {
				// TODO Auto-generated method stub
				System.out.println("Outra Doidera... sobreesrito");
			}
		};
		
		i2.executa();
		
		// usando lamba para melhorar a legibilidade
		// para utilizar a expressao lamba eh necessario que
		// a interface possua apenas um metodo
		// se houver mais metodos utilizar a instacia anonima		
		InterfaceServico i3 = () -> {
			System.out.println("Outra doidera");
		};
		
		i3.executa();
		
	}
}
