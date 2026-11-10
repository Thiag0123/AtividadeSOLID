package service;

import interfaces.GerenciadorPedidos;
import model.Pedido;

public class PedidoService implements GerenciadorPedidos {

    @Override
    public Pedido criarPedido(int id, String cliente) {
        return new Pedido(id, cliente);
    }
}
