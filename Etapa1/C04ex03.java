package Etapa1;

import java.util.Scanner;

public class C04ex03 {
    public static void main() {
        double quantidadePoluentePrimario, quantidadePoluenteSecundario, precoMultaInicial, precoMultaSecundario, precoMultaFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de poluente para o primeiro parametro: ");
        quantidadePoluentePrimario = teclado.nextDouble();
        System.out.print("Digite a quantidade de poluente para o segundo parametro: ");
        quantidadePoluenteSecundario = teclado.nextDouble();
        System.out.print("Digite o preço da primeiro multa: ");
        precoMultaInicial = teclado.nextDouble();
        System.out.print("Digite o preço da segunda multa: ");
        precoMultaSecundario = teclado.nextDouble();
        System.out.print("Digite o preço da terceira multa:  ");
        precoMultaFinal = teclado.nextDouble();
        System.out.println("\nQuantidade de poluente emitido x valor multa \n\nAté " + quantidadePoluentePrimario + " multa de R$" + precoMultaInicial + "\nEntre " + quantidadePoluentePrimario + " e " + quantidadePoluenteSecundario + " multa de R$ " + precoMultaSecundario + "\nAcima de " + quantidadePoluenteSecundario + " multa de R$ " + precoMultaFinal + " por poluente emitido. ");
        teclado.close();
        //Raphael Augusto de Paula Freitas


    }
}
