package notificacao;

import interfaces.Notificavel;

public class SMS implements Notificavel {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}