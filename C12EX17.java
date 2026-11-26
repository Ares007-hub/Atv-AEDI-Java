package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX17 {
    public static void main(String[] args) {
        Scanner teclado;
        int vet[];
        int somaPares;
        int contPares;
        double media;

        teclado = new Scanner(System.in);
        vet = new int[10];
        somaPares = 0;
        contPares = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe um número inteiro: ");
            vet[i] = teclado.nextInt();
        }

        System.out.print("Números pares: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                somaPares += vet[i];
                contPares++;
            }
        }

        if (contPares > 0) {
            media = (double) somaPares / contPares;
            System.out.println("\nMédia dos números pares = " + media);
        } else {
            System.out.println("\nNenhum número par foi informado.");
        }

        teclado.close();
    }
}
