package dominio.pedidos;

public class ItemDoPedido {
    private String descricao;
    private Number preco;

    public ItemDoPedido(String descricao, Number preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String descricao() {
        return this.descricao;
    }

    public Number preco() {
        return this.preco;
    }

    public void descricao(String value) {
        this.descricao = value;
    }

    public void preco(Number value) {
        this.preco = value;
    }

}