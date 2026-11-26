package Etapa2;

import java.util.Scanner;

public class C09ex06 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double num, den, serie = 0;

        for (int aux = 1; aux <= 20; aux++) {
            num = aux;
            den = Math.sqrt(aux * 2);

            serie += num / den;
        }
        serie = 10 + serie;
        System.out.print("Valor da Série = " + serie);

    }
}
