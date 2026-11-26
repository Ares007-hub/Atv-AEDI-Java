package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args) {
        Scanner teclado;
        int vet[];
        int soma;

        teclado = new Scanner(System.in);
        vet = new int[10];
        soma = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe um número inteiro: ");
            vet[i] = teclado.nextInt();
            soma += vet[i];
        }

        System.out.print("Divisores da soma (" + soma + "): ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != 0 && soma % vet[i] == 0) {
                System.out.print(vet[i] + " ");
            }
        }

        teclado.close();
    }
}
