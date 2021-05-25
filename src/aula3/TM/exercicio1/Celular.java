package bootcamp.exercicio1;

public class Celular implements Precedente<Celular>{

    private Long numero;

    public Celular(Long numero) {
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Override
    public int precedeA(Celular celular) {
        return celular.getNumero().compareTo(this.numero);
    }
}
