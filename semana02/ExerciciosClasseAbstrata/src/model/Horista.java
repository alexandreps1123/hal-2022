package model;

public class Horista extends Funcionario {
	private float valorHora;
	private int numeroHoras;
	
	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
}
