package model;

public class Pizza extends Produto {

    public Pizza(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getDescricao() {
        return "Pizza: " + nome;
    }
}
