package Etapa1;

import java.util.Scanner;

public class C03ex02 {

    public static void main(String[] args) {
        double numero1, numero2, numero3, soma, media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        numero1 = teclado.nextLong();
        System.out.print("Informe outro número: ");
        numero2 = teclado.nextLong();
        System.out.print("Informe mais um número: ");
        numero3 = teclado.nextLong();
        soma = numero1 + numero2 + numero3;
        media = soma / 3.0;
        System.out.print("Média = " + media);
        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
