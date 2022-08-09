
public class MostraCalculo {

	public static void main(String[] args) {

		Calculo o = new Calculo();
		Interface1 c1 = o;
		Interface2 c2 = o;
		
		c1.calculo1();
		
		c2.calculo2();

	}

}
