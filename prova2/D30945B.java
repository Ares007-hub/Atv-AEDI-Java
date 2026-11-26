package prova2;

import java.util.Scanner;


public class D30945B {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas

        double serie = 0, num = 0, den = 0;
        int vezes = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva as quantidades de vezes que ira repetir o programa: ");
        vezes = teclado.nextInt();

        for (int aux = 1; aux <= vezes; ++aux) {
            num = Math.pow(5, aux + 1) + Math.pow(3, aux - 1);
            den = aux * 100 + 5;
            serie += num / den;
        }
        serie = Math.pow(serie, 1 / 5.0) - 100;
        System.out.println("O resultado deu: " + serie);

        teclado.close();
    }
}