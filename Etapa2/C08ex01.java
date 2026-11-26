package Etapa2;

import java.util.Scanner;

public class C08ex01 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double pi = 3.1416, area, raio;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Escreva o valor de R: ");
            raio = teclado.nextDouble();

            area = pi * Math.pow(raio, 2);

            System.out.println("O valor é: " + area);
        }
        System.out.println("Programa encerrado.");

        teclado.close();
    }
}
