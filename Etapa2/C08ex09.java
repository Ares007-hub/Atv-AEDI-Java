package Etapa2;

import java.util.Scanner;

public class C08ex09 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        String nome, sexo;
        int idade, pessoas, quantidadeMasculina = 0, quantidadeFeminina = 0;
        double mediaMas = 0.0, mediaFem = 0.0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas irão participar: ");
        pessoas = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 1; aux <= pessoas; aux++) {
            System.out.print("Escreva o nome: ");
            nome = teclado.nextLine();
            System.out.print("Escreva a idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Escreva o sexo: ");
            sexo = teclado.nextLine();

            if (sexo.trim().equalsIgnoreCase("M")) {
                quantidadeMasculina++;
                mediaMas += idade;
            } else if (sexo.trim().equalsIgnoreCase("F")) {
                quantidadeFeminina++;
                mediaFem += idade;
            }
        }
        mediaMas = mediaMas/quantidadeMasculina;
        mediaFem = mediaFem/quantidadeFeminina;
        System.out.println("Média das idades dos homens = "+mediaMas+"\nMédia das idades das mulheres = "+mediaFem);

        teclado.close();
    }
}
