package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX06 {
    public static void main(String[] args) {
        Scanner teclado;
        String meses[];

        teclado = new Scanner(System.in);
        meses = new String[12];

        for (int i = 0; i < meses.length; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º mês: ");
            meses[i] = teclado.nextLine();
        }

        System.out.println("\nMeses em ordem inversa:");
        for (int i = meses.length - 1; i >= 0; i--) {
            System.out.println(meses[i]);
        }

        teclado.close();
    }
}
