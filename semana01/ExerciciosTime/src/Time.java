
public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String exibirHoraUniversal() {
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
	
	public String exibirHoraPadrao() {
		if(this.hora >= 0 && this.hora < 12) {
			return this.hora + ":" + this.minuto + ":" + this.segundo + " AM";
		}
		else if (this.hora == 12) {
			return (this.hora) + ":" + this.minuto + ":" + this.segundo + " PM";
		}
		
		return (this.hora-12) + ":" + this.minuto + ":" + this.segundo + " PM";
	}
	
}
