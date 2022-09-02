package Polimorfismo;

public class App {
    public static void main(String[] args) {

        Conta conta =  new Conta("Patricia", "000000", "123456", 200.00);
        System.out.println(conta);

        conta.debitar(100.00);
        System.out.println("Saldo atual: "+conta.getSaldo());

        Conta conta2 = new ContaEspecial("Luisa", "0000002", "654123", 600.00, 200.00);
        System.out.println(conta2);
        System.out.println(conta2.debitar(1000.00));
        System.out.println(conta2.debitar(500.00));
        System.out.println(conta2.debitar(700.00));
        System.out.println("Saldo atual: "+conta2.getSaldo());
    }
}
