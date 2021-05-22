package aula2.TT.exercise2;

import aula2.TT.exercise2.interfaces.Funcionario;

public class FuncionarioPJ implements Funcionario {

    private int cargaHorariaMensal;
    private double precoPorHora;

    public FuncionarioPJ(int cargaHorariaMensal, double precoPorHora) {
        this.cargaHorariaMensal = cargaHorariaMensal;
        this.precoPorHora = precoPorHora;
    }

    @Override
    public void pagarSalario() {
        double salario = this.cargaHorariaMensal * precoPorHora;
        System.out.println(" Valor do salário pago sera de: " + salario);
    }
}
