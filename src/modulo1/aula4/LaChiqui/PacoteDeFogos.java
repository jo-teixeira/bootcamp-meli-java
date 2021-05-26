package bootcamp.LaChiqui;

import java.util.ArrayList;
import java.util.List;

public class PacoteDeFogos {

    private List<Fogos> listaDeFogos = new ArrayList<>();
    private List<PacoteDeFogos> listaDePacotes = new ArrayList<>();

    public List<Fogos> getListaDeFogos() {
        return listaDeFogos;
    }

    public List<PacoteDeFogos> getListaDePacotes() {
        return listaDePacotes;
    }

    public void explodirFogos(){
        for (Fogos fogo: listaDeFogos){
            fogo.explodir();
        }
        for (PacoteDeFogos pacoteDeFogos: listaDePacotes){
            pacoteDeFogos.explodirFogos();
        }
    }
}
