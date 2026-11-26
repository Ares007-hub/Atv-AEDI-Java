package Etapa1;

import java.util.Scanner;

public class C06ex14 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int n1, n2, n3, n4, n5;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Esvreva um número de 4 digitos: ");
        n1 = teclado.nextInt();
        n2 = n1 % 10;
        n3 = n1 % 100 / 10;
        n4 = n1 % 1000 / 100;
        n5 = n1 / 1000;

        System.out.printf("O número de trás para frente é %d%d%d%d", n2, n3, n4, n5);

        teclado.close();
    }

}
