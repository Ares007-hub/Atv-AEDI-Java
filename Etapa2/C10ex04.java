package Etapa2;

import java.util.Scanner;

public class C10ex04 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a taxa de BDI (em %): ");
        double taxaBDI = teclado.nextDouble();
        teclado.nextLine();

        String material;
        double custoTotal = 0;

        do {
            System.out.print("Informe o nome do material (ou FIM para encerrar): ");
            material = teclado.nextLine();

            if (!material.equalsIgnoreCase("FIM")) {
                System.out.print("Quantidade: ");
                int quantidade = teclado.nextInt();
                System.out.print("Preço unitário: ");
                double precoUnitario = teclado.nextDouble();
                teclado.nextLine();

                double custoParcial = quantidade * precoUnitario;
                System.out.printf("Custo parcial de %s: R$ %.2f\n", material, custoParcial);
                custoTotal += custoParcial;
            }
        } while (!material.equalsIgnoreCase("FIM"));

        double valorBDI = custoTotal * (taxaBDI / 100);
        double precoFinal = custoTotal + valorBDI;

        System.out.printf("Custo Total = R$ %.2f\n", custoTotal);
        System.out.printf("Valor do BDI = R$ %.2f\n", valorBDI);
        System.out.printf("Preço Final = R$ %.2f\n", precoFinal);

        teclado.close();
    }
}