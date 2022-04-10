package Exerc4;

public class Desenvolvedor extends Funcionario {

	String senioridade;
	
	public Desenvolvedor(String name, String cpf, double salario, String senioridade) {
		super(name,cpf,salario);
		this.senioridade = senioridade;
	}

	public double bonusSalario(double bonus) {
		return (this.getSalario()* 0.1) + bonus;
	}

}
