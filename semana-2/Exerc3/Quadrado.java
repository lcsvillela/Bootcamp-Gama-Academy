package Exerc3;

public class Quadrado implements FormaGeometrica{

	
	public String cor() {
		return "Vermelho";
	}

	
	public String quantidadeDeLados() {
		
		return "Quatro lados";
	}

	
	public double area(double lado1, double lado2) {
		
		return lado1 * lado2;
	}

}