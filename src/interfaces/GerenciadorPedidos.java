package interfaces;

import model.Pedido;

public interface GerenciadorPedidos {
    Pedido criarPedido(int id, String cliente);
}
