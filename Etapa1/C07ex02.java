package Etapa1;

import java.util.Scanner;

public class C07ex02 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        int n1 = scanner.nextInt();

        System.out.print("Nota 2: ");
        int n2 = scanner.nextInt();

        System.out.print("Nota 3: ");
        int n3 = scanner.nextInt();

        int notaFinal = (n1 + n2 + n3) / 3;

        String conceito = switch (notaFinal) {
            case 9, 10 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 5, 6 -> "D";
            case 0, 1, 2, 3, 4 -> "E";
            default -> "Nota inválida";
        };

        System.out.println("Conceito " + conceito);

        scanner.close();
    }
}