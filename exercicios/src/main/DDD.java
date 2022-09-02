package main;

import java.util.Scanner;

public class DDD {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite o DDD: ");
        int ddd = sc.nextInt();
        String cidade = "";

        switch (ddd){
            case 61: cidade="Brasilia";
            break;
            case 71: cidade="Salvador";
            break;
            case 11:cidade="São Paulo";
            break;
            case 21: cidade="Rio de Janeiro";
            break;
            case 32: cidade="Juiz de Fora";
            break;
            case 19: cidade="Campinas";
            break;
            case 27: cidade="Vitoria";
            break;
            case 31: cidade="Belo Horizonte";
            break;
            default:
                System.out.println("DDD não cadastrado");
        }
                System.out.println(cidade);

        System.out.println("Digite o DDD: ");
        int ddd2 = sc.nextInt();

        if(ddd2 == 61){
            System.out.println("Brasilia");
        }else if (ddd2 == 71){
            System.out.println("Salvador");
        } else if (ddd2 == 11) {
            System.out.println("São Paulo");
        } else if (ddd2 == 21) {
            System.out.println("Rio de Janeiro");
        }else if (ddd2 == 32){
            System.out.println("Juiz de Fora");
        } else if (ddd2 == 19) {
            System.out.println("Campinas");
        }else if (ddd2 == 27){
            System.out.println("Vitoria");
        } else if (ddd2 == 31) {
            System.out.println("Belo Horizonte");
        }else {
            System.out.println("DDD não cadastrado");
        }


        sc.close();
    }
}
