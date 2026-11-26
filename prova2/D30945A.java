package prova2;

import java.util.Scanner;


public class D30945A {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas

        double s = 0, q, n = 0, d = 0, verificacao = 0;
        int repeticao;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva a carga de Q: ");
        q = teclado.nextDouble();
        System.out.print("Escreva quantas vezes ira repetir? ");
        repeticao = teclado.nextInt();

        for (int aux = 1; aux <= repeticao; aux++) {
            System.out.print("Me fale o valor de D que seja multiplo de 10(10 à 150): ");
            d = teclado.nextDouble();
            verificacao = d % 10;
            if (verificacao == 0 && d <= 150 && d >= 10) {
                if (d < 50)
                    n = 6;
                else if (d >= 100)
                    n = 2;
                else
                    n = 4;
                s = (4 * q) * n / (3.1416 * Math.pow(d, 2));
                System.out.printf("Resultado é: %1.4f \n", s);
            }
            else
                System.out.println("Não é permitido essd valor de D");
        }

        teclado.close();
    }
}