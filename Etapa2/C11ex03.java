package Etapa2;

import java.util.Scanner;

public class C11ex03 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        int qtdMultas8Pts1aQuinzena = 0;
        double totalArrecadado = 0;

        while (true) {
            System.out.print("Dia (99 para sair): ");
            int dia = teclado.nextInt();

            if (dia == 99) break;

            System.out.print("Placa: ");
            String placa = teclado.next();
            System.out.print("Pontos (3, 5 ou 8): ");
            int pontos = teclado.nextInt();

            double valorMulta = 0;
            if (pontos == 3) valorMulta = 42.00;
            else if (pontos == 5) valorMulta = 108.00;
            else if (pontos == 8) valorMulta = 479.00;

            System.out.printf("Placa: %s | Valor da Multa: R$ %.2f\n", placa, valorMulta);

            totalArrecadado += valorMulta;

            if (pontos == 8 && dia <= 15) {
                qtdMultas8Pts1aQuinzena++;
            }
        }

        System.out.println("Multas de 8 pontos na 1ª quinzena = " + qtdMultas8Pts1aQuinzena);
        System.out.printf("Total arrecadado = R$ %.2f\n", totalArrecadado);

        teclado.close();
    }
}