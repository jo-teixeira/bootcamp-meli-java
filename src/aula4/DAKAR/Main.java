package bootcamp.DAKAR;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Corrida corrida = new Corrida(12,1000,"Corrida maluca",4);
        corrida.registrarVeiculo(Carro.class, 40, 10, 18, "ABA-2931");
        corrida.registrarVeiculo(Carro.class, 60, 15, 20, "ABA-2932");
        corrida.registrarVeiculo(Moto.class, 30, 7, 23, "ABA-2933");
        corrida.registrarVeiculo(Moto.class, 100, 20, 30, "ABA-2935");
        corrida.registrarVeiculo(Moto.class, 100, 20, 30, "ABA-2936");
        List<Veiculo> veiculoList = corrida.getVeiculoList();
        corrida.removerVeiculo(veiculoList.get(0));
        System.out.println(veiculoList);
        corrida.removerVeiculo("ABA-2933");
        System.out.println(veiculoList);
        try{
            corrida.removerVeiculo("ABA-2934");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Socorrista socorrista = new Socorrista();
        socorrista.socorrer(veiculoList.get(0));
        socorrista.socorrer(veiculoList.get(veiculoList.size()-1));

        List<Veiculo> veiculosVencedores = corrida.vencedor();
        System.out.println("Lista de Veículos vencedores. Caso haja mais de um, houve impate");
        System.out.println(veiculosVencedores);


    }
}
