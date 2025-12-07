//package classes;
//
//import java.util.HashMap;
//import java.util.List;
//import javax.swing.JOptionPane;
//
///* Sumario:
//Funcionalidades
//    1.Metodos de verificar
//    2.Metodos de cadastro
//    3.Metodos de remover
//    4.Metodos de consultar
//    5.Metodos de atualizar
//Extras
//    Lista de produtos
//
//*/
//
///* Algumas pendencias:
//    Metodos para tela "Nova Compra" e "Pagamento"
//*/
//
//public class Gerenciamento {
//
//    public Gerenciamento() {}
//    
//// 1.Metodos para verificar
//    public boolean verificarFuncionario(String CPF) {
//        if (listaDeFuncionarios.containsKey(CPF)) {
//            JOptionPane.showMessageDialog(null, "Funcionário já cadastrado!");
//            return false;
//        }
//        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
//        return true;
//    }
//    
//    public boolean verificarCliente(String CPF){
//        return listaDeClientes.containsKey(CPF);
//    }
//    
//    public boolean verificarProduto(String codigo) {
//        if(listaDeProdutos.containsKey(codigo)) {
//            JOptionPane.showMessageDialog(null, "Produto já cadastrado!");
//            return false;
//        }
//        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
//        return true;
//    }
//    
//    public boolean verificarVenda(String ID_Venda){        
//        if(historicoVendas.containsKey(ID_Venda)){
//            JOptionPane.showMessageDialog(null, "Venda já cadastrada!");
//            return false;
//        }
//        JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso!");
//        return true;
//    }
//    
//    public void atualizarEstoque(List<ItemVenda> itens) {       // //
//        for (ItemVenda v : itens) {
//            // A chave do produto é o codigo do produto
//            String chave =  v.getCodigoProduto() + ""; // Converte int em String
//
//            // Busca o produto real no HashMap do estoque
//            Produto produto = listaDeProdutos.get(chave);
//
//            if (produto != null) {
//                // Calcula a nova quantidade
//                int novaQuantidade = produto.getQuantidade() - v.getQuantidade();
//
//                // Garante que não fique negativo
//                if (novaQuantidade < 0) {
//                    novaQuantidade = 0;
//                }
//
//                // Atualiza a quantidade no objeto
//                produto.setQuantidade(novaQuantidade);
//                
//                listaDeProdutos.put(chave, produto);
//            }                                                                         // //
//        }
//    }
//
//    public double obterTotalDaCompra(String s) {
//        s = s.replace("R$", "").trim().replace(".", "").replace(",", ".");
//        try {
//            return Double.parseDouble(s);
//        } catch (Exception e) {
//            return 0.0;
//        }
//    }
//}