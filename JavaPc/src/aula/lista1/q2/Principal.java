package aula.lista1.q2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print(" Escolha seu ingresso [1 - normal] [2 - VIP]: ");
        int opcao = leitor.nextInt();

        if(opcao == 1){
            System.out.println(" -> Ingresso NORMAL");
            //valorIngresso;
        }else{
            System.out.println(" -> Ingresso VIP");
            
            System.out.print(" Escolha  [1 - superior] [2 - inferior]: ");
            opcao = leitor.nextInt();
            
            if (opcao == 1) {
                
            } else {
                
            }
            //valorIngresso;
        }
    }
}
