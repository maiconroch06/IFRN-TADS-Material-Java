package classes;

import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/* Sumario:
Funcionalidades
    1.Metodos de verificar
    1.Metodos de cadastro
    2.Metodos de remover
    3.Metodos de consultar
    4.Metodos de atualizar
Interface    
    5.Metodos das tabelas
Extras
    
    Lista de produtos
    96.Predefinição dos Clientes
    97.Predefinição dos Funcionarios
    98.Predefinição dos produtos
    99.Metodos Getters
*/

/* Algumas pendencias:
    Metodos para tela "Nova Compra" e "Pagamento"
*/

public class Gerenciamento {
    private final java.util.Map<String, Venda> listaDeVendas = new java.util.LinkedHashMap<>();
    private final HashMap<String, Funcionario> listaDeFuncionarios = new HashMap<>();
    private final HashMap<String, Cliente> listaDeClientes = new HashMap<>();
    private final HashMap<String, Produto> listaDeProdutos = new HashMap<>();
   
    
    public Gerenciamento() {}
    
    // 1.Metodos para verificar
    public boolean verificarFuncionario(String CPF) {
        if (listaDeFuncionarios.containsKey(CPF)) {
            JOptionPane.showMessageDialog(null, "Funcionário já cadastrado!");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
        return true;
    }
    
    public boolean verificarCliente(String CPF){
        return listaDeClientes.containsKey(CPF);
    }
    
    public boolean verificarProduto(String codigo) {
        if(listaDeProdutos.containsKey(codigo)) {
            JOptionPane.showMessageDialog(null, "Produto já cadastrado!");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        return true;
    }
    
    public boolean verificarVenda(String ID_Venda){        
        if(listaDeVendas.containsKey(ID_Venda)){
            JOptionPane.showMessageDialog(null, "Venda já cadastrada!");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!");
        return true;
    }
    
    // 2.Metodos para cadastro
    public void cadastrarFuncionario(String CPF, Funcionario funcionario) {
        listaDeFuncionarios.put(CPF, funcionario);
    }
    
    public void cadastrarCliente(String CPF, Cliente cliente){        
        listaDeClientes.put(CPF, cliente);
    }
    
    public void cadastrarProduto(String codigo, Produto produto) {
        listaDeProdutos.put(codigo, produto);
    }
    
    // salva cada item do carrinho como uma "linha de venda"
    public void salvarVendasDoCarrinho(String idVenda, List<Venda> itens) { // //
        for (int i = 0; i < itens.size(); i++) {                                      // //
            Venda v = itens.get(i);                                              // //
            v.setID_Venda(Integer.parseInt(idVenda));                        // //
            String chave = idVenda + "-" + i;                                         // //
            listaDeVendas.put(chave, v);                                      // //
        }                                                                             // //
    } 
    
    public void atualizarEstoque(java.util.List<Venda> itens) {       // //
        for (Venda v : itens) {
            // A chave do produto é o codigo do produto
            String chave =  v.getCodigoProduto() + ""; // Converte int em String

            // Busca o produto real no HashMap do estoque
            Produto produto = listaDeProdutos.get(chave);

            if (produto != null) {
                // Calcula a nova quantidade
                int novaQuantidade = produto.getQuantidade() - v.getQuantidade();

                // Garante que não fique negativo
                if (novaQuantidade < 0) {
                    novaQuantidade = 0;
                }

                // Atualiza a quantidade no objeto
                produto.setQuantidade(novaQuantidade);

                /*// Atualiza o HashMap (opcional, pois o objeto já foi alterado)
                listaDeProdutos.put(chave, produto);*/
            }                                                                         // //
        }
    }
    
    // 3.Metodos para remover
    public void removerFuncionario(String CPF, Funcionario funcionario){
        listaDeFuncionarios.remove(CPF, funcionario); 
    }
    
    public void removerCliente(String CPF, Cliente cliente){
        listaDeClientes.remove(CPF, cliente); 
    }
    
    public void removerProduto(String codigo){
        listaDeProdutos.remove(codigo);
    }
    
    // 3.Metodos para consultar
    public Cliente consultarCliente(String CPF){
        return listaDeClientes.get(CPF);
    }
    
    public void consultarProduto(String codigo){
        listaDeProdutos.get(codigo);
    }
    
    public void consultarFuncionario(String CPF){
        listaDeFuncionarios.get(CPF);
    }
    
    // 4.Metodos para atualizar
    public boolean atualizarFuncionario(String CPF, Funcionario funcionario){        
        if(!listaDeFuncionarios.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Dados não encontrado!");
            return false;
        } 
        listaDeFuncionarios.put(CPF, funcionario);
        return true;
    }

    public boolean atualizarCliente(String CPF, Cliente cliente){        
        if(!listaDeClientes.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Dados não encontrado!");
            return false;
        } 
        listaDeClientes.put(CPF, cliente);
        return true;
    }
    
    public boolean atualizarProduto(String codigo, Produto atualizado){
        if(!listaDeProdutos.containsKey(codigo)){
            JOptionPane.showMessageDialog(null, "Dados não encontrado!");
            return false;
        } 
        listaDeProdutos.put(codigo, atualizado);
        return true;
    }
    
    // EXTRAS
    // AUTO-INCREMENTO para produtos e venda
    private int contadorProduto = 1;
    private int seqVenda = 1;

    // Gera código automático 001, 002, 003 ...
    public String gerarCodigoProduto() {
        String codigo = String.format("%03d", contadorProduto);
        contadorProduto++;
        return codigo;
    }
    
    public String gerarIDVenda() {                                              // //
        return String.valueOf(seqVenda++);                                      // //
    }
    
    public double obterTotalDaCompra(String s) {
        s = s.replace("R$", "").trim().replace(".", "").replace(",", ".");
        try {
            return Double.parseDouble(s);
        } catch (Exception e) {
            return 0.0;
        }
    }
    
    // 98.Predefinição dos Clientes
    public void carregarClientesPadrao() {
        cadastrarCliente("111.111.111-11", new Cliente("Danilo", "111.111.111-11", "Rua A", "(11) 91111-1111"));
        cadastrarCliente("222.222.222-22", new Cliente("Gabriel", "222.222.222-22", "Rua B", "(22) 92222-2222"));
        cadastrarCliente("333.333.333-33", new Cliente("Jackson", "333.333.333-33", "Rua C", "(33) 93333-3333"));
        cadastrarCliente("444.444.444-44", new Cliente("Laelson", "444.444.444-44", "Rua D", "(44) 94444-4444"));
        cadastrarCliente("555.555.555-55", new Cliente("Maicon", "555.555.555-55", "Rua E", "(55) 95555-5555"));
        cadastrarCliente("666.666.666-66", new Cliente("Ryan", "666.666.666-66", "Rua F", "(66) 96666-6666"));
    }

// 97. Predefinição dos Funcionários
    public void carregarFuncionariosPadrao() {
        cadastrarFuncionario("111.111.111-11", new Funcionario("Danilo", "111.111.111-11"));
        cadastrarFuncionario("222.222.222-22", new Funcionario("Gabriel", "222.222.222-22"));
        cadastrarFuncionario("333.333.333-33", new Funcionario("Jackson", "333.333.333-33"));
        cadastrarFuncionario("444.444.444-44", new Funcionario("Laelson", "444.444.444-44"));
        cadastrarFuncionario("555.555.555-55", new Funcionario("Maicon", "555.555.555-55"));
        cadastrarFuncionario("666.666.666-66", new Funcionario("Ryan", "666.666.666-66"));
    }

    // 98.Predefinição dos produtos
    public void carregarProdutosPadrao() {
        String cod1 = gerarCodigoProduto();
        cadastrarProduto(cod1, new Produto(cod1, "Arroz", 10, 5.99));

        String cod2 = gerarCodigoProduto();
        cadastrarProduto(cod2, new Produto(cod2, "Feijão", 20, 7.50));

        String cod3 = gerarCodigoProduto();
        cadastrarProduto(cod3, new Produto(cod3, "Macarrão", 15, 4.25));

        String cod4 = gerarCodigoProduto();
        cadastrarProduto(cod4, new Produto(cod4, "Açúcar", 18, 3.89));

        String cod5 = gerarCodigoProduto();
        cadastrarProduto(cod5, new Produto(cod5, "Café", 12, 14.90));

        String cod6 = gerarCodigoProduto();
        cadastrarProduto(cod6, new Produto(cod6, "Óleo de Soja", 9, 7.99));

        String cod7 = gerarCodigoProduto();
        cadastrarProduto(cod7, new Produto(cod7, "Leite 1L", 25, 5.49));

        String cod8 = gerarCodigoProduto();
        cadastrarProduto(cod8, new Produto(cod8, "Manteiga", 8, 8.90));

        String cod9 = gerarCodigoProduto();
        cadastrarProduto(cod9, new Produto(cod9, "Detergente", 30, 2.39));

        String cod10 = gerarCodigoProduto();
        cadastrarProduto(cod10, new Produto(cod10, "Refrigerante 2L", 14, 9.50));
        
        String cod11 = gerarCodigoProduto();
        cadastrarProduto(cod11, new Produto(cod11, "Achocolatado", 16, 7.99));

        String cod12 = gerarCodigoProduto();
        cadastrarProduto(cod12, new Produto(cod12, "Biscoito", 35, 3.50));

        String cod13 = gerarCodigoProduto();
        cadastrarProduto(cod13, new Produto(cod13, "Margarina", 20, 5.25));

        String cod14 = gerarCodigoProduto();
        cadastrarProduto(cod14, new Produto(cod14, "Detergente", 28, 2.10));

        String cod15 = gerarCodigoProduto();
        cadastrarProduto(cod15, new Produto(cod15, "Sabão em Pó", 17, 12.90));

        String cod16 = gerarCodigoProduto();
        cadastrarProduto(cod16, new Produto(cod16, "Papel Higiênico", 50, 13.50));

        String cod17 = gerarCodigoProduto();
        cadastrarProduto(cod17, new Produto(cod17, "Creme Dental", 27, 4.99));

        String cod18 = gerarCodigoProduto();
        cadastrarProduto(cod18, new Produto(cod18, "Shampoo", 19, 10.99));
        
        String cod19 = gerarCodigoProduto();
        cadastrarProduto(cod19, new Produto(cod18, "Shampoo", 19, 10.99));
        
        String cod20 = gerarCodigoProduto();
        cadastrarProduto(cod20, new Produto(cod18, "Shampoo", 19, 10.99));
        
        String cod21 = gerarCodigoProduto();
        cadastrarProduto(cod21, new Produto(cod18, "Shampoo", 19, 10.99));
        
        String cod22 = gerarCodigoProduto();
        cadastrarProduto(cod22, new Produto(cod18, "Shampoo", 19, 10.99));
        
        String cod23 = gerarCodigoProduto();
        cadastrarProduto(cod23, new Produto(cod18, "Shampoo", 19, 10.99));
        
        String cod24 = gerarCodigoProduto();
        cadastrarProduto(cod24, new Produto(cod18, "Shampoo", 19, 10.99));
        
        String cod25 = gerarCodigoProduto();
        cadastrarProduto(cod25, new Produto(cod18, "Shampoo", 19, 10.99));
    }

    
    // 99.Getters
    public HashMap<String, Cliente> getListaDeClientes() {
        return listaDeClientes;
    }
    
    public HashMap<String, Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public HashMap<String, Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public java.util.Map<String, Venda> getListaDeVendas() {
        return listaDeVendas;
    }
    
}