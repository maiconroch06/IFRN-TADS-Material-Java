package Dados;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Gravador {
    
    private File pasta;
    private File arquivo;

    public Gravador() {
        pasta = new File(System.getProperty("user.dir"), "dados");
        pasta.mkdirs();

        arquivo = new File(pasta, "contas.txt");
    }

    public void escritaEmArquivo(String texto){

        try {

          FileWriter escrita = new FileWriter(arquivo);
          PrintWriter saida = new PrintWriter(escrita);

          saida.write(texto);

          saida.close();
          escrita.close();

        } catch (IOException ex) {
          //Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

      }

    public void criarDiretorios(){

        pasta = new File("C:\\\\Dados\\\\contas.txt");

        if(pasta.mkdirs()){
          JOptionPane.showMessageDialog(null, "Diretório criado com sucesso");
        }else{
          if(pasta.exists()){
            JOptionPane.showMessageDialog(null, "O diretório já existe");
          }else{
            JOptionPane.showMessageDialog(null, "O diretório não foi criado");
          }
        }
      }

      public void criarArquivo(){

        arquivo = new File(pasta,"teste.txt");

        try {

          if(arquivo.createNewFile()){
            JOptionPane.showMessageDialog(null, "arquivo criado com sucesso");
          }else{
            if(arquivo.exists()){
              JOptionPane.showMessageDialog(null, "O arquivo já existe");
            }else{
              JOptionPane.showMessageDialog(null, "O arquivo não foi criado");
            }
          }

        } catch (IOException ex) {
          //Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    
}
