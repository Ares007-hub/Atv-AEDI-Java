package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX04 {
    public static void main(String[] args) {
        Scanner teclado;
        int corredores[];

        teclado = new Scanner(System.in);
        corredores = new int[20];

        for (int i = 0; i < corredores.length; i++) {
            System.out.print("Informe o número do corredor (" + (i + 1) + "º lugar): ");
            corredores[i] = teclado.nextInt();
        }

        System.out.println("\nOrdem de largada (duplas):");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º - " + corredores[i] + " / " + corredores[i + 10]);
        }

        teclado.close();
    }
}