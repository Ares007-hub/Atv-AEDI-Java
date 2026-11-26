package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX15 {
    public static void main(String[] args) {
        Scanner teclado;
        String meses[];
        String temp;

        teclado = new Scanner(System.in);
        meses = new String[12];

        for (int i = 0; i < meses.length; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º mês: ");
            meses[i] = teclado.nextLine();
        }

        // Ordenação Método da Bolha
        for (int i = 0; i < meses.length - 1; i++) {
            for (int x = 0; x < meses.length - 1; x++) {
                if (meses[x].compareToIgnoreCase(meses[x + 1]) > 0) {
                    temp = meses[x];
                    meses[x] = meses[x + 1];
                    meses[x + 1] = temp;
                }
            }
        }

        System.out.println("\nMeses em ordem alfabética:");
        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i]);
        }

        teclado.close();
    }
}
