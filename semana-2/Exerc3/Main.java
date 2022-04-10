package Exerc3;

public class Main {

	public static void main(String[] args) {
	
		Retangulo ret = new Retangulo();
		Circulo cir = new Circulo();
		Quadrado quad = new Quadrado();
		TrianguloRetangulo tri = new TrianguloRetangulo();
		
		
		System.out.println(ret.cor());
		System.out.println(ret.quantidadeDeLados());
		System.out.println(ret.area(2,4));
		System.out.println();
		
		System.out.println(cir.cor());
		System.out.println(cir.quantidadeDeLados());
		System.out.println(cir.area(2,2));
		System.out.println();
		
		System.out.println(quad.cor());
		System.out.println(quad.quantidadeDeLados());
		System.out.println(quad.area(2,6));
		System.out.println();
		
		System.out.println(tri.cor());
		System.out.println(tri.quantidadeDeLados());
		System.out.println(tri.area(3,4));
		
		
	}

}
