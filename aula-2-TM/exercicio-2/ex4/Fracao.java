package class4.list2.ex4;

public class Fracao {



    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }


    public void adicionar(Fracao fracao){

        int aux = this.denominador;

        this.denominador *= fracao.getDenominador();

        this.numerador = (this.denominador/aux) * this.numerador +
                (this.denominador/ fracao.getDenominador()) * fracao.getNumerador();

    }

    public void adicionar(int inteiro){
        this.numerador = this.denominador * inteiro + this.numerador;
    }

    public void subtrair(Fracao fracao){

        int aux = this.denominador;

        this.denominador *= fracao.getDenominador();

        this.numerador = (this.denominador/aux) * this.numerador -
                (this.denominador/ fracao.getDenominador()) * fracao.getNumerador();

    }

    public void subtrair(int inteiro){
        this.numerador = this.numerador - this.denominador * inteiro ;
    }



    public void multiplicar(Fracao f){
        this.numerador *= f.getNumerador();
        this.denominador *= f.getDenominador();
    }

    public void multiplicar(int i){
        this.numerador *= i;
    }

    public void dividir(Fracao f){
        this.numerador *= f.getDenominador();
        this.denominador *= f.getNumerador();
    }

    public void dividir(int i){
        this.denominador *= i;
    }


    @Override
    public String toString() {
        return "Fracao{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}
