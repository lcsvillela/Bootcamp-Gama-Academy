package Exerc3;

public class TrianguloRetangulo implements FormaGeometrica {

	
	public String cor() {
		
		return "Amarelo";
	}

	
	public String quantidadeDeLados() {
		
		return "Três lados";
	}

	
	public double area(double base, double altura) {
		
		return (base*altura)/2;
	}

}