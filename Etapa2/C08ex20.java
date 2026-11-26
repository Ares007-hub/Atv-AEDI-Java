package Etapa2;

import java.util.Scanner;

public class C08ex20 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de termos (n): ");
        int n = teclado.nextInt();
        long soma = 0;

        for (int i = 0; i < n; i++) {
            long termo = (long) Math.pow(2, i);
            System.out.println(termo);
            soma += termo;
        }
        System.out.println("Soma dos termos: " + soma);
        teclado.close();
    }
}
