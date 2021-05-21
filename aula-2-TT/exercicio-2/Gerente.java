package class4.list4.ex4;

public class Gerente extends FuncionarioCLT {

    private final static double BONIFICACAO = 12.5;
    private final static int HORAS_SEMANAIS = 36;
    private final static int HORAS_DESCANSO_REMUNERADO = 4;
    private final static int SALARIO_BASE = 6000;


    public Gerente(String tipo, int quantidadeDeMetasBatida) {
        super(tipo, quantidadeDeMetasBatida, BONIFICACAO, HORAS_SEMANAIS, HORAS_DESCANSO_REMUNERADO, SALARIO_BASE);
    }

}
