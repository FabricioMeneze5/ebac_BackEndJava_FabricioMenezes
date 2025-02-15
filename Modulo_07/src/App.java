public class App {
    public static void main(String[] args) throws Exception {

        //Declarando as variaveis
        Clientes cliente = Vendas.cliente();
        Funcionarios funcionario = Vendas.funcionario();
        Mercadorias mercadoria = Vendas.mercadoria();

        //Mostrando em tela a venda
        System.out.println("Detalhes da Venda");
        System.out.println("Cliente: " + cliente.getNome() + ", Cartao: " + cliente.getCartao());
        System.out.println("Vendedor: " + funcionario.getNome() + ", Codigo: " + funcionario.getCodigo());
        System.out.println("Mercadoria: " + mercadoria.getProduto() + ", Valor: R$" + mercadoria.getValor());
    }
}