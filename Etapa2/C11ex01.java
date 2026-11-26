package Etapa2;

import java.util.Scanner;

public class C11ex01 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o limite de x: ");
        int limite = teclado.nextInt();

        double somaFx = 0;
        int cont = 0;
        int x = 1;

        while (x <= limite) {
            double fx = Math.pow(x, 2) + 4 * x - 25;
            System.out.println("x=" + x + "\tf(x)=" + fx);
            somaFx += fx;
            cont++;
            x += 2; // Incrementa de 2 em 2 para manter x ímpar
        }

        if (cont > 0) {
            System.out.println("Média de f(x) = " + (somaFx / cont));
        }
        teclado.close();
    }
}