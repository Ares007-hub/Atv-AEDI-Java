package Etapa2;

import java.util.Scanner;

public class C08ex18 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número (1-9): ");
        int num = teclado.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }
        teclado.close();
    }
}