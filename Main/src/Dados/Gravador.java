package Dados;

import classes.ContaBancaria;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Gravador {
    
    File diretorio;
      File arquivoTXT;

      public void criarDiretorios(){

        diretorio = new File("C:Dados/contas.txt");

        if(diretorio.mkdirs()){
          JOptionPane.showMessageDialog(null, "Diretório criado com sucesso");
          
        }else{

          if(diretorio.exists()){
            JOptionPane.showMessageDialog(null, "O diretório já existe");
          }else{
            JOptionPane.showMessageDialog(null, "O diretório não foi criado");
          }

        }

      }

      public void criarArquivo(){

        arquivoTXT = new File(diretorio,"teste.txt");

        try {

          if(arquivoTXT.createNewFile()){
            JOptionPane.showMessageDialog(null, "arquivo criado com sucesso");
          }else{
            if(arquivoTXT.exists()){
              JOptionPane.showMessageDialog(null, "O arquivo já existe");
            }else{
              JOptionPane.showMessageDialog(null, "O arquivo não foi criado");
            }
          }

        } catch (IOException ex) {
          Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

      }

      public void escritaEmArquivo(String mensagem){

        try {

          FileWriter escrita = new FileWriter(arquivoTXT);
          PrintWriter saida = new PrintWriter(escrita);

          saida.write(mensagem);

          saida.close();
          escrita.close();

        } catch (IOException ex) {
          Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    
    
}
