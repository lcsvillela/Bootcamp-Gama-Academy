package Exerc4;


public abstract class Funcionario {

	private String name;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		
	}

	
	public Funcionario(String name, String cpf, double salario) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.salario = salario;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public abstract double bonusSalario(double bonus);
	
	
}
