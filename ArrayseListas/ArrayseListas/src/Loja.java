import entities.Produto;

import java.util.HashMap;

public class Loja {
    public static void main(String[] args) {
        HashMap<Integer, Produto> mapa;
        mapa = new HashMap<Integer, Produto>();
        mapa.put(1, new Produto(1, "computador", 2005.00));
        mapa.put(2, new Produto(2, "computador2", 5000.00));
        mapa.put(3, new Produto(3, "computador3", 3000.00));
        mapa.put(4, new Produto(4, "computador4", 4000.00));

        int localizarCodigo = 3;

        Produto p = mapa.get(localizarCodigo);
        if (p!= null){
            System.out.println("Encontrei: "+ p);
        }else{
            System.out.println("Produto não existe");
        }
    }
}
