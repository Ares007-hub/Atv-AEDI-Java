package Etapa1;

import java.util.Scanner;

public class C05ex01 {
    public static void main(String[] args) {
        double n1, calculo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva um número para calcular a função de segundo grau: ");
        n1 = teclado.nextDouble();
        calculo = Math.pow(n1, 3) + n1 * 4 + 10;
        System.out.printf("A respota do calculo é: " + calculo);

        teclado.close();
        //Raphael Augusto de Paula Freitas

    }
}
