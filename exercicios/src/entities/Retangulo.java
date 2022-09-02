package entities;

public class Retangulo {
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        double area = base * altura;
        return area;
    }
}
