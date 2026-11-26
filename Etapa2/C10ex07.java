package Etapa2;

import java.util.Scanner;

public class C10ex07 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a população: ");
        double populacao = teclado.nextDouble();

        double contaminados = 1; // 1 pessoa inicialmente
        int diasTotal = 0;

        do {
            contaminados += contaminados * 0.003;
            diasTotal++;
        } while (contaminados < populacao);

        int anos = diasTotal / 365;
        int restoDias = diasTotal % 365;
        int meses = restoDias / 30;
        int dias = restoDias % 30;

        System.out.printf("Anos = %d Meses = %d Dias = %d\n", anos, meses, dias);

        teclado.close();
    }
}