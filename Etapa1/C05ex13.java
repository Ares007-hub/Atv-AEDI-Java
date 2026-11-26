package Etapa1;

import java.util.Scanner;

public class C05ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 4 dígitos: ");
        String numero = scanner.next();

        // Inverte o texto usando StringBuilder
        String invertido = new StringBuilder(numero).reverse().toString();

        if (numero.equals(invertido)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
        //Raphael Augusto de Paula Freitas
    }
}