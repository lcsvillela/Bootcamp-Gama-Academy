import java.util.*;

class Vota{


        public static void main(String[] args) {
            int aluno_1 = 0, aluno_2 = 0, aluno_3 = 0, aluno_4 = 0, votacao = 0;
            int escolha;
            
            String nome_1, nome_2, nome_3, nome_4;

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do aluno 1: ");
            nome_1 = sc.nextLine();
            System.out.println("Digite o nome do aluno 2: ");
            nome_2 = sc.nextLine();
            System.out.println("Digite o nome do aluno 3: ");
            nome_3 = sc.nextLine();
            System.out.println("Digite o nome do aluno 4: ");
            nome_4 = sc.nextLine();


            while (votacao < 5){
            
                votacao++;

                System.out.println("Em qual aluno você vota?\n" + nome_1 +": 1\n");
                System.out.println(nome_2 + ": 2\n" );
                System.out.println(nome_3 + ": 3\n" + nome_4 + ": 4\n");

                escolha = sc.nextInt();
                if ( escolha == 1)
                    aluno_1++;
                if ( escolha == 2)
                    aluno_2++;
                if ( escolha == 3)
                    aluno_3++;
                if ( escolha == 4)
                    aluno_4++;

                  
            }
        

        if ( aluno_1 > aluno_2 && aluno_1 > aluno_3 && aluno_1 > aluno_4){
        System.out.println("Resultado: " +"Vencedor: "+ nome_1 + ":"+aluno_1+ "\n");
        System.out.println("Resultado: " +"Perdedor: "+ nome_2 + ":"+aluno_2+ "\n");
        System.out.println("Resultado: " +"Perdedor: "+ nome_3 + ":"+aluno_3+ "\n");
        System.out.println("Resultado: " +"Perdedor: "+ nome_4 + ":"+aluno_4+ "\n");
        }
        
           if ( aluno_2 > aluno_1 && aluno_2 > aluno_3 && aluno_2 > aluno_4){
        System.out.println("Resultado: " +"Perdedor: "+ nome_1 + ":"+aluno_1+ "\n");
        System.out.println("Resultado: " +"Vencedor: "+ nome_2 + ":"+aluno_2+ "\n");
        System.out.println("Resultado: " +"Perdedor: "+ nome_3 + ":"+aluno_3+ "\n");
        System.out.println("Resultado: " +"Perdedor: "+ nome_4 + ":"+aluno_4+ "\n");
        }
        
        if ( aluno_3 > aluno_1 && aluno_3 > aluno_2 && aluno_3 > aluno_4){
        System.out.println("Resultado: " +"Perdedor: "+ nome_1 + ":"+aluno_1+ "\n");
        System.out.println("Resultado: " +"Perdedor: "+ nome_2 + ":"+aluno_2+ "\n");
        System.out.println("Resultado: " +"Vencedor: "+ nome_3 + ":"+aluno_3+ "\n");
        System.out.println("Resultado: " +"Perdedor: "+ nome_4 + ":"+aluno_4+ "\n");
        }
        
                if ( aluno_4 > aluno_1 && aluno_4 > aluno_2 && aluno_4 > aluno_3){
        System.out.println("Resultado: " +"Perdedor: "+ nome_1 + ":"+aluno_1+ "\n");
        System.out.println("Resultado: " +"Perdedor: "+ nome_2 + ":"+aluno_2+ "\n");
        System.out.println("Resultado: " +"Perdedor: "+ nome_3 + ":"+aluno_3+ "\n");
        System.out.println("Resultado: " +"Vencedor: "+ nome_4 + ":"+aluno_4+ "\n");
        }
        
        }

}
