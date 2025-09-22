package aulas;

import javax.swing.JOptionPane;

public class aula02 {

    public static void main(String[] args) {
        // TODO code application logic here
        int resposta = JOptionPane.showConfirmDialog(null, "Minha primeira mensagem");
        
        if (resposta == 0) {
            JOptionPane.showMessageDialog(null, "você respondeu sim");
        }
        else if (resposta == 1) {
            JOptionPane.showMessageDialog(null, "você respondeu não");
        }
        /*
        Divide a string com base em uma expressão regular.
        String frase = "Java é incrível";
        String[] palavras = frase.split(" "); // ["Java", "é", "incrível"]

        Converte para minúsculas ou maiúsculas.
        String minusculo = nome.toLowerCase(); // "maicon"
        String maiusculo = nome.toUpperCase(); // "MAICON"

        Compara duas strings
        boolean igual = nome.equals("Maicon"); // true
        
        Remove espaços no inicio e fim das frases
        String texto = "  Olá  ";
        String limpo = texto.trim(); // "Olá"

        */
    }
    
}
