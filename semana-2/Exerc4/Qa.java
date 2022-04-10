package Exerc4;

public class Qa extends Funcionario {

	String senioridade;
	
	public Qa(String name, String cpf, double salario, String senioridade) {
		super(name,cpf,salario);
		this.senioridade = senioridade;
	}

	public double bonusSalario(double bonus) {
		return (this.getSalario() * 0.15) + bonus;
	}

}