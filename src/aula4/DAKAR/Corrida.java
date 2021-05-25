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
    private List<Veiculo> veiculoList = new ArrayList<>();

    public Corrida(double distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public void registrarVeiculo(Class classe, double velocidade, double aceleracao, double anguloDeGiro, String placa)
            throws Exception {
        this.veiculoList.add((Veiculo) Class.forName(classe.getName()).getConstructor(Double.class,
                Double.class, Double.class, String.class)
                .newInstance(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculoList.remove(veiculo);
    }

    public void removerVeiculo(String placa) throws Exception {
        for (int i = 0; i < veiculoList.size(); i++) {
            if (veiculoList.get(i).getPlaca().equals(placa)) {
                this.veiculoList.remove(i);
                return;
            }
        }
        throw new Exception("Veículo não encontrado");
    }

    public List<Veiculo> getVeiculoList() {
        return veiculoList;
    }

    public List<Veiculo> vencedor() {
        Optional<Double> maxPontuacao = this.veiculoList.stream().map(veiculo -> pontuacao(veiculo)).max(Double::compare);

        return this.veiculoList.stream().filter(veiculo -> (pontuacao(veiculo).equals(maxPontuacao.get()))).collect(Collectors.toList());
    }

    private Double pontuacao(Veiculo veiculo) {
        return veiculo.getVelocidade() * veiculo.getAceleracao() / (veiculo.getAnguloDeGiro() * veiculo.getPeso()
                - veiculo.getRodas() * 100);
    }
}

