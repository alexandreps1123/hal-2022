package model;

public class Comissionado extends Funcionario {
	private float salarioBase;
	private float comissao;
	
	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	
}
