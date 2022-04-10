package Exerc4;

public class Program {

	public static void main(String[] args) {

		Funcionario func1 = new Desenvolvedor("João", "111.111.111-11", 1200.0,"Junior");		
		Funcionario func2 = new Qa("Maria", "000.000.000-00", 2200.0,"Pleno");
		
		
		System.out.println("Bonus do desenvolvedor: " + func1.bonusSalario(400)); 
		System.out.println("Bonus do Qa: " + func2.bonusSalario(400)); 
		
	}

}