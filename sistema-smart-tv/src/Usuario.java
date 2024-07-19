public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Alexa ligar TV");
        smartTv.alexaLigarTv();
        System.out.println("Alexa: Tudo bem!");
        System.out.println("A TV está ligada? " + smartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume atual? " + smartTv.volume);;

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - A TV está ligada? " + smartTv.ligada);
    }
}