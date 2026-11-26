package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args) {
        Scanner teclado;
        int vet[];

        teclado = new Scanner(System.in);
        vet = new int[20];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            vet[i] = teclado.nextInt();
        }

        System.out.print("Números impressos: ");
        // Sequência ímpar (1º, 3º, 5º... correspondem aos índices pares 0, 2, 4...)
        for (int i = 0; i < vet.length; i += 2) {
            System.out.print(vet[i] + " ");
        }
        // Sequência par (2º, 4º, 6º... correspondem aos índices ímpares 1, 3, 5...)
        for (int i = 1; i < vet.length; i += 2) {
            System.out.print(vet[i] + " ");
        }

        teclado.close();
    }
}
