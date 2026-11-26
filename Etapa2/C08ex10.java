package Etapa2;

import java.util.Scanner;

public class C08ex10 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int quantidade = 0;
        double valor = 0, valorTotal = 0, media = 0, teste = 0;
        String nome = "", nomeMaior = "";

        Scanner arquivo = new Scanner(
                C08ex10.class.getResourceAsStream("c08ex10.txt"));

        for (byte aux = 1; aux <= 4; aux++) {
            nome = arquivo.nextLine();
            quantidade = arquivo.nextInt();
            valor = arquivo.nextDouble();

            arquivo.nextLine();

            valorTotal += quantidade * valor;

            if (valor > teste) {
                nomeMaior = nome;
                teste = valor;
            }
        }

        media = valorTotal / 4;
        System.out.print("Custo Total: " + valorTotal + "\nMédia dos Custos Parciais: " + media + "\nNome do Insumo de maior custo: " + nomeMaior);

        arquivo.close();
    }
}