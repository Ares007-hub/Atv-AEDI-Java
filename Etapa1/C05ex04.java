package Etapa1;

import java.util.Scanner;

public class C05ex04 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distancia;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o x do primeiro ponto: ");
        x1 = teclado.nextDouble();
        System.out.print("Escreva o x do segundo ponto: ");
        x2 = teclado.nextDouble();
        System.out.print("Escreva o y do primeiro ponto: ");
        y1 = teclado.nextDouble();
        System.out.print("Escreva o y do segundo ponto: ");
        y2 = teclado.nextDouble();
        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.print("A resposta é: " + distancia);

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
