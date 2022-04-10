package Exerc2;

public class Aluno {

	private int matricula;
	private String nome;

	private double notaDeProva01;
	private double notaDeProva02;
	private double notaDeTrabalho;
	private double mediaPonderada;

	public Aluno(int matricula, String nome, double notaDeProva01, double notaDeProva02, double notaDeTrabalho) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.notaDeProva01 = notaDeProva01;
		this.notaDeProva02 = notaDeProva02;
		this.notaDeTrabalho = notaDeTrabalho;
	}

	public double getNotaDeProva01() {
		return notaDeProva01;
	}

	public void setNotaDeProva01(double notaDeProva01) {
		this.notaDeProva01 = notaDeProva01;
	}

	public double getNotaDeProva02() {
		return notaDeProva02;
	}

	public void setNotaDeProva02(double notaDeProva02) {
		this.notaDeProva02 = notaDeProva02;
	}

	public double getMediaPonderada() {
		return mediaPonderada;
	}

	public void calcularMedia() {
		double pesoDaProva = 1.5;
		double pesoDoTrabalho = 2;
		double soma = (this.notaDeProva01 * pesoDaProva) + (this.notaDeProva02 * pesoDaProva)
				+ (this.notaDeTrabalho * pesoDoTrabalho);
		this.mediaPonderada = soma / ((pesoDaProva * 2) + pesoDoTrabalho);
	}

	public int recuperacao() {
		if (this.mediaPonderada >= 7) {
			return 0;
		}
		return -1;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota01() {
		return notaDeProva01;
	}

	public void setNota01(double nota01) {
		this.notaDeProva01 = nota01;
	}

	public double getNota02() {
		return notaDeProva02;
	}

	public void setNota02(double nota02) {
		this.notaDeProva02 = nota02;
	}

	public double getNotaDeTrabalho() {
		return notaDeTrabalho;
	}

	public void setNotaDeTrabalho(double notaDeTrabalho) {
		this.notaDeTrabalho = notaDeTrabalho;
	}

}