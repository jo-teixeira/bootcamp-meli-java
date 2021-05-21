package class4.list2.ex1;

public class Ex1 {

    public static void main(String[] args) {
//        write your code here
//        ContaCorrente c = new ContaCorrente();

        ContaCorrente conta1 = new ContaCorrente();

        conta1.depositar(10);
        System.out.println(conta1.getSaldo());

        ContaCorrente conta2 = new ContaCorrente(conta1);
        System.out.println(conta2.getSaldo());

        conta1.transferencia(5, conta2);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        conta1.transferencia(10, conta2);

    }
}
