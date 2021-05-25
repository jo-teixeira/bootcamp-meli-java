package bootcamp.DAKAR;

import java.util.List;

public class Carro extends Veiculo{
    private static final double PESO = 1000;
    private static final int RODAS = 4;


    public Carro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO, RODAS);
    }
}
