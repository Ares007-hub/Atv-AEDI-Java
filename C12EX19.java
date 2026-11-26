package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX19 {
    public static void main(String[] args) {
        Scanner teclado;
        int vet1[];
        int vet2[];

        teclado = new Scanner(System.in);
        vet1 = new int[10];
        vet2 = new int[10];

        for (int i = 0; i < vet1.length; i++) {
            System.out.print("Informe um número inteiro: ");
            vet1[i] = teclado.nextInt();
        }

        for (int i = 0; i < vet1.length; i++) {
            vet2[i] = vet1[vet1.length - 1 - i];
        }

        System.out.print("Vetor 2 (invertido): ");
        for (int i = 0; i < vet2.length; i++) {
            System.out.print(vet2[i] + " ");
        }

        teclado.close();
    }
}
