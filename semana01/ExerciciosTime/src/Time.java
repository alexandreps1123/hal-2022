
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
		return fmtNum(this.hora) + ":" + fmtNum(this.minuto) + ":" + fmtNum(this.segundo);
	}
	
	public String exibirHoraPadrao() {
		String sufixo = "PM";
		
		if(this.hora == 0) {
			this.hora = 12;
			sufixo = "AM";
		}
		if(this.hora > 0 && this.hora < 12) {
			sufixo = "AM";
		}
		else if (this.hora < 12 && this.hora >= 23) {
			this.hora -= 12;
		}
		
		return fmtNum(this.hora) + ":" + fmtNum(this.minuto) + ":" + fmtNum(this.segundo) + sufixo;
	}
	
	public String fmtNum(int num) {
		if(num < 10) {
			return "0"+num;
		}
		
		return String.valueOf(num);
	}
	
}
