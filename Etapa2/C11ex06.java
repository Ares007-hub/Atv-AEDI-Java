package Etapa2;

import java.util.Scanner;

public class C11ex06 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        int aud4 = 0, aud7 = 0, aud12 = 0, totalPessoas = 0, validos = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("Canal sintonizado (4, 7, 12 ou outro para TV desligada/outros): ");
            int canal = teclado.nextInt();

            if (canal == 4 || canal == 7 || canal == 12) {
                System.out.print("Pessoas assistindo: ");
                int pessoas = teclado.nextInt();

                if (canal == 4) aud4 += pessoas;
                else if (canal == 7) aud7 += pessoas;
                else if (canal == 12) aud12 += pessoas;

                totalPessoas += pessoas;
                validos++;
            }
        }

        System.out.println("Audiência Total:");
        System.out.println("Canal 4: " + aud4 + " pessoas");
        System.out.println("Canal 7: " + aud7 + " pessoas");
        System.out.println("Canal 12: " + aud12 + " pessoas");

        if (totalPessoas > 0) {
            System.out.println("Porcentagem de audiência:");
            System.out.printf("Canal 4: %.2f%%\n", ((double) aud4 / totalPessoas * 100));
            System.out.printf("Canal 7: %.2f%%\n", ((double) aud7 / totalPessoas * 100));
            System.out.printf("Canal 12: %.2f%%\n", ((double) aud12 / totalPessoas * 100));
        }

        int maisAssistido = 4;
        int maxAud = aud4;
        if (aud7 > maxAud) { maisAssistido = 7; maxAud = aud7; }
        if (aud12 > maxAud) { maisAssistido = 12; maxAud = aud12; }
        System.out.println("Canal mais assistido: " + maisAssistido);

        if (validos > 0) {
            System.out.printf("Média de pessoas assistindo (nas casas válidas): %.2f\n", ((double) totalPessoas / validos));
        }

        teclado.close();
    }
}