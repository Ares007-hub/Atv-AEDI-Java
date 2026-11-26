package Etapa2;

import java.util.Scanner;

public class C11ex13 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de termos: ");
        int termos = teclado.nextInt();

        double serie = 7;

        int aux = 2;
        while (aux <= termos) {
            double base = 9 * aux - 8;
            double exp = 2 * aux - 2;

            double num = (aux - 1) * Math.pow(base, exp);
            double den = Math.pow(7, aux - 2);

            serie += (num / den);
            aux++;
        }

        System.out.println("Valor da Série = " + serie);
        teclado.close();
    }
}
