package Polimorfismo;

public class Conta {

    private String nomeTitular;
    private String cpf;
    private String numeroConta;
    private double saldo;

    public Conta(String nomeTitular, String cpf, String numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean debitar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public void creditar(double valor){
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", cpf='" + cpf + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo='" + saldo;
    }
}
