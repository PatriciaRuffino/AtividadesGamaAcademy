package entities;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    public Quadrado() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(double lado){
        double area = Math.pow(lado, 2);
        return area;
    }
    public double calcularArea2(){
        double area2 = Math.pow(lado, 2);
        return area2;
    }
}
