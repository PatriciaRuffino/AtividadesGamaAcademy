import entities.Produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Produto lista[];
       // lista = new Produto[3];

      //  lista[0] = new Produto(1, "Computador", 3000.0);
       // lista[1] = new Produto(2, "teclado", 300.0);
      //  lista[2] = new Produto(3, "teclado2", 350.0);
        //  for (Produto i : lista) {
        //     System.out.println(i);
        // }

        Produto p1, p2, p3;

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1=new Produto(1, "computador", 205.00));
        produtos.add(p1=new Produto(2, "monitor", 1500.00));
        produtos.add(p2=new Produto(3, "monitor2", 2000.00));
        produtos.add(p3=new Produto(4, "monitor3", 2500.00));
                for (Produto i: produtos){
                    System.out.println(i);
                }
        System.out.println("Tamanho da lista: "+produtos.size());
        System.out.println(produtos.remove(2));
        System.out.println("Novo tamanho da lista: "+produtos.size());

    }



}
