package Etapa2;

import java.util.Scanner;

public class C08ex21 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Altura (em metros): ");
        double altura = teclado.nextDouble();

        System.out.println("Peso\tIMC\tSituação Corpórea");
        for (int peso = 60; peso <= 100; peso++) {
            double imc = peso / Math.pow(altura, 2);
            String situacao = "";
            if (imc < 20) situacao = "ABAIXO DO PESO";
            else if (imc <= 25) situacao = "PESO IDEAL";
            else situacao = "ACIMA DO PESO";

            System.out.println(peso + "\t" + String.format("%.2f", imc) + "\t" + situacao);
        }
        teclado.close();
    }
}