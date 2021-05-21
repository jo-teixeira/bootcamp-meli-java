package class4.list4.ex4;

public class Analista extends FuncionarioCLT {
    private final static double BONIFICACAO = 8;
    private final static int HORAS_SEMANAIS = 40;
    private final static int HORAS_DESCANSO_REMUNERADO = 4;
    private final static int SALARIO_BASE = 4000;

    public Analista(String tipo, int quantidadeDeMetasBatida) {
        super(tipo, quantidadeDeMetasBatida, BONIFICACAO, HORAS_SEMANAIS, HORAS_DESCANSO_REMUNERADO, SALARIO_BASE);
    }
}
