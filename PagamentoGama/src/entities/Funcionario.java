package entities;

public  abstract class Funcionario {
    protected String nome;
    protected int registro;

    public Funcionario(String nome, int registro) {
        this.nome = nome;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }


    public abstract double calcularSalario();
}
