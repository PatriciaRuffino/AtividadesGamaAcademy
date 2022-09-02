package atividade01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroOriginal, c, d, u, resto;
        int numerointeiro;

        System.out.println("Digite o numero inteiro de 3 digitos");
        numeroOriginal = sc.nextInt();

        c=numeroOriginal/100;
        resto= numeroOriginal %100;
        d = resto /10;
        u = resto %10;

       numerointeiro = u*100+d*10+c;
        System.out.println("O novo número é: " + numerointeiro);




        //int array[]={1,2,3};

        int [] array = new int[3];

        for (int i = 0; i < array.length; i++){
            System.out.print("Digite o número" + (i+1) + ":");
            array[i]= sc.nextInt();
        }
        int invert = array.length;
        int[] v = new int[invert];
        for(int i = 0; i< invert; i++) {
            v[invert - 1 - i] = array[i];
        }

        //for(int i = 0; i< v.length; i++){
       //     System.out.println( v[i]);
       // }

        System.out.println("A sequencia dos números são: "+Arrays.toString(v));

        sc.close();

    }
}
