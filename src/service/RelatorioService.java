package service;

import interfaces.GeradorRelatorio;

public class RelatorioService implements GeradorRelatorio {

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de pedidos gerado!");
    }
}
