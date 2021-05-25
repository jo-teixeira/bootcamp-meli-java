package bootcamp.SaveTheRopa;

public class Vestuario {

    private String marca;
    private String modelo;

    public Vestuario(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
