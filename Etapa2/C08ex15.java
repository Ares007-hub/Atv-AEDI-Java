package Etapa2;

import java.util.Scanner;

public class C08ex15 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        double somaSalarios18 = 0, maiorSalario = 0;
        int contAte18 = 0;
        String nomeMaior = "", cargoMaior = "";

        for (int i = 1; i <= 1000; i++) {
            System.out.print("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.print("Cargo: ");
            String cargo = teclado.nextLine();
            System.out.print("Salário: ");
            double salario = teclado.nextDouble();
            System.out.print("Idade: ");
            int idade = teclado.nextInt();

            if (salario > 10000 && idade > 50) {
                System.out.println("SÊNIOR: " + nome);
            }

            if (idade <= 18) {
                somaSalarios18 += salario;
                contAte18++;
            }

            if (i == 1 || salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
                cargoMaior = cargo;
            }
        }

        if (contAte18 > 0) System.out.println("Média dos salários (até 18): " + (somaSalarios18 / contAte18));
        System.out.println("Maior salário: " + nomeMaior + " - " + cargoMaior);
        teclado.close();
    }
}