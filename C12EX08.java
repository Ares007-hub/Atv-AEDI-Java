package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args) {
        Scanner teclado;
        int vet[];

        teclado = new Scanner(System.in);
        vet = new int[20];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número inteiro: ");
            vet[i] = teclado.nextInt();
        }

        System.out.print("Números impressos: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((vet[i] + vet[i + 10]) + " ");
        }

        teclado.close();
    }
}