package Etapa2;

import java.util.Scanner;

public class C09ex05 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double num, den, serie = 0;
        int vezes;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva as quantidades de vezes que ira repetir o programa: ");
        vezes = teclado.nextInt();
        for (int aux = 1; aux <= vezes; aux++) {
            num = (aux - 1) * 2 + aux * 3;
            den = 6 * aux + 1;

            serie += num / den;
        }
        serie = 5 * serie;
        System.out.print("Valor da Série = " + serie);

        teclado.close();
    }
}
