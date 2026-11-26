package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX10 {
    public static void main(String[] args) {
        Scanner teclado;
        String nomeCompleto;
        char letra;

        teclado = new Scanner(System.in);

        System.out.print("Informe o nome completo: ");
        nomeCompleto = teclado.nextLine().toUpperCase();

        for (int i = 0; i < nomeCompleto.length(); i++) {
            letra = nomeCompleto.charAt(i);
            if (letra != ' ') {
                System.out.println(letra);
            }
        }

        teclado.close();
    }
}