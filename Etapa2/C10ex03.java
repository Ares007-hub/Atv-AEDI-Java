package Etapa2;

import java.util.Scanner;

public class C10ex03 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        double alfa, raio, area;
        final double PI = 3.1416;

        System.out.print("Informe o valor do ângulo (alfa): ");
        alfa = teclado.nextDouble();

        do {
            System.out.print("Informe o valor do raio (-1 para sair): ");
            raio = teclado.nextDouble();

            if (raio != -1) {
                area = (alfa * PI * Math.pow(raio, 2)) / 360;
                System.out.printf("Área do setor circular (S) = %.4f\n", area);
            }
        } while (raio != -1);

        teclado.close();
    }
}