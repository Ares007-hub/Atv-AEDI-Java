package Etapa1;

import java.util.Scanner;

public class C06ex08 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        String nome;
        double altura, pesoMaximo, pesoMinimo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Escreva sua altura em metros: ");
        altura = teclado.nextDouble();
        pesoMaximo = 25 * Math.pow(altura, 2);
        pesoMinimo = 20 * Math.pow(altura, 2);
        System.out.printf("Olá %s \nSeu peso mínimo é: %1.2f\nSeu peso máximo é: %1.2f", nome, pesoMinimo, pesoMaximo);


        teclado.close();
    }
}
