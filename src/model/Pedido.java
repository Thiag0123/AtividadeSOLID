
package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private String cliente;
    private List<Produto> produtos;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        return total;
    }
}
