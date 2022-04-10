package Exerc3;

public class Circulo implements FormaGeometrica {

	
	public String cor() {
		return "Azul";
	}


	public String quantidadeDeLados() {
		return "Infinitos lados";
	}

	
	public double area(double raio , double raio1) {
		
		return raio * raio * 3.14;
	}
	
}
