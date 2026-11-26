package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX25 {
    public static void main(String[] args) {
        Scanner teclado;
        String frase;
        String palavras[];

        teclado = new Scanner(System.in);
        System.out.print("Informe uma frase curta: ");
        frase = teclado.nextLine();

        palavras = frase.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }

        teclado.close();
    }
}