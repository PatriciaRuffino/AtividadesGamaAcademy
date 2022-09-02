package main;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int n = sc.nextInt();

        for(int i=0; i <=10; i++){
            int nn= n*i;
            System.out.println(n +"x"+i+ "="+nn);
        }

        int n2 = sc.nextInt();
        int contador = 0;
        while (contador < 10){
           contador +=1;
           int result = n2*contador;
            System.out.println(n2+"x"+contador+"="+result);
        }

        sc.close();
        }


}
