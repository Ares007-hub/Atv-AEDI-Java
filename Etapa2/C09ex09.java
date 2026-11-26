package Etapa2;

import java.util.Scanner;

public class C09ex09 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double num, den, serie = 0;
        int vezes;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva as quantidades de vezes que ira repetir o programa: ");
        vezes = teclado.nextInt();
        for (int aux = 1; aux <= vezes; aux++) {
            num = Math.pow(3, aux + 1);
            den = (aux + 9) * Math.sqrt(Math.pow(aux, 4));

            serie += num / den;
        }
        serie = 100 - Math.pow(serie, 3);
        System.out.print("Valor da Série = " + serie);

        teclado.close();
    }
}
