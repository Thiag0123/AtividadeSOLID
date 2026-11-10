package service;

import interfaces.GerenciadorEntregas;

public class EntregaService implements GerenciadorEntregas {

    @Override
    public void acompanharEntrega(int pedidoId) {
        System.out.println("Acompanhando entrega do pedido "
                + pedidoId);
    }
}
