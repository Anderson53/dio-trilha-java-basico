package iphone;

public class Iphone implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        int contador = 5;

        System.out.println("Ligando...");
        contador ++;
        if (contador > 4) {
            iniciarCorreioVoz();
        }
        else
            atender();

    }

    public void iniciarCorreioVoz(){
        System.out.println("Mensagem entrou no Correio de Voz\n");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    //Funções referente ao ReprodutorMusical
    public void tocar(){
        System.out.println("Tocando música");
    }

    public void pausar(){
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionado: " + musica);
        tocar();
    }


    //Funções referente ao NavegadorDeInternet
    public void exibirPagina(String url){
        System.out.println("Exibindo página " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Recarregando página");
    }
}
