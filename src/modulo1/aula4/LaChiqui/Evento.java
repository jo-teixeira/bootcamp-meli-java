package bootcamp.LaChiqui;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private List<Convidado> convidadoList = new ArrayList<>();
    private List<PacoteDeFogos> pacoteDeFogosList = new ArrayList<>();

    public Evento(List<Convidado> convidadoList, List<PacoteDeFogos> pacoteDeFogosList) {
        this.convidadoList = convidadoList;
        this.pacoteDeFogosList = pacoteDeFogosList;
    }

    public void degustar(){
        for (Convidado convidado: this.convidadoList){
            convidado.degustar();
        }
    }

    public void explodir(){
        for (PacoteDeFogos pacoteDeFogos: this.pacoteDeFogosList){
            pacoteDeFogos.explodirFogos();
        }
    }
}
