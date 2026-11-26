package Etapa2;

import java.util.Scanner;

public class C10ex02 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        double valor, valorTotal = 0;
        int cont = 0, contAcima1000 = 0;

        do {
            System.out.print("Informe o valor recebido (ou 0 para sair): ");
            valor = teclado.nextDouble();

            if (valor != 0) {
                valorTotal += valor;
                cont++;
                if (valor > 1000) {
                    contAcima1000++;
                }
            }
        } while (valor != 0);

        if (cont > 0) {
            System.out.printf("Valor total recebido = %.2f\n", valorTotal);
            System.out.printf("Média dos valores recebidos = %.2f\n", (valorTotal / cont));
            System.out.println("Quantidade de valores acima de R$1000,00 = " + contAcima1000);
        }

        teclado.close();
    }
}