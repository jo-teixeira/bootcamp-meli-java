package bootcamp.DAKAR;

public class Moto extends Veiculo {
    private static final double PESO = 300;
    private static final int RODAS = 2;

    public Moto(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO, RODAS);
    }
}
