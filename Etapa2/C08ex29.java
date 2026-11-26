package Etapa2;

import java.util.Scanner;

public class C08ex29 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("X: ");
        int x = teclado.nextInt();
        System.out.print("Y: ");
        int y = teclado.nextInt();

        long result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        System.out.println("X^Y = " + result);
        teclado.close();
    }
}