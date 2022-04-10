import java.util.*;
import java.lang.Math;
class Random{


    public static void main(String[] args){
    
        int number, choice = -1;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        number = (int) (Math.random() * 10) + 0;

        while (choice != number){
        
            System.out.println("Adivinhe o número: ");
            choice = sc.nextInt();

            if( choice == number){

                System.out.println("Parabéns, você acertou!");
            }else{

                if( choice < number){

                    System.out.println("Um pouco mais");

                }else{

                    System.out.println("Um pouco menos");
                }
            }
        
        }

    }


}
