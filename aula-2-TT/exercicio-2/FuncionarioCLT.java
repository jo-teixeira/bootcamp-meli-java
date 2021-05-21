package class4.list4.ex4;

import class4.list4.ex4.interfaces.Funcionario;

public abstract class FuncionarioCLT implements Funcionario {

    protected String tipo;
    private int quantidadeDeMetasBatida;
    private double bonificacao;
    private int horasSemanais;
    private int horasDescansoRemunerado;
    private int salarioBase;

    public FuncionarioCLT(String tipo, int quantidadeDeMetasBatida, double bonificacao, int horasSemanais,
                          int horasDescansoRemunerado, int salarioBase) {
        this.tipo = tipo;
        this.quantidadeDeMetasBatida = quantidadeDeMetasBatida;
        this.bonificacao = bonificacao;
        this.horasSemanais = horasSemanais;
        this.horasDescansoRemunerado = horasDescansoRemunerado;
        this.salarioBase = salarioBase;
    }

    public void pagarSalario(){
        double salario = this.salarioBase * ((this.bonificacao / 100) * this.quantidadeDeMetasBatida + 1);
        System.out.println(" Valor do salário pago sera de: " + salario);
    }
}
