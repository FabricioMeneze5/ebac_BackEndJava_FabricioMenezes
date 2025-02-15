// Definindo as propriedades dos clientes

public class Clientes {
    private  int id;
    public String nome;
    public int cartao;

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getCartao() {
        return cartao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

}