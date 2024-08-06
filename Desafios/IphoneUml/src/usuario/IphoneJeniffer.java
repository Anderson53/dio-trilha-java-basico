package usuario;

import iphone.Iphone;

public class IphoneJeniffer {
    public static void main(String[] args) {
        Iphone iphoneJeniffer = new Iphone();

        //Chamadas referentes ao app de música:
        iphoneJeniffer.selecionarMusica("");
        iphoneJeniffer.pausar();

        System.out.println();

        //Chamadas referentes ao app de telefone:
        iphoneJeniffer.ligar("965348-7391");
        iphoneJeniffer.atender();


        System.out.println();

        //Chamadas referentes ao app de navegador:
        iphoneJeniffer.exibirPagina("www.github.com.br");
        iphoneJeniffer.atualizarPagina();
        iphoneJeniffer.adicionarNovaAba();
    }
}