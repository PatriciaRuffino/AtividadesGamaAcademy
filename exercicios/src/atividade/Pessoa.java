package atividade;

public class Pessoa {
    private Integer idade;
    private int temperamento;
    private int sexo;

    public Pessoa(Integer idade, int temperamento, int sexo) {
        this.idade = idade;
        this.temperamento = temperamento;
        this.sexo = sexo;
    }

    public Pessoa() {
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public int getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(int temperamento) {
        this.temperamento = temperamento;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa:" +
                "idade=" + idade +
                ", temperamento=" + temperamento +
                ", sexo=" + sexo;
    }
}
