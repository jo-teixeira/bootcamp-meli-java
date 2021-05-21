package class4.list2.ex1;

public class ContaCorrente {

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double saldo;
    private String name;

    public ContaCorrente(double saldo, String name){
        this.saldo = saldo;
        this.name = name;
    }

    public ContaCorrente(){
        this.saldo = 0;
        this.name = "";
    }

    public ContaCorrente(ContaCorrente conta){
        this.saldo = conta.getSaldo();
        this.name = conta.getName();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public void depositar(double valor){
        this.saldo += valor;
    }

    public double sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Não possui saldo suficiente");
            return 0;
        }
        this.saldo -= valor;
        return valor;
    }

    public void devolucao(double valor, ContaCorrente contaDestino){
        if(valor > this.saldo){
            System.out.println("Não possui saldo suficiente");
            return;
        }
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }

    public void transferencia(double valor, ContaCorrente contaDestino){
        if (valor > this.saldo){
            System.out.println("Não possui saldo suficiente");
            return;
        }
        this.saldo -= valor;
        contaDestino.depositar(valor);
        System.out.println("Transferencia realizada com sucesso");
    }

}
