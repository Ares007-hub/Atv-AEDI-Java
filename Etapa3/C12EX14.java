package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX14 {
    public static void main(String[] args) {
        Scanner teclado;
        int bilhetes[];
        int premiado;
        int sorteado;

        teclado = new Scanner(System.in);
        bilhetes = new int[100];
        premiado = 0;

        for (int i = 0; i < bilhetes.length; i++) {
            System.out.print("Informe o número do " + (i + 1) + "º bilhete: ");
            bilhetes[i] = teclado.nextInt();
        }

        System.out.print("\nInforme o número do bilhete sorteado: ");
        sorteado = teclado.nextInt();

        for (int i = 0; i < bilhetes.length; i++) {
            if (bilhetes[i] == sorteado) {
                premiado = i + 1;
                break;
            }
        }

        if (premiado == 0) {
            System.out.println("A pessoa NÃO foi premiada.");
        } else {
            System.out.println("A pessoa FOI PREMIADA com o " + premiado + "º bilhete!");
        }

        teclado.close();
    }
}
