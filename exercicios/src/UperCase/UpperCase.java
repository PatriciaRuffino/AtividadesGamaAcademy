package UperCase;

public class UpperCase {

    public static void main(String[] args) {
        String valor = "Gama Academy";


        for(char c: valor.toCharArray()){
            System.out.println("Char: "+c);

        }
        for (byte b : valor.getBytes()){
            System.out.println("byte "+b);
        }


    }



}
