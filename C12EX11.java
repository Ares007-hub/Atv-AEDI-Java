package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX11 {
    public static void main(String[] args) {
        Scanner teclado;
        String nomes[];
        double notas[];
        double maiorNota;
        int posMaior;

        teclado = new Scanner(System.in);
        nomes = new String[50];
        notas = new double[50];
        maiorNota = 0;
        posMaior = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o nome do aluno: ");
            nomes[i] = teclado.nextLine();
            System.out.print("Informe a nota da prova: ");
            notas[i] = teclado.nextDouble();
            teclado.nextLine();

            if (i == 0 || notas[i] > maiorNota) {
                maiorNota = notas[i];
                posMaior = i;
            }
        }

        System.out.println("Aluno com a maior nota: " + nomes[posMaior]);
        teclado.close();
    }
}
