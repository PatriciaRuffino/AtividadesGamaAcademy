package jmv;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(2,5);
        System.out.println(calculadora.somar());

        System.out.println(Math.min(calculadora.getNum1(), calculadora.getNum2())); Math.min(calculadora.getNum1(), calculadora.getNum2());
    }

}
