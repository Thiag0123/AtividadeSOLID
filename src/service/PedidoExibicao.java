package service;

import model.Pedido;
import model.Produto;

public class PedidoExibicao {

    public void exibir(Pedido pedido) {
        System.out.println("\n--- INFORMAÇÕES DO PEDIDO ---");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());

        for (Produto produto : pedido.getProdutos()) {
            System.out.println(produto.getDescricao()
                    + " - R$ " + produto.getPreco());
        }

        System.out.println("Total: R$ " + pedido.calcularTotal());
    }
}
