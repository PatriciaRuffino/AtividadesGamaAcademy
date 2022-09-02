package empregado;

import java.util.Locale;
import java.util.Scanner;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       Empregado empregado = new Empregado("Maria", 10000.00);
        Empregado empregado2 = new Empregado("João", 9000.00);

        System.out.println("-----------Informações originais --------------");
        empregado.exibir();
        empregado2.exibir();

        empregado.aumentarSalario(20);
        empregado2.aumentarSalario(20);

        System.out.println("-----------Informações reajustados --------------");
        empregado.exibir();
        empregado2.exibir();

        /* Empregado emp = new Empregado();
        String nome;
        System.out.println("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        emp.setNome(nome);

        System.out.println("Digite o salário do funcionário: ");
        double salario;
        salario = sc.nextDouble();
        emp.setSalario(salario);

        emp.exibir();

         */


        Empregado emp;


        emp = new Empregado();
        System.out.println("Digite o nome do funcionário");
        String nome= sc.nextLine();
        emp.setNome(nome);

        //System.out.println("Digite o salário do funcionário: ");
        //salario = Double.parseDouble(sc.nextLine());

        //System.out.println(emp.getNome());
        //System.out.println(emp.getSalario());
        emp.exibir();
      
        sc.close();
    }

}
