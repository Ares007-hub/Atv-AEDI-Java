package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX02 {
    public static void main(String[] args) {
        Scanner teclado;
        double x;

        teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o valor de x (-1 para encerrar): ");
            x = teclado.nextDouble();
            if (x != -1) {
                System.out.println("f(x) = " + C13EX02_Funcao.calculaFx(x));
            }
        } while (x != -1);

        teclado.close();
    }
}