package Etapa1;

import java.util.Scanner;

public class C05ex12 {
    public static void main(String[] args) {

        int horas, minutos, segundos1, segundos2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva quantos segundos durou o evendo: ");
        segundos1 = teclado.nextInt();
        horas = segundos1 / 3600;
        minutos = segundos1 / 60 % 60;
        segundos2 = segundos1 % 60;
        System.out.println("O show duro: " + horas + "H " + minutos + "min " + segundos2 + "seg");

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
