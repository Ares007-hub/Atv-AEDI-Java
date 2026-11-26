package Etapa2;

import java.util.Scanner;

public class C09ex03 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double num, den, serie = 0;
        int vezes;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva quantas vezes você quer que repita o programa: ");
        vezes = teclado.nextInt();
        for (int aux = 1; aux <= vezes; aux++) {
            num = 1 + Math.sqrt(4 * aux);
            den = aux * 3;
            serie += num / den;
        }
        System.out.print("Valor da Série = " + serie);

        teclado.close();
    }

}
