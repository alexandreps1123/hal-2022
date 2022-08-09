package model;

public class Chefe extends Funcionario {
	private float salarioBAse;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getSalarioBAse() {
		return salarioBAse;
	}

	public void setSalarioBAse(float salarioBAse) {
		this.salarioBAse = salarioBAse;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
}
