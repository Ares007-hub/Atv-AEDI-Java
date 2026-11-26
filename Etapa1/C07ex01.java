package Etapa1;

import java.util.Scanner;

public class C07ex01 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do apostador: ");
        String nome = scanner.nextLine();

        System.out.print("Quantidade de acertos: ");
        int acertos = scanner.nextInt();

        String premio = switch (acertos) {
            case 0, 1, 2, 3, 4, 5 -> "Nenhum prêmio";
            case 6, 7, 8, 9, 10 -> "Ganha outro cartão";
            case 11 -> "Prêmio de R$100,00";
            case 12 -> "Prêmio de R$1.000,00";
            case 13 -> "Prêmio de R$50.000,00";
            default -> "Quantidade de acertos inválida";
        };

        System.out.println("Apostador: " + nome);
        System.out.println("Resultado: " + premio);

        scanner.close();
    }
}