package Etapa2;

import java.util.Scanner;

public class C08ex31 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de engenheiros: ");
        int qtd = teclado.nextInt();

        int contAcimaMinimo = 0, contOutrosMais5000 = 0, contAdmin = 0;
        double somaSalariosAdmin = 0, menorSalario = 0;
        String nomeMenor = "", cargoMenor = "";

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.print("Salário Bruto: ");
            double salario = teclado.nextDouble();
            System.out.print("Código do Cargo (C, P, O, A, X): ");
            String codigo = teclado.next().toUpperCase();

            double minExigido = 0;
            switch(codigo) {
                case "C": minExigido = 2500; break;
                case "P": minExigido = 4650; break;
                case "O": minExigido = 3200; break;
                case "A": minExigido = 5100; break;
            }

            if (!codigo.equals("X")) {
                if (salario < minExigido) System.out.println("ABAIXO DO SALÁRIO MÍNIMO");
                else contAcimaMinimo++;
            }

            if (codigo.equals("A")) {
                contAdmin++;
                somaSalariosAdmin += salario;
            }

            if (codigo.equals("X") && salario > 5000) contOutrosMais5000++;

            if (i == 1 || salario < menorSalario) {
                menorSalario = salario;
                nomeMenor = nome;
                cargoMenor = codigo.equals("X") ? "Outros" : codigo;
            }
        }

        if (contAdmin > 0) System.out.println("Média dos salários dos Administradores = R$" + (somaSalariosAdmin / contAdmin));
        System.out.println("Quantidade de salários acima do mínimo = " + contAcimaMinimo);
        System.out.println("Quantidade de engenheiros de cargo 'Outros' que recebem acima de R$5000 = " + contOutrosMais5000);
        System.out.println("Nome, cargo e salário do engenheiro de menor salário = " + nomeMenor + ", " + cargoMenor + ", R$" + menorSalario);

        teclado.close();
    }
}