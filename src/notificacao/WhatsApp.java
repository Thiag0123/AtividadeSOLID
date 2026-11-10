package notificacao;

import interfaces.Notificavel;

public class WhatsApp implements Notificavel {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}