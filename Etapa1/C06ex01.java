package Etapa1;

import java.util.Scanner;

public class C06ex01 {
    public static void main(String[] args) {
        double x, fx;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva o valor de x: ");
        x = teclado.nextDouble();
        if (x == 4)
            fx = 0;

        else if (x > 4)
            fx = (float) (5 * x + 3) / (Math.sqrt(Math.pow(x, 2) - 16));

        else
            fx = (float) (5 * x + 3) / (Math.sqrt(16 - Math.pow(x, 2)));

        System.out.println("O valor de fx é: " + fx);

        teclado.close();
        //Raphael Augusto de Paula Freitas'
    }
}
