package com.maic.pooprojeto;

import com.maic.pooprojeto.labs.Motorista;
import com.maic.pooprojeto.labs.Veiculos;
import com.maic.pooprojeto.labs.Multa;
import com.maic.pooprojeto.labs.Fiscal;
import com.maic.pooprojeto.labs.Estrada;

import java.sql.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n============== FICHA DO MOTORISTA ==============");
        System.out.print("> Nome: ");
        String nomeMotorista = leitor.nextLine();

        System.out.print("> CPF: ");
        String cpf = leitor.nextLine();

        System.out.print("> Registro da CNH: ");
        int numeroDeRegistro = leitor.nextInt();
        leitor.nextLine(); // Consome ENTER

        System.out.print("> Categoria da CNH: ");
        String categoriaCnh = leitor.nextLine();

        System.out.print("> Validade da CNH: ");
        String validade = leitor.nextLine();
        System.out.println("=================================================");

        System.out.println("\n=============== FICHA DO VEÍCULO ================");
        System.out.print("> Modelo: ");
        String modelo = leitor.nextLine();

        System.out.print("> Ano: ");
        int ano = leitor.nextInt();

        System.out.print("> Placa: ");
        String placa = leitor.next();

        System.out.print("> Proprietário: ");
        String proprietario = leitor.next();
        leitor.nextLine(); // Consome ENTER
        System.out.println("=================================================");

        System.out.println("\n========= FICHA DO FISCAL DE TRÂNSITO ==========");
        System.out.print("> Nome: ");
        String nomeFiscal = leitor.nextLine();

        System.out.print("> Email: ");
        String email = leitor.nextLine();

        System.out.print("> Matrícula: ");
        String matricula = leitor.nextLine();

        System.out.print("> Local de trabalho: ");
        String localDeTrabalho = leitor.nextLine();

        System.out.print("> Turno: ");
        String turno = leitor.nextLine();
        System.out.println("=================================================");

        System.out.println("\n================= FICHA DA MULTA =================");
        System.out.print("> Código da multa: ");
        int codigo = leitor.nextInt();
        leitor.nextLine(); // Consome ENTER

        System.out.print("> Descrição: ");
        String descricao = leitor.nextLine();

        System.out.print("> Valor (R$): ");
        double valor = leitor.nextDouble();
        leitor.nextLine(); // Consome ENTER

        System.out.print("> Data (yyyy-MM-dd): ");
        String dataStr = leitor.next();
        Date data = Date.valueOf(dataStr);
        leitor.nextLine(); // Consome ENTER
        System.out.println("=================================================");

        System.out.println("\n=============== FICHA DA ESTRADA ================");
        System.out.print("> Nome: ");
        String nomeEstrada = leitor.nextLine();

        System.out.print("> Tipo (Avenida, Rodovia, etc): ");
        String tipo = leitor.nextLine();

        System.out.print("> Limite de velocidade: ");
        int limiteDeVelocidade = leitor.nextInt();

        System.out.print("> Pesagem máxima: ");
        int pesagem = leitor.nextInt();
        System.out.println("=================================================");

        // ===== Instanciando objetos =====
        Motorista motorista1 = new Motorista(nomeMotorista, cpf, numeroDeRegistro, categoriaCnh, validade);
        Veiculos veiculo1 = new Veiculos(modelo, ano, placa, proprietario);
        Fiscal fiscal1 = new Fiscal(nomeFiscal, email, matricula, turno, localDeTrabalho);
        Multa multa1 = new Multa(codigo, nomeFiscal, descricao, valor, data);
        Estrada estrada1 = new Estrada(nomeEstrada, limiteDeVelocidade, pesagem, tipo);

        // ===== Exibindo dados =====
        motorista1.show();
        veiculo1.show();
        fiscal1.show();
        multa1.show();
        estrada1.show();

        // ===== Encerrando objetos =====
        motorista1.delete();
        veiculo1.delete();
        fiscal1.delete();
        multa1.delete();
        estrada1.delete();

        leitor.close();
    }
}
