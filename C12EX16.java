package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX16 {
    public static void main(String[] args) {
        Scanner teclado;
        String cidades[];
        String estados[];
        int populacao[];
        String tempCidade;
        String tempEstado;
        int tempPop;

        teclado = new Scanner(System.in);
        cidades = new String[100];
        estados = new String[100];
        populacao = new int[100];

        for (int i = 0; i < cidades.length; i++) {
            System.out.print("Informe o nome da cidade: ");
            cidades[i] = teclado.nextLine();
            System.out.print("Informe o estado (UF): ");
            estados[i] = teclado.nextLine();
            System.out.print("Informe a população: ");
            populacao[i] = teclado.nextInt();
            teclado.nextLine();
        }

        // Ordenação decrescente pela população (sincronizando os 3 vetores)
        for (int i = 0; i < populacao.length - 1; i++) {
            for (int x = 0; x < populacao.length - 1; x++) {
                if (populacao[x] < populacao[x + 1]) {
                    tempPop = populacao[x];
                    populacao[x] = populacao[x + 1];
                    populacao[x + 1] = tempPop;

                    tempCidade = cidades[x];
                    cidades[x] = cidades[x + 1];
                    cidades[x + 1] = tempCidade;

                    tempEstado = estados[x];
                    estados[x] = estados[x + 1];
                    estados[x + 1] = tempEstado;
                }
            }
        }

        System.out.println("\n10 maiores cidades:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º - " + cidades[i] + " / " + estados[i]);
        }

        teclado.close();
    }
}