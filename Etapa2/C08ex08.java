package Etapa2;

import java.util.Scanner;

public class C08ex08 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int faltas = 0, quantidadeFaltas = 0;
        double nota = 0, soma = 0, media = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 3; aux++) {
            System.out.print("Escreva a quantidade de falta(s) do aluno: ");
            faltas = teclado.nextInt();
            System.out.print("Escreva a nota do aluno: ");
            nota = teclado.nextDouble();

            if (faltas <= 16 && nota >= 65) {
                media++;
                soma += nota;
            }
            if (faltas > 16) quantidadeFaltas++;
        }
        media = soma / media;
        System.out.println("Média das notas dos aprovados = " + media+"\nQuantidade de alunos com mais de 16 faltas = "+quantidadeFaltas);

        teclado.close();
    }
}
