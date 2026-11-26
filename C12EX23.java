package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX23 {
    public static void main(String[] args) {
        Scanner teclado;
        int vet1[];
        int vet2[];
        int cont;

        teclado = new Scanner(System.in);
        vet1 = new int[10];
        vet2 = new int[10];
        cont = 0;

        for (int i = 0; i < vet1.length; i++) {
            System.out.print("Informe um número inteiro: ");
            vet1[i] = teclado.nextInt();
            if (vet1[i] % 3 == 0) {
                vet2[cont] = vet1[i];
                cont++;
            }
        }

        System.out.print("Vetor 2 (divisíveis por 3): ");
        for (int i = 0; i < cont; i++) {
            System.out.print(vet2[i] + " ");
        }

        teclado.close();
    }
}