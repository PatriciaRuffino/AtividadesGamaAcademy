package main;

import java.util.Scanner;

public class ExeIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a primeira nota do aluno?");
        double nota1 = sc.nextDouble();
        System.out.println("Qual a segunda nota do aluno?");
        double nota2 = sc.nextDouble();
        System.out.println("Qual a terceira nota do aluno?");
        double nota3 = sc.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        if(media >=7) {
            System.out.printf("O aluno está Aprovado. A média foi %.2f", media);
        }else{
            System.out.printf("O aluno está Reprovado. A média foi %.2f", media);
        }
        sc.close();

    }
}
