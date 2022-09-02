package main;

import entities.Quadrado;
import entities.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quadrado quadrado = new Quadrado();
        System.out.println("Entre com a medida do lado do quadrado: ");
       double v =sc.nextDouble();
       quadrado.setLado(v);
        //System.out.println(v);
       //double result =  quadrado.calcularArea2();
       //System.out.println("A área do quadrado é: " + result);
        double result2 =  quadrado.calcularArea2();
        System.out.println("A área do quadrado é: " + result2);


        Retangulo retangulo = new Retangulo();
        System.out.println("Entre com a medida da altura do retangulo: ");
        retangulo.altura = sc.nextDouble();
        System.out.println("Entre com a medida da base do retangulo: ");
        retangulo.base = sc.nextDouble();
        double resultRetangulo = retangulo.calcularArea();
        System.out.printf("A área do retangulo é: %.2f ",resultRetangulo);

        sc.close();
    }

}
