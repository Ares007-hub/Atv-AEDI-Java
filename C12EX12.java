package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX12 {
    public static void main(String[] args) {
        Scanner teclado;
        String nomes[];
        double notas[];
        double maiorNota;

        teclado = new Scanner(System.in);
        nomes = new String[50];
        notas = new double[50];
        maiorNota = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o nome do aluno: ");
            nomes[i] = teclado.nextLine();
            System.out.print("Informe a nota da prova: ");
            notas[i] = teclado.nextDouble();
            teclado.nextLine();

            if (i == 0 || notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.println("Alunos com a maior nota (" + maiorNota + "):");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == maiorNota) {
                System.out.println(nomes[i]);
            }
        }

        teclado.close();
    }
}
