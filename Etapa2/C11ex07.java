package Etapa2;

import java.util.Scanner;

public class C11ex07 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        double menorTemp = Double.MAX_VALUE, maiorTemp = -Double.MAX_VALUE;
        double somaTemps = 0;
        int qtdMaiorTemp = 0;

        for (int i = 1; i <= 121; i++) {
            System.out.print("Temperatura dia " + i + ": ");
            double temp = teclado.nextDouble();

            somaTemps += temp;

            if (temp < menorTemp) menorTemp = temp;

            if (temp > maiorTemp) {
                maiorTemp = temp;
                qtdMaiorTemp = 1;
            } else if (temp == maiorTemp) {
                qtdMaiorTemp++;
            }
        }

        System.out.println("Menor temperatura: " + menorTemp);
        System.out.println("Maior temperatura: " + maiorTemp);
        System.out.println("Média das temperaturas: " + (somaTemps / 121));
        System.out.println("Dias com a maior temperatura: " + qtdMaiorTemp);

        teclado.close();
    }
}