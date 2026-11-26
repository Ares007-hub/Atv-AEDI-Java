package Etapa2;

import java.util.Scanner;

public class C10ex05 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        int contPessoas = 0, contMulheres = 0, contHomens = 0, contMulheresPesoMenor60 = 0;
        double somaAlturaHomens = 0, altura;
        String sexo;

        do {
            System.out.print("Informe a altura (ou 0 para encerrar): ");
            altura = teclado.nextDouble();

            if (altura != 0) {
                System.out.print("Informe o peso (kg): ");
                double peso = teclado.nextDouble();
                teclado.nextLine();

                do {
                    System.out.print("Informe o sexo (M/F): ");
                    sexo = teclado.nextLine();
                    if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                        System.out.println("Sexo inválido. Digite M ou F.");
                    }
                } while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));

                contPessoas++;

                if (sexo.equalsIgnoreCase("F")) {
                    contMulheres++;
                    if (peso < 60) {
                        contMulheresPesoMenor60++;
                    }
                } else if (sexo.equalsIgnoreCase("M")) {
                    contHomens++;
                    somaAlturaHomens += altura;
                }
            }
        } while (altura != 0);

        if (contPessoas > 0) {
            System.out.println("Total de pessoas pesquisadas: " + contPessoas);
            System.out.println("Quantidade de mulheres: " + contMulheres);

            if (contHomens > 0) {
                System.out.printf("Altura média dos homens: %.4f\n", (somaAlturaHomens / contHomens));
            }
            System.out.println("Quantidade de mulheres com peso inferior a 60: " + contMulheresPesoMenor60);
        }

        teclado.close();
    }
}