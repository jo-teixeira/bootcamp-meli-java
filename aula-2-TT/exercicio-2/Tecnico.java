package class4.list4.ex4;

public class Tecnico extends FuncionarioCLT {

    private final static double BONIFICACAO = 5;
    private final static int HORAS_SEMANAIS = 40;
    private final static int HORAS_DESCANSO_REMUNERADO = 0;
    private final static int SALARIO_BASE = 3200;

    public Tecnico(String tipo, int quantidadeDeMetasBatida) {
        super(tipo, quantidadeDeMetasBatida, BONIFICACAO, HORAS_SEMANAIS, HORAS_DESCANSO_REMUNERADO, SALARIO_BASE);
    }
}
