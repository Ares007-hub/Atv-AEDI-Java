package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {
        Scanner teclado;
        String nomes[];
        double notas[];
        char conceito;

        teclado = new Scanner(System.in);
        nomes = new String[50];
        notas = new double[50];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o nome do aluno: ");
            nomes[i] = teclado.nextLine();
            System.out.print("Informe a nota final: ");
            notas[i] = teclado.nextDouble();
            teclado.nextLine(); // Limpeza de buffer
        }

        for (int i = 0; i < nomes.length; i++) {
            if (notas[i] <= 30) {
                conceito = 'D';
            } else if (notas[i] <= 60) {
                conceito = 'C';
            } else if (notas[i] <= 80) {
                conceito = 'B';
            } else {
                conceito = 'A';
            }
            System.out.println("Aluno: " + nomes[i] + " - Conceito: " + conceito);
        }

        teclado.close();
    }
}