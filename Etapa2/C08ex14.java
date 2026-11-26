package Etapa2;

import java.util.Scanner;

public class C08ex14 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        byte numero;

        Scanner teclado = new Scanner(System.in);

        for (byte aux = 1; aux <= 20; aux++) {
            System.out.print("Escreva o número para a matrix: ");
            numero = teclado.nextByte();
            for (byte aux1 = 1; aux1 <= numero; aux1++) {
                ;
                for (byte aux2 = 1; aux2 <= numero; aux2++) {
                    System.out.print("* ");
                }
                System.out.println("\n");
                
            }
        }


    }
}
