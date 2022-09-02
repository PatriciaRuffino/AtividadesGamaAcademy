package main;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double matriz [][];
        matriz = new double[3][5];

        for(int l=0; l <3; l++){
            for(int c=0; c<5; c++){
                System.out.print("Digite o valor da Matrix ["+l+"]["+c+"]");
                matriz[l][c]= sc.nextDouble();
            }
        }
        for(int l=0; l <3; l++){
            for(int c=0; c<5; c++){
                System.out.printf("%10.2f", matriz[l][c]);
            }
            System.out.println();
        }

        sc.close();
    }
}
