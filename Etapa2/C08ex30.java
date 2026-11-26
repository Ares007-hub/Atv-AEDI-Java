package Etapa2;

import java.util.Scanner;

public class C08ex30 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("x: ");
        double x = teclado.nextDouble();
        System.out.print("n: ");
        int n = teclado.nextInt();

        double s = Math.log(x); // ln(x)
        for (int i = 1; i <= n; i++) {
            s += (Math.pow(x, i) / i);
        }

        System.out.println("S = " + s);
        teclado.close();
    }
}
