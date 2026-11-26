package Etapa2;

import java.util.Scanner;

public class C08ex22 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número inteiro maior que zero: ");
        int num = teclado.nextInt();
        int divisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) divisores++;
        }

        if (divisores == 2) System.out.println(num + " é primo.");
        else System.out.println(num + " não é primo.");

        teclado.close();
    }
}
