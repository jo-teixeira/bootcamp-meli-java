package bootcamp.DAKAR;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Corrida {

    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos = new ArrayList<>();

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public <T extends Veiculo> void registrarVeiculo(Class<T> classe, double velocidade, double aceleracao, double anguloDeGiro, String placa)
            throws Exception {
        if(!temEspaco()) return;

        this.listaVeiculos.add((Veiculo) Class.forName(classe.getName()).getConstructor(Double.class,
                Double.class, Double.class, String.class)
                .newInstance(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculo(String placa) throws Exception {
        for (int i = 0; i < listaVeiculos.size(); i++) {
            if (listaVeiculos.get(i).getPlaca().equals(placa)) {
                this.listaVeiculos.remove(i);
                return;
            }
        }
        throw new Exception("Veículo não encontrado");
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public List<Veiculo> vencedor() {
        Optional<Double> maxPontuacao = this.listaVeiculos.stream().map(this::pontuacao).max(Double::compare);

        return this.listaVeiculos.stream().filter(veiculo -> (pontuacao(veiculo).equals(maxPontuacao.get()))).collect(Collectors.toList());
    }

    private Double pontuacao(Veiculo veiculo) {
        return veiculo.getVelocidade() * veiculo.getAceleracao() / (veiculo.getAnguloDeGiro() * (veiculo.getPeso()
                - veiculo.getRodas() * 100));
    }

    private boolean temEspaco(){
        return listaVeiculos.size() < this.quantidadeVeiculosPermitidos;
    }
}

