package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {
        Scanner teclado;
        String fila[];
        int posicao;
        String nomeBusca;

        teclado = new Scanner(System.in);
        fila = new String[10];
        posicao = 0;

        for (int i = 0; i < fila.length; i++) {
            System.out.print("Informe o nome da " + (i + 1) + "ª pessoa da fila: ");
            fila[i] = teclado.nextLine();
        }

        System.out.print("\nInforme o nome a pesquisar na fila: ");
        nomeBusca = teclado.nextLine();

        for (int i = 0; i < fila.length; i++) {
            if (fila[i].equalsIgnoreCase(nomeBusca)) {
                posicao = i + 1;
                break;
            }
        }

        if (posicao == 0) {
            System.out.println("A pessoa não se encontra na fila.");
        } else {
            System.out.println("A pessoa está na " + posicao + "ª posição da fila.");
        }

        teclado.close();
    }
}
