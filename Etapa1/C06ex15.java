package Etapa1;

import java.util.Scanner;
import java.util.Locale;

public class C06ex15 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Código do pacote (1-Basic, 2-Advanced, 3-Premium): ");
        int codigo = scanner.nextInt();

        System.out.print("Quantidade de dias de consumo de canais PPP: ");
        int dias = scanner.nextInt();

        System.out.print("Valor dos serviços extras (R$): ");
        double extras = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Cidade do assinante: ");
        String cidade = scanner.nextLine().trim().toLowerCase();

        double valorFixo = 0.0;
        double valorPPP = 0.0;

        switch (codigo) {
            case 1:
                valorFixo = 65.00;
                valorPPP = dias * 1.20;
                if (valorPPP > 65.00) {
                    valorPPP = 65.00;
                }
                break;
            case 2:
                valorFixo = 104.00;
                valorPPP = dias * 2.10;
                break;
            case 3:
                valorFixo = 137.00;
                valorPPP = 0.0;
                break;
            default:
                System.out.println("Código de pacote inválido!");
                scanner.close();
                return;
        }

        double subtotal = valorFixo + valorPPP + extras;
        double imposto = 0.0;

        if (cidade.equals("belo horizonte")) {
            imposto = 0.0;
        } else if (cidade.equals("são paulo") || cidade.equals("sao paulo")) {
            imposto = 0.01;
        } else if (cidade.equals("rio de janeiro")) {
            imposto = 0.015;
        } else {
            imposto = 0.02;
        }

        double contaFinal = subtotal + (subtotal * imposto);

        System.out.printf(Locale.US, "Conta = R$%.2f\n", contaFinal);

        scanner.close();
    }
}