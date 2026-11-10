package service;

import interfaces.Notificavel;

public class NotificacaoService {

    private Notificavel notificacao;

    public NotificacaoService(Notificavel notificacao) {
        this.notificacao = notificacao;
    }

    public void notificar(String mensagem) {
        notificacao.enviarNotificacao(mensagem);
    }
}