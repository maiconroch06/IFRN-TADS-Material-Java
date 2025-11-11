package classes;

import java.util.HashMap;
import javax.swing.JOptionPane;

/* Sumario:
    1.Metodos de verificar
    1.Metodos de cadastro
    2.Metodos de remover
    3.Metodos de consultar
    4.Metodos de atualizar
    
Extra: Lista de´produtos
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
   
    private int seqVenda = 1;
    
    public Gerenciamento() {}
    
    public String gerarIDVenda() {                    // //
        return String.valueOf(seqVenda++);            // //
    }
    
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
    public void salvarVendasDoCarrinho(String idVenda, java.util.List<Venda> itens) { // //
    for (int i = 0; i < itens.size(); i++) {                                        // //
        Venda v = itens.get(i);                                                     // //
        v.setID_Venda(Integer.parseInt(idVenda));                                   // //
        String chave = idVenda + "-" + i;                                           // //
        listaDeVendas.put(chave, v);                                                // //
    }                                                                               // //
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
    
    // EXTRA
    // AUTO INCREMENTO para produtos
    private int contadorProduto = 1;

    // Gera código automático 001, 002, 003 ...
    private String gerarCodigoProduto() {
        String codigo = String.format("%03d", contadorProduto);
        contadorProduto++;
        return codigo;
    }
    
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
    }
    
    public double obterTotalDaCompra(String s) {
    s = s.replace("R$", "").trim().replace(".", "").replace(",", ".");
    try { return Double.parseDouble(s); } catch (Exception e) { return 0.0; }
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