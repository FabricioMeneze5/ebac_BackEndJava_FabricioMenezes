// Definindo as propriedades das compras

public class Vendas {

    //Atribuindo dados do cliente
    public static Clientes cliente() {
        Clientes cliente = new Clientes();
    
        cliente.setId(1);
        cliente.setNome("Fabricio Menezes");
        cliente.setCartao(844845541);
    
        return cliente;
    }

    //Atribuindo dados do funcionario
    public static Funcionarios funcionario() {
        Funcionarios funcionario = new Funcionarios();

        funcionario.setCodigo(123);
        funcionario.setNome("Joao");
    
        return funcionario;
    }

    //Atribuindo dados da mercadoria
    public static  Mercadorias mercadoria() {
        Mercadorias mercadoria = new Mercadorias();

        mercadoria.setCodigo(5984);
        mercadoria.setProduto("Geladeira");
        mercadoria.setValor(1200);

        return mercadoria;
    }
}