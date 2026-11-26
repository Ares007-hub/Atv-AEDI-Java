package Etapa1;

import java.util.Scanner;
import java.util.Locale;

public class C06ex16 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Faltas: ");
        int faltas = scanner.nextInt();

        System.out.print("Nota da Prova 1: ");
        double p1 = scanner.nextDouble();

        System.out.print("Nota da Prova 2: ");
        double p2 = scanner.nextDouble();

        System.out.print("Nota da Prova 3: ");
        double p3 = scanner.nextDouble();

        System.out.print("Nota do Trabalho Final: ");
        double trabalho = scanner.nextDouble();

        System.out.print("Idade do aluno: ");
        int idade = scanner.nextInt();

        double menorProva = p1;
        if (p2 < menorProva) {
            menorProva = p2;
        }
        if (p3 < menorProva) {
            menorProva = p3;
        }

        double mediaMaiores = (p1 + p2 + p3 - menorProva) / 2.0;

        int peso1;
        if (faltas <= 5) {
            peso1 = 3;
        } else if (faltas <= 10) {
            peso1 = 2;
        } else {
            peso1 = 1;
        }

        int peso2;
        if (idade <= 17) {
            peso2 = 1;
        } else if (idade <= 50) {
            peso2 = 2;
        } else {
            peso2 = 3;
        }

        double notaFinal = (mediaMaiores * peso1) + (trabalho * peso2);

        String resultadoFinal;
        if (notaFinal <= 50) {
            resultadoFinal = "Reprovado";
        } else if (notaFinal <= 70) {
            resultadoFinal = "Regular";
        } else if (notaFinal <= 80) {
            resultadoFinal = "Bom";
        } else if (notaFinal <= 90) {
            resultadoFinal = "Muito Bom";
        } else {
            resultadoFinal = "Excelente";
        }

        System.out.println("Resultado = " + resultadoFinal);

        scanner.close();
    }
}