package Etapa1;

import java.util.Scanner;
import java.util.Locale;

public class C07ex03 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Imposto = R$");
        double imposto = scanner.nextDouble();

        System.out.print("Dias = ");
        int dias = scanner.nextInt();

        double multa = switch (dias) {
            case 0, 1, 2, 3, 4, 5 -> 0.0;
            case 6, 7, 8 -> imposto * 0.02;
            case 9, 10 -> imposto * (0.10 + (0.005 * dias));
            default -> (imposto * 1.50) + dias;
        };

        if (multa % 1 == 0) {
            System.out.printf(Locale.US, "Multa = R$ %.0f\n", multa);
        } else {
            System.out.printf(Locale.US, "Multa = R$ %.2f\n", multa);
        }

        scanner.close();
    }
}