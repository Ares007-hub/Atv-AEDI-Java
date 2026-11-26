package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX20 {
    public static void main(String[] args) {
        Scanner teclado;
        int vet[];
        int soma;
        int cont;
        int ultimo;
        double media;

        teclado = new Scanner(System.in);
        vet = new int[10];
        soma = 0;
        cont = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe um número inteiro: ");
            vet[i] = teclado.nextInt();
        }

        ultimo = vet[vet.length - 1];
        System.out.print("Números maiores que " + ultimo + ": ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > ultimo) {
                System.out.print(vet[i] + " ");
                soma += vet[i];
                cont++;
            }
        }

        if (cont > 0) {
            media = (double) soma / cont;
            System.out.println("\nMédia dos números impressos = " + media);
        } else {
            System.out.println("\nNenhum número maior que o último.");
        }

        teclado.close();
    }
}
