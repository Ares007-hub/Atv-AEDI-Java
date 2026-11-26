package Etapa1;

import java.util.Scanner;

public class C05ex02 {
    public static void main(String[] args) {
        double raio, area, volume;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o raio da superfície esférica: ");
        raio = teclado.nextDouble();
        area = 4 * 3.1416 * Math.pow(raio, 2);
        volume = 4 / 3.0 * 3.1416 * Math.pow(raio, 3);
        System.out.println("O valor da área é: " + area + "\ne o valor do volume é: " + volume);

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
