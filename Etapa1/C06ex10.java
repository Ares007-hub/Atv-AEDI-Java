package Etapa1;

import java.util.Scanner;

public class C06ex10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double capital, taxa, rendimento, imposto, valorResgatado;
        int dias;

        System.out.print("Digite o capital aplicado: R$ ");
        capital = teclado.nextDouble();
        System.out.print("Digite o número de dias que ficou aplicado: ");
        dias = teclado.nextInt();
        System.out.print("Digite a taxa diária (%): ");
        taxa = teclado.nextDouble();
        taxa = taxa / 100;
        rendimento = capital * taxa * dias;
        imposto = rendimento * 0.15;
        valorResgatado = capital + rendimento - imposto - 10.00;
        System.out.printf("Rendimento: R$ %.2f%n", rendimento);
        System.out.printf("Imposto de Renda: R$ %.2f%n", imposto);
        System.out.printf("Valor a ser resgatado: R$ %.2f%n", valorResgatado);

        teclado.close();
    }
}


