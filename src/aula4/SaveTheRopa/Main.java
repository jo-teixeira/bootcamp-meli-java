package bootcamp.SaveTheRopa;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Vestuario> listaVestuario1 = Arrays.asList(new Vestuario("Nike", "Camisa"), new Vestuario("Adidas", "Tenis"));
        List<Vestuario> listaVestuario2 = Arrays.asList(new Vestuario("Hollister", "Bermuda"), new Vestuario("Lacoste", "Polo"));

        Integer codigoVestuario1 = GuardaRoupa.guardarVestuarios(listaVestuario1);
        Integer codigoVestuario2 = GuardaRoupa.guardarVestuarios(listaVestuario2);

        GuardaRoupa.mostrarVestuarios();

        List<Vestuario> vestuariosDevolvido1 = GuardaRoupa.devolverVestuarios(codigoVestuario1);
        System.out.println("Vestuário1:");
        vestuariosDevolvido1.forEach(System.out::println);

        List<Vestuario> vestuariosDevolvido2 = GuardaRoupa.devolverVestuarios(codigoVestuario2);
        System.out.println("Vestuário2:");
        vestuariosDevolvido2.forEach(System.out::println);

    }

}
