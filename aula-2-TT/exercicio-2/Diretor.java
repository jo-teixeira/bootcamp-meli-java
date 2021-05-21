package class4.list4.ex4;

public class Diretor extends FuncionarioCLT {

    private final static double BONIFICACAO = 0;
    private final static int HORAS_SEMANAIS = 0;
    private final static int HORAS_DESCANSO_REMUNERADO = 0;
    private final static int SALARIO_BASE = 15000;
    private final static double PL = 3;
    private double lucroDaEmpresa;

    public Diretor(String tipo, double lucroDaEmpresa) {
        super(tipo, 0, BONIFICACAO, HORAS_SEMANAIS, HORAS_DESCANSO_REMUNERADO, SALARIO_BASE);
        this.lucroDaEmpresa = lucroDaEmpresa;
    }


    @Override
    public void pagarSalario(){
        double salario = this.SALARIO_BASE + ((this.PL / 100) * this.lucroDaEmpresa );
        System.out.println(" Valor do salário pago sera de: " + salario);
    }
}
