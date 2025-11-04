package execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conferir {
    int n1, n2;

    public int verificarTipo(int n1, int n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
                
        
        try {
            Conferir c = new Conferir();
    
        } catch (InputMismatchException e){
            System.out.println(" Erro no formato de numero!");
        } catch (NumberFormatException e){
            System.out.println(" Erro no formato de numero!");
        }
    }
    
}
