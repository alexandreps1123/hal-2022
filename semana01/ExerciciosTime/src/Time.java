
public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String exibirHoraUniversal() {
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
	
	public String exibirHoraPadrao() {
		String sufixo = "PM";
		
		if(this.hora == 0) {
			this.setHora(12);
			sufixo = "AM";
		}
		if(this.hora > 0 && this.hora < 12) {
			sufixo = "AM";
		}
		else if (this.hora < 12 && this.hora >= 23) {
			this.setHora(this.hora -12);
		}
		
		return this.hora + ":" + this.minuto + ":" + this.segundo + sufixo;
	}
	
}
