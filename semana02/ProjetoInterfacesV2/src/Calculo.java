
public class Calculo implements Interface1, Interface2{
	public void realizaCalculo() {
		System.out.println("Feito o calculo solicitado");
	}

	@Override
	public void calculo2() {
		realizaCalculo();
	}

	@Override
	public void calculo1() {
		realizaCalculo();
	}
}
