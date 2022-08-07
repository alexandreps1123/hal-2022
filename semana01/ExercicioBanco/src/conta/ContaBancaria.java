package conta;

public class ContaBancaria {
	// atributos
	int numeroConta;
	String digitoVerificador;
	String nomeTitular;
	String cpfTitular;
	double saldo;

	//	construtor
	public ContaBancaria(int numeroConta, String digitoVerificador, String nomeTitular, String cpfTitular,
			double saldo) {
		this.numeroConta = numeroConta;
		this.digitoVerificador = digitoVerificador;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
	}

	// getters e setters	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	// toString
	@Override
	public String toString() {
		return "ContaBancaria [numeroConta=" + numeroConta + ", digitoVerificador=" + digitoVerificador
				+ ", nomeTitular=" + nomeTitular + ", cpfTitular=" + cpfTitular + ", saldo=" + saldo + "]";
	}

	// metodos personalizados
	public void depositar(double valor) {
		this.saldo += valor; 
	}
	
	public boolean sacar(double valor) {
		if(valor < this.saldo) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
}
