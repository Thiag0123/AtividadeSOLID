import model.*;
import repository.PedidoRepository;
import service.*;
import notificacao.*;

public class Main {

    public static void main(String[] args) {

        PedidoService pedidoService = new PedidoService();

        Pedido pedido = pedidoService.criarPedido(1, "Thiago");

        Produto pizza = new Pizza("Calabresa", 45.00);
        Produto hamburguer = new Hamburguer("X-Bacon", 30.00);
        Produto bebida = new Bebida("Refrigerante", 8.00);

        pedido.adicionarProduto(pizza);
        pedido.adicionarProduto(hamburguer);
        pedido.adicionarProduto(bebida);

        PedidoRepository repository = new PedidoRepository();
        repository.salvar(pedido);

        PedidoExibicao exibicao = new PedidoExibicao();
        exibicao.exibir(pedido);

        Pagamento pagamento = new PagamentoPix();
        pagamento.pagar(pedido.calcularTotal());

        NotificacaoService notificacao =
                new NotificacaoService(new WhatsApp());

        notificacao.notificar(
                "Seu pedido está sendo preparado!"
        );

        RelatorioService relatorio = new RelatorioService();
        relatorio.gerarRelatorio();

        EntregaService entrega = new EntregaService();
        entrega.acompanharEntrega(pedido.getId());
    }
}
