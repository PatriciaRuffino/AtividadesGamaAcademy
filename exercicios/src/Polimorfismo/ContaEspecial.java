package Polimorfismo;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(String nomeTitular, String cpf, String numeroConta, double saldo, double limite) {
        super(nomeTitular, cpf, numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public String toString() {
        return super.toString() + " Limite: "+ limite;
    }

    @Override
    public boolean debitar(double valor) {
        if(this.limite+getSaldo()>= valor){
            setSaldo(getSaldo()-valor);
            return true;
        }else {
            return false;
        }
    }
}

