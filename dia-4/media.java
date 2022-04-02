import java.util.*;

class Media{


    public static void main(String[] args) {
        String nome;
        double nota_1;
        double nota_2;
        double resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do discente: ");
        nome = sc.nextLine();
        System.out.println("Dita a nota da primeira prova: ");
        nota_1 = sc.nextDouble();
        System.out.println("Digite a nota da segunda prova: ");
        nota_2 = sc.nextDouble();
        resultado = (nota_1+nota_2)/2;
    
        if ( resultado >= 6){
            System.out.println(nome +" aprovado com uma média de: " + resultado);
    }
        else{
            System.out.println(nome +" reprovado com uma média de: " + resultado);
        }
    }


    
}
