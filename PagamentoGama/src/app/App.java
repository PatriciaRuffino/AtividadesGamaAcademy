package app;

import entities.Chefe;
import entities.Comissionado;
import entities.Funcionario;
import entities.Horista;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Funcionario f, f1, f2, f3;
        f1 = new Chefe("Lucas", 123, 25000.00, 2500.00, 3000.00);
        f2= new Comissionado("Lais", 123, 25000.00, 541.00);
        f3= new Horista("Marcos", 542, 100.00, 40);


        List<Funcionario>funcList = new ArrayList<>();

        funcList.add(f1);
        funcList.add(f2);
        funcList.add(f3);
         for(Funcionario i : funcList){
             System.out.println(i.getNome()+" ---- R$" + f1.calcularSalario());
         }







    }
}
