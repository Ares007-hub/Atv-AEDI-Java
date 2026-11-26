package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX01_Aux {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;

        System.out.print("Informe x1: ");
        x1 = teclado.nextDouble();
        System.out.print("Informe y1: ");
        y1 = teclado.nextDouble();
        System.out.print("Informe x2: ");
        x2 = teclado.nextDouble();
        System.out.print("Informe y2: ");
        y2 = teclado.nextDouble();

        distancia = calculaDistancia(x1, y1, x2, y2);
        System.out.println("Distância = " + distancia);

        teclado.close();
    }

    static double calculaDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void executar() {
    }
}