package bootcamp.LaChiqui;

public class Convidado {

    private TipoDeConvidado tipoDeConvidado;
    private String nome;

    public Convidado(TipoDeConvidado tipoDeConvidado, String nome) {
        this.tipoDeConvidado = tipoDeConvidado;
        this.nome = nome;
    }

    public TipoDeConvidado getTipoDeConvidado() {
        return tipoDeConvidado;
    }

    public String getNome() {
        return nome;
    }

    public void degustar() {
        if (this.tipoDeConvidado == TipoDeConvidado.MELI) {
            System.out.println("Viva la Chiqui !!");
        }
    }
}
