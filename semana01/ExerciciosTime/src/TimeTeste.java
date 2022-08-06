
public class TimeTeste {

	public static void main(String[] args) {
		Time horaTrabalho = new Time();
		
		horaTrabalho.setTime(0, 0, 0);

		System.out.println(horaTrabalho.exibirHoraPadrao());
		System.out.println(horaTrabalho.exibirHoraUniversal());
	}

}
