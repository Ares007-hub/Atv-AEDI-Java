package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX01 {
    public static void main(String[] args) {
        Scanner teclado;
        int vet[];
        int cont;

        teclado = new Scanner(System.in);
        vet = new int[10];
        cont = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe um número inteiro: ");
            vet[i] = teclado.nextInt();
        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 5 == 0 && vet[i] % 7 == 0) {
                cont++;
            }
        }

        System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: " + cont);
        teclado.close();
    }
}
