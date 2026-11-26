package Etapa1;

import java.util.Scanner;

public class C05ex07 {
    public static void main(String[] args) {

        double x, fx;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o valor de X: ");
        x = teclado.nextDouble();
        fx = Math.sqrt(Math.pow(x / 4.0 + 1, 2) + 1 / 5.0 * x);
        System.out.println("O valor de f(x): " + fx);

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
