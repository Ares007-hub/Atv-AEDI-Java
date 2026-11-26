package Etapa2;

import java.util.Scanner;

public class C10ex06 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        double a, b, c, x0, y0, distancia;

        System.out.println("Informe os valores da reta (Ax + By + C = 0):");
        System.out.print("A = ");
        a = teclado.nextDouble();
        System.out.print("B = ");
        b = teclado.nextDouble();
        System.out.print("C = ");
        c = teclado.nextDouble();

        do {
            System.out.print("Informe a coordenada Xo: ");
            x0 = teclado.nextDouble();
            System.out.print("Informe a coordenada Yo: ");
            y0 = teclado.nextDouble();

            distancia = Math.abs(a * x0 + b * y0 + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.printf("Distância: %.5f\n", distancia);

        } while (distancia != 0);

        System.out.printf("Ponto coincidente com a reta encontrado: P(%.2f, %.2f)\n", x0, y0);

        teclado.close();
    }
}