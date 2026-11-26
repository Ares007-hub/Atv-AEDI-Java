package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args) {
        Scanner teclado;
        String nomes[];
        double notas[];
        double soma;
        double media;

        teclado = new Scanner(System.in);
        nomes = new String[50];
        notas = new double[50];
        soma = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o nome do aluno: ");
            nomes[i] = teclado.nextLine();
            System.out.print("Informe a nota da prova: ");
            notas[i] = teclado.nextDouble();
            teclado.nextLine();
            soma += notas[i];
        }

        media = soma / notas.length;
        System.out.println("\nAlunos acima da média (" + media + "):");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(nomes[i]);
            }
        }

        teclado.close();
    }
}
