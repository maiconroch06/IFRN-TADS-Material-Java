package services;

public class Gerenciamento {

    private final ProdutoService produtoService = new ProdutoService();
    private final ClienteService clienteService = new ClienteService();
    private final FuncionarioService funcionarioService = new FuncionarioService();
    private final VendaService vendaService = new VendaService(produtoService);

    public ProdutoService produtos() {
        return produtoService;
    }

    public ClienteService clientes() {
        return clienteService;
    }

    public FuncionarioService funcionarios() {
        return funcionarioService;
    }

    public VendaService vendas() {
        return vendaService;
    }
}

/*
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;


public class Gerenciamento {
    private final HashMap<String, Funcionario> listaDeFuncionarios = new HashMap<>();
    private final HashMap<String, Cliente> listaDeClientes = new HashMap<>();
    private final HashMap<String, Produto> listaDeProdutos = new HashMap<>();
    private final HashMap<String, RegistroVenda> historicoVendas = new HashMap<>();

    public Gerenciamento() {}

    private boolean funcionariosAtualizados = false;
    private boolean clientesAtualizados = false;
    private boolean produtosAtualizados = false;
    private boolean vendasAtualizadas = false;
    
// 1.Metodos para verificar
    public boolean verificarProduto(String codigo) {
        if(listaDeProdutos.containsKey(codigo)) {
            JOptionPane.showMessageDialog(null, "Produto já cadastrado!");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        return true;
    }
    
    public boolean verificarCliente(String CPF){
        return listaDeClientes.containsKey(CPF);
    }
    
    public boolean verificarFuncionario(String CPF) {
        if (listaDeFuncionarios.containsKey(CPF)) {
            JOptionPane.showMessageDialog(null, "Funcionário já cadastrado!");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
        return true;
    }
    
    
    public boolean verificarVenda(String ID_Venda){        
        if(historicoVendas.containsKey(ID_Venda)){
            JOptionPane.showMessageDialog(null, "Venda já cadastrada!");
            return false;
        }
        JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!");
        return true;
    }
    
    
// 2.Metodos para cadastro
    public void cadastrarProduto(String codigo, Produto produto) {
        listaDeProdutos.put(codigo, produto);
        produtosAtualizados = true;
    }

    public void cadastrarCliente(String CPF, Cliente cliente){        
        listaDeClientes.put(CPF, cliente);
        clientesAtualizados = true;
    }

    public void cadastrarFuncionario(String CPF, Funcionario funcionario) {
        listaDeFuncionarios.put(CPF, funcionario);
        funcionariosAtualizados = true;
    }
    
    public void cadastrarVenda(String id_venda, RegistroVenda venda) {
        historicoVendas.put(id_venda, venda);
        setVendasAtualizadas(true);
    }
    
    
    
// 3.Metodos para remover
    public void removerProduto(String codigo){
        listaDeProdutos.remove(codigo);
        produtosAtualizados = true;
    }

    public void removerCliente(String CPF){
        listaDeClientes.remove(CPF);
        clientesAtualizados = true;
    }

    public void removerFuncionario(String CPF){
        listaDeFuncionarios.remove(CPF);
        funcionariosAtualizados = true;
    }
    

// 4.Metodos para consultar
    public Produto consultarProduto(String codigo){
        if(!listaDeProdutos.containsKey(codigo)){
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            return null;
        }
        return listaDeProdutos.get(codigo);
    }
    
    public Cliente consultarCliente(String CPF){
        if(!listaDeClientes.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            return null;
        }
        return listaDeClientes.get(CPF);
    }
    
    public Funcionario consultarFuncionario(String CPF){
        if(!listaDeFuncionarios.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Funcionario não encontrado!");
            return null;
        }
        return listaDeFuncionarios.get(CPF);
    }
    
    public RegistroVenda consultarVenda(String id) {
        if(!historicoVendas.containsKey(id)){
            JOptionPane.showMessageDialog(null, "Venda não encontrada!");
            return null;
        }
        return historicoVendas.get(id);
    }
    
    
// 5.Metodos para atualizar
    public boolean atualizarProduto(String codigo, Produto atualizado){
        if(!listaDeProdutos.containsKey(codigo)){
            JOptionPane.showMessageDialog(null, "Dados não encontrado!");
            return false;
        } 
        listaDeProdutos.put(codigo, atualizado);
        funcionariosAtualizados = true;
        return true;
    }
    
    public void atualizarProdutoQuantidade(String codigo, int quantidade){
        listaDeProdutos.get(codigo).setQuantidade(quantidade);
    }
    
    public boolean atualizarCliente(String CPF, Cliente cliente){        
        if(!listaDeClientes.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Dados não encontrado!");
            return false;
        } 
        listaDeClientes.put(CPF, cliente);
        clientesAtualizados = true;
        return true;
    }
    
    public boolean atualizarFuncionario(String CPF, Funcionario funcionario){        
        if(!listaDeFuncionarios.containsKey(CPF)){
            JOptionPane.showMessageDialog(null, "Dados não encontrado!");
            return false;
        } 
        listaDeFuncionarios.put(CPF, funcionario);
        produtosAtualizados = true;
        return true;
    }
    
    
    public void atualizarEstoque(List<ItemVenda> itens) {
        for (ItemVenda v : itens) {
            // A chave do produto é o codigo do produto
            String chave =  (String) v.getCodigoProduto();

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
                
                listaDeProdutos.put(chave, produto);
            }
        }
    }
    
// EXTRAS
    // AUTO-INCREMENTO para produtos e venda
    private int seqVenda = 1;
    
    public String gerarIdVenda() {
        return String.valueOf(seqVenda++);
    }
    
    public double obterTotalDaCompra(String valoTotal) {
        valoTotal = valoTotal.replace("R$", "").trim().replace(".", "").replace(",", ".");
        try {
            return Double.parseDouble(valoTotal);
        } catch (Exception e) {
            return 0.0;
        }
    }

// 98.Predefinição dos Clientes
    public void carregarClientesPadrao() {
        cadastrarCliente("333.333.333-33", new Cliente("Jackson", "333.333.333-33", "Rua C", "(33)93333-3333"));
        cadastrarCliente("444.444.444-44", new Cliente("Laelson", "444.444.444-44", "Rua D", "(44)94444-4444"));
        cadastrarCliente("555.555.555-55", new Cliente("Maicon", "555.555.555-55", "Rua E", "(55)95555-5555"));
        cadastrarCliente("666.666.666-66", new Cliente("Ryan", "666.666.666-66", "Rua F", "(66)96666-6666"));
    }

// 97. Predefinição dos Funcionários
    public void carregarFuncionariosPadrao() {
        cadastrarFuncionario("111.111.111-11", new Funcionario("Danilo", "111.111.111-11"));
        cadastrarFuncionario("222.222.222-22", new Funcionario("Gabriel", "222.222.222-22"));
    }

// 98.Predefinição dos produtos
    public void carregarProdutosPadrao() {
        cadastrarProduto("001", new Produto("001", "Arroz", 10, 5.99));

        cadastrarProduto("002", new Produto("002", "Feijão", 20, 7.50));

        cadastrarProduto("003", new Produto("003", "Macarrão", 15, 4.25));

        cadastrarProduto("004", new Produto("004", "Açúcar", 18, 3.89));

        cadastrarProduto("005", new Produto("005", "Café", 12, 14.90));

        cadastrarProduto("006", new Produto("006", "Óleo de Soja", 9, 7.99));

        cadastrarProduto("007", new Produto("007", "Leite 1L", 25, 5.49));

        cadastrarProduto("008", new Produto("008", "Manteiga", 8, 8.90));

        cadastrarProduto("009", new Produto("009", "Detergente", 30, 2.39));

        cadastrarProduto("010", new Produto("010", "Refrigerante 2L", 14, 9.50));
        
        cadastrarProduto("011", new Produto("011", "Achocolatado", 16, 7.99));

        cadastrarProduto("012", new Produto("012", "Biscoito", 35, 3.50));

        cadastrarProduto("013", new Produto("013", "Margarina", 20, 5.25));

        cadastrarProduto("014", new Produto("014", "Detergente", 28, 2.10));

        cadastrarProduto("015", new Produto("015", "Sabão em Pó", 17, 12.90));

        cadastrarProduto("016", new Produto("016", "Papel Higiênico", 50, 13.50));

        cadastrarProduto("017", new Produto("017", "Creme Dental", 27, 4.99));

        cadastrarProduto("018", new Produto("018", "Shampoo", 19, 10.99));

        cadastrarProduto("019", new Produto("019", "Shampoo", 5, 10.99));

        cadastrarProduto("020", new Produto("020", "Shampoo", 7, 10.99));

    }
    
// 99.Metodos Acessores
    public HashMap<String, Cliente> getListaDeClientes() {
        return listaDeClientes;
    }
    
    public HashMap<String, Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public HashMap<String, Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public HashMap<String, RegistroVenda> getHistoricoDeVendas() {
        return historicoVendas;
    }
    
    
    public boolean isProdutosAtualizados() {
        return produtosAtualizados;
    }

    
    public void setProdutosAtualizados(boolean produtosAtualizados) {
        this.produtosAtualizados = produtosAtualizados;
    }

    public boolean isClientesAtualizados() {
        return clientesAtualizados;
    }

    public void setClientesAtualizados(boolean clientesAtualizados) {
        this.clientesAtualizados = clientesAtualizados;
    }

    public boolean isFuncionariosAtualizados() {
        return funcionariosAtualizados;
    }

    public void setFuncionariosAtualizados(boolean funcionariosAtualizados) {
        this.funcionariosAtualizados = funcionariosAtualizados;
    }

    public boolean isVendasAtualizadas() {
        return vendasAtualizadas;
    }

    public void setVendasAtualizadas(boolean vendasAtualizadas) {
        this.vendasAtualizadas = vendasAtualizadas;
    }
}
*/