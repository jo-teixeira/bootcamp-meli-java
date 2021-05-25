package bootcamp.SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private static final Map<Integer, List<Vestuario>> mapaDeRoupas = new HashMap<>();
    private static Integer contador = 0;

    public static Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        mapaDeRoupas.put(contador, listaDeVestuario);
        return contador++;
    }

    public static void mostrarVestuarios() {
        for (Map.Entry<Integer, List<Vestuario>> entrada : mapaDeRoupas.entrySet()) {
            for (Vestuario vestuario : entrada.getValue()) {
                System.out.println(entrada.getKey() + " - Marca: " + vestuario.getMarca() + " / Modelo: " + vestuario.getModelo());
            }
        }
    }

    public static List<Vestuario> devolverVestuarios(Integer id) throws Exception {
        List<Vestuario> resultado = mapaDeRoupas.get(id);
        if (resultado == null){
            throw new Exception("Lista de vestuários não encontrada");
        }

        return resultado;
    }

}
