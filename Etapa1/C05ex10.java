package Etapa1;

import java.util.Scanner;

public class C05ex10 {
    public static void main(String[] args) {

        int n1, n2, n3, n4, n5, nPrincipal;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva um número inteiro com 5 digitos: ");
        nPrincipal = teclado.nextInt();
        n1 = nPrincipal / 10000;
        n2 = nPrincipal / 1000 % 10;
        n3 = nPrincipal % 1000 / 100;
        n4 = nPrincipal % 100 / 10;
        n5 = nPrincipal % 10;
        System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + n5 + "\n");

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
