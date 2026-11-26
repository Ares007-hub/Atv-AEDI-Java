package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX02 {
    public static void main(String[] args) {
        Scanner teclado;
        int vet[];

        teclado = new Scanner(System.in);
        vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe um número inteiro: ");
            vet[i] = teclado.nextInt();
        }

        System.out.print("Números impressos: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > 5 && vet[i] < 10) {
                System.out.print(vet[i] + " ");
            }
        }

        teclado.close();
    }
}