package empregado;

public class Empregado {
    private String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public Empregado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibir(){
        System.out.printf("%s - R$ %.2f %n",this.nome, this.salario);

    }

    public void aumentarSalario(double percentual){
        salario+= salario*percentual/100;
    }

}
