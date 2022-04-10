package Exerc3;

public class Retangulo implements FormaGeometrica {
	
	public String cor() {
		return "Verde";
	}

	
	public String quantidadeDeLados() {
		return "Quatro lados";
	}

	
	public double area(double base, double altura) {
		return base * altura;
	}

}