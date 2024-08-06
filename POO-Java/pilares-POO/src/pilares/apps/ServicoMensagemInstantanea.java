package apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos conhecem este método
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}

/*
public class ComputadorPedrinnho {
    public static void main(String[] args) {
        System.out.println("MSN");
        apps.MSNMessenger msn = new apps.MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");
        apps.FacebookMessenger fcb = new apps.FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("apps.Telegram");
        apps.Telegram tlg = new apps.Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
*/
