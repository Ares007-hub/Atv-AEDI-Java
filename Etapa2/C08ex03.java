package Etapa2;

import java.util.Scanner;

public class C08ex03 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int presenca, contagemApr = 0, contagemRep = 0;
        double nota;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Escreva a nota do aluno (Escreva -1 para encerrar): ");
            nota = teclado.nextDouble();

            if (nota == -1)
                break;

            System.out.print("Escreva as faltas do aluno: ");
            presenca = teclado.nextInt();

            if (nota >= 65 && presenca <= 16) {
                System.out.println("Aprovado");
                contagemApr++;
            } else {
                System.out.println("Reprovado");
                contagemRep++;
            }
        }
        System.out.println("Teve " + contagemApr + "alunos aprovados");
        System.out.println("Teve " + contagemRep + "alunos aprovados");
        System.out.println("Programa finalizado.");
        teclado.close();
    }
}
