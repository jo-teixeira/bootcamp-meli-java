package bootcamp.LaChiqui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fogos fogos1 = new Fogos("KABOOOOOM");
        Fogos fogos2 = new Fogos("blauh");
        Fogos fogos3 = new Fogos("boom");
        Fogos fogos4 = new Fogos("booooom");
        Fogos fogos5 = new Fogos("BOOOOOOOOOM");
        Fogos fogos6 = new Fogos("kabum");
        Fogos fogos7 = new Fogos("KABUMMMM");
        Fogos fogos8 = new Fogos("kapow");
        Fogos fogos9 = new Fogos("BLAUH");
        PacoteDeFogos pacoteDeFogos = new PacoteDeFogos();
        pacoteDeFogos.getListaDePacotes().add(new PacoteDeFogos());
        pacoteDeFogos.getListaDePacotes().add(new PacoteDeFogos());
        pacoteDeFogos.getListaDePacotes().get(0).getListaDeFogos().add(fogos1);
        pacoteDeFogos.getListaDePacotes().get(0).getListaDeFogos().add(fogos2);
        pacoteDeFogos.getListaDePacotes().get(0).getListaDeFogos().add(fogos3);
        pacoteDeFogos.getListaDePacotes().get(1).getListaDeFogos().add(fogos4);
        pacoteDeFogos.getListaDeFogos().add(fogos5);
        pacoteDeFogos.getListaDeFogos().add(fogos6);
        pacoteDeFogos.getListaDeFogos().add(fogos7);
        pacoteDeFogos.getListaDeFogos().add(fogos8);
        pacoteDeFogos.getListaDeFogos().add(fogos9);

        Convidado convidado1 = new Convidado(TipoDeConvidado.MELI,"João");
        Convidado convidado2 = new Convidado(TipoDeConvidado.MELI,"Israel");
        Convidado convidado3 = new Convidado(TipoDeConvidado.MELI,"Paulo");
        Convidado convidado4 = new Convidado(TipoDeConvidado.STANDARD,"Gustavo");
        Convidado convidado5 = new Convidado(TipoDeConvidado.STANDARD,"Victor");
        Convidado convidado6 = new Convidado(TipoDeConvidado.MELI,"Caio");

        List<Convidado> convidados = Arrays.asList(convidado1,convidado2,convidado3,convidado4,convidado5,convidado6);

        Evento evento = new Evento(convidados,Arrays.asList(pacoteDeFogos));
        evento.degustar();
        evento.explodir();




    }


}
