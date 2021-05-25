package bootcamp.DAKAR;

import java.util.Locale;

public class Socorrista {

    public void socorrer(Veiculo veiculo) throws ClassNotFoundException {
        System.out.println("Socorrendo " + Class.forName(veiculo.getClass().getName())
                .getSimpleName().toLowerCase(Locale.ROOT) + " com placa " + veiculo.getPlaca());
        }
    }

