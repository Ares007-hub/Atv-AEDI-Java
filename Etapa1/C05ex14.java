package Etapa1;

import java.util.Scanner;

public class C05ex14 {
    public static void main(String[] args) {
        double t, v, T, c;

        Scanner teclado = new Scanner(System.in);

        c = 300000000;
        System.out.print("Escreva o valor de tempo em segundos: ");
        t = teclado.nextDouble();
        System.out.print("Escreva o valor de velocidade em m/s: ");
        v = teclado.nextDouble();
        T = t * (1 / Math.sqrt(1 - Math.pow(v, 2) / Math.pow(c, 2)));
        System.out.printf("O valor do tempo ralatico é : %1.4f", T);

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
