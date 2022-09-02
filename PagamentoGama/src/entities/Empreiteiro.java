package entities;

public class Empreiteiro extends Funcionario{

    private int valorEmpreita;

    public Empreiteiro(String nome, int registro, int valorEmpreita) {
        super(nome, registro);
        this.valorEmpreita = valorEmpreita;
    }

    public int getValorEmpreita() {
        return valorEmpreita;
    }

    public void setValorEmpreita(int valorEmpreita) {
        this.valorEmpreita = valorEmpreita;
    }

    @Override
    public double calcularSalario() {
        return valorEmpreita;
    }
}
