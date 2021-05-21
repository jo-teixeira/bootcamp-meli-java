package class4.list4.ex4;

public class Main {

    public static void main(String[] args) {
        FuncionarioCLT gerenteCNPJ = new Gerente("CLT", 8);
        gerenteCNPJ.pagarSalario();

        FuncionarioCLT diretorCLT = new Diretor("CLT", 50000);
        diretorCLT.pagarSalario();

        FuncionarioPJ funcionarioPJ = new FuncionarioPJ(50, 8.5);
        funcionarioPJ.pagarSalario();
    }
}
