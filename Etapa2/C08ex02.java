package Etapa2;

import java.util.Scanner;

public class C08ex02 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int presenca;
        double nota;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Escreva a nota do aluno (Escreva -1 para encerrar): ");
            nota = teclado.nextDouble();

            if (nota == -1)
                break;

            System.out.print("Escreva as faltas do aluno: ");
            presenca = teclado.nextInt();

            if (nota >= 65 && presenca <= 16)
                System.out.println("Aprovado");
            else
                System.out.println("Reprovado");
        }
        System.out.println("Programa finalizado.");
        teclado.close();
    }
}
