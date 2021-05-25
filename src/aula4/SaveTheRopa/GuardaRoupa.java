package bootcamp.SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Map<Integer, List<Vestuario>> mapaDeRoupas = new HashMap<>();
    private Integer contador = 0;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        this.mapaDeRoupas.put(contador, listaDeVestuario);
        return this.contador++;
    }

    public void mostrarVestuarios() {
        for (Map.Entry<Integer, List<Vestuario>> entrada : mapaDeRoupas.entrySet()) {
            for (Vestuario vestuario : entrada.getValue()) {
                System.out.println(entrada.getKey() + " - Marca: " + vestuario.getMarca() + " / Modelo: " + vestuario.getModelo());
            }
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) throws Exception {
        List<Vestuario> resultado = this.mapaDeRoupas.get(id);
        if (resultado == null){
            throw new Exception("Lista de vestuários não encontrada");
        }
        return resultado;
    }

}
