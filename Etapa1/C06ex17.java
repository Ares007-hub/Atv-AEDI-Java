package Etapa1;

import java.util.Scanner;

public class C06ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1) Você tem curso técnico de programação? (V/F): ");
        boolean q1 = scanner.nextLine().trim().equalsIgnoreCase("V");

        System.out.print("2) Você tem curso superior de programação? (V/F): ");
        boolean q2 = scanner.nextLine().trim().equalsIgnoreCase("V");

        System.out.print("3) Você tem menos de 3 anos de experiência em programação? (V/F): ");
        boolean q3 = scanner.nextLine().trim().equalsIgnoreCase("V");

        System.out.print("4) Você se considera uma pessoa criativa? (V/F): ");
        boolean q4 = scanner.nextLine().trim().equalsIgnoreCase("V");

        System.out.print("5) Você prefere liderar a ser liderado? (V/F): ");
        boolean q5 = scanner.nextLine().trim().equalsIgnoreCase("V");

        System.out.print("6) Você prefere trabalhar sozinho a trabalhar em equipe? (V/F): ");
        boolean q6 = scanner.nextLine().trim().equalsIgnoreCase("V");

        System.out.print("7) Você é autodidata (aprende sozinho)? (V/F): ");
        boolean q7 = scanner.nextLine().trim().equalsIgnoreCase("V");

        System.out.print("8) Você aceitaria uma remuneração inicial de R$1500? (V/F): ");
        boolean q8 = scanner.nextLine().trim().equalsIgnoreCase("V");

        System.out.print("9) Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? (V/F): ");
        boolean q9 = scanner.nextLine().trim().equalsIgnoreCase("V");

        boolean regraA = q2 || (q1 && !q2 && !q3);
        boolean regraB = !(q5 && q8);
        boolean apta = q4 && !q6 && q7 && !q9 && regraA && regraB;

        if (apta) {
            System.out.println("Resultado: Apto para exercer a função de programador na empresa.");
        } else {
            System.out.println("Resultado: Não apto para exercer a função de programador na empresa.");
        }

        scanner.close();
    }
}