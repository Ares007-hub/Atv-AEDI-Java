package Etapa1;

import java.util.Scanner;

public class C05ex03 {
    public static void main(String[] args) {
        double salarioLiquido, salarioBruto, numeroDeDependentes, impostoDeRenda;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva seu salário: ");
        salarioBruto = teclado.nextDouble();
        System.out.print("Escreva quantas pessoas são seus dependentes: ");
        numeroDeDependentes = teclado.nextDouble();
        salarioLiquido = salarioBruto - (numeroDeDependentes * 60);
        impostoDeRenda = salarioLiquido * 0.15;
        System.out.println("O valor do imposto de renda que sera retido é: R$" + impostoDeRenda);

        teclado.close();
        //Raphael Augusto de Paula Freitas

    }
}
