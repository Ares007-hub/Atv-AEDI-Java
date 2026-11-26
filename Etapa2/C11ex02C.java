package Etapa2;

import java.util.Scanner;

public class C11ex02C {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        int totBronze = 0, totPrata = 0, totOuro = 0;
        double somaBronze = 0, volTotal = 0, menorApl = Double.MAX_VALUE;
        String nomeMenor = "";

        while (true) {
            System.out.print("Nome (X para sair): ");
            String nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("X")) break;

            System.out.print("Valor Aplicado: ");
            double valor = teclado.nextDouble();
            teclado.nextLine();

            String classe;
            if (valor <= 1000) {
                classe = "Bronze";
                totBronze++;
                somaBronze += valor;
            } else if (valor <= 5000) {
                classe = "Prata";
                totPrata++;
            } else {
                classe = "Ouro";
                totOuro++;
            }

            System.out.println("Classificação: " + classe);
            volTotal += valor;

            if (valor < menorApl) {
                menorApl = valor;
                nomeMenor = nome;
            }
        }

        System.out.println("Total de Bronze = " + totBronze);
        System.out.println("Total de Prata = " + totPrata);
        System.out.println("Total de Ouro = " + totOuro);
        if (totBronze > 0) {
            System.out.printf("Média das aplicações Bronze = R$ %.2f\n", (somaBronze / totBronze));
        }
        System.out.printf("Volume total = R$ %.2f\n", volTotal);
        System.out.println("Nome menor aplicação = " + nomeMenor);

        teclado.close();
    }
}