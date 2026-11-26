package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX22 {
    public static void main(String[] args) {
        Scanner teclado;
        String placas[];
        String donos[];
        String busca;
        int vaga;

        teclado = new Scanner(System.in);
        placas = new String[100];
        donos = new String[100];

        for (int i = 0; i < placas.length; i++) {
            System.out.print("Informe a placa do carro (Vaga " + i + "): ");
            placas[i] = teclado.nextLine();
            System.out.print("Informe o nome do dono da vaga: ");
            donos[i] = teclado.nextLine();
        }

        System.out.print("\nInforme a placa do carro ou o nome do morador para pesquisar: ");
        busca = teclado.nextLine();
        vaga = -1;

        for (int i = 0; i < placas.length; i++) {
            if (placas[i].equalsIgnoreCase(busca) || donos[i].equalsIgnoreCase(busca)) {
                vaga = i;
                break;
            }
        }

        if (vaga == -1) {
            System.out.println("Placa ou morador não encontrado.");
        } else {
            System.out.println("O número da vaga é: " + vaga);
        }

        teclado.close();
    }
}
