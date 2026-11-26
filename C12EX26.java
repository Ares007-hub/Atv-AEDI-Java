package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX26 {
    public static void main(String[] args) {
        Scanner teclado;
        List<String> listaNomes;
        List<Double> listaSalarios;
        String nome;
        double salario;
        double indice;
        double novoSalario;

        teclado = new Scanner(System.in);
        listaNomes = new ArrayList<String>();
        listaSalarios = new ArrayList<Double>();

        do {
            System.out.print("Digite o nome do funcionário (X para encerrar): ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                listaNomes.add(nome);
                System.out.print("Digite o salário: ");
                salario = teclado.nextDouble();
                listaSalarios.add(salario);
                teclado.nextLine();
            }
        } while (!nome.equalsIgnoreCase("X"));

        System.out.print("\nInforme o índice de reajuste salarial (%): ");
        indice = teclado.nextDouble();

        for (int i = 0; i < listaSalarios.size(); i++) {
            if (listaSalarios.get(i) < 1000) {
                novoSalario = listaSalarios.get(i) * (1 + indice / 100);
                listaSalarios.set(i, novoSalario);
            }
        }

        System.out.println("\nLista atualizada:");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i) + " - R$ " + listaSalarios.get(i));
        }

        teclado.close();
    }
}
