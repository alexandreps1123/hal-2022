
public class Empregado {
	// atributos	
	private String nome;
	private double salario;
	
	// construtor
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	//	getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// metodos customizados
	public String exibir() {
		return "nome: " + this.nome + ", salario: " + this.salario + "R$";
	}
	
	public void aumentarSalario(double percentual) {
		this.salario *= (100 + percentual)/100.0; 
	}
}
