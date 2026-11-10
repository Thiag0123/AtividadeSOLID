package notificacao;

import interfaces.Notificavel;

public class Email implements Notificavel {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}
