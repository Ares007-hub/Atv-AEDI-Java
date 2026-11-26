package Etapa3;

import java.util.Scanner;

public class C13ex02p2 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas

        Scanner teclado = new Scanner(System.in);

        double x, resultado;

        System.out.print("x: ");
        x = teclado.nextDouble();

        while (x != -1) {
            resultado = C13ex02p1.calcularFx(x);

            System.out.println("f(x): " + resultado);

            System.out.print("x: ");
            x = teclado.nextDouble();
        }

        teclado.close();
    }
}