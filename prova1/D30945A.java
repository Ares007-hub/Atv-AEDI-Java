package prova1;

import java.util.Scanner;

public class D30945A {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double valorX, fX;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o valor de x: ");
        valorX = teclado.nextDouble();

        fX = 7 * Math.pow(valorX, 4) / 12.0 - Math.pow(2 * Math.pow(valorX, 2) - 3 * valorX + 1, 1 / 5.0) + 5 / (valorX + 2);

        System.out.printf("O valor é: %1.3f", fX);

        teclado.close();
    }
}
