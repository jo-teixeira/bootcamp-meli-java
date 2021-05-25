package bootcamp.SaveTheRopa;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Vestuario> listaVestuario1 = Arrays.asList(new Vestuario("Nike", "Camisa"), new Vestuario("Adidas", "Tenis"));
        List<Vestuario> listaVestuario2 = Arrays.asList(new Vestuario("Hollister", "Bermuda"), new Vestuario("Lacoste", "Polo"));
        GuardaRoupa guardaRoupa = new GuardaRoupa();
        Integer codigoVestuario1 = guardaRoupa.guardarVestuarios(listaVestuario1);
        Integer codigoVestuario2 = guardaRoupa.guardarVestuarios(listaVestuario2);
        guardaRoupa.mostrarVestuarios();

        List<Vestuario> vestuariosDevolvido1 = guardaRoupa.devolverVestuarios(codigoVestuario1);
        System.out.println(Arrays.asList(vestuariosDevolvido1));
    }

}
