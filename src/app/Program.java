package app;

import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        /* AROOOO */
        //tendi
        double x = 10.35784;
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.println("Resultado = " + x + " Metros");

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}
