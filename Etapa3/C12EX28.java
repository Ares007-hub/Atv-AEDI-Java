package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX28 {
    public static void main(String[] args) {
        Scanner teclado;
        List<String> listaRas;
        List<String> listaNomes;
        String ra;
        String nome;
        String tempNome;
        String tempRa;
        String nomeBusca;
        int pos;

        teclado = new Scanner(System.in);
        listaRas = new ArrayList<String>();
        listaNomes = new ArrayList<String>();

        do {
            System.out.print("Digite o RA do aluno (X para encerrar): ");
            ra = teclado.nextLine();
            if (!ra.equalsIgnoreCase("X")) {
                listaRas.add(ra);
                System.out.print("Digite o nome do aluno: ");
                nome = teclado.nextLine();
                listaNomes.add(nome);
            }
        } while (!ra.equalsIgnoreCase("X"));

        // Ordenação alfabética pelo nome (sincronizando RA e Nome)
        for (int i = 0; i < listaNomes.size() - 1; i++) {
            for (int x = 0; x < listaNomes.size() - 1; x++) {
                if (listaNomes.get(x).compareToIgnoreCase(listaNomes.get(x + 1)) > 0) {
                    tempNome = listaNomes.get(x);
                    listaNomes.set(x, listaNomes.get(x + 1));
                    listaNomes.set(x + 1, tempNome);

                    tempRa = listaRas.get(x);
                    listaRas.set(x, listaRas.get(x + 1));
                    listaRas.set(x + 1, tempRa);
                }
            }
        }

        System.out.print("\nInforme o nome do aluno a pesquisar: ");
        nomeBusca = teclado.nextLine();
        pos = -1;

        for (int i = 0; i < listaNomes.size(); i++) {
            if (listaNomes.get(i).equalsIgnoreCase(nomeBusca)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("NOME NÃO ENCONTRADO");
        } else {
            System.out.println("RA: " + listaRas.get(pos) + " | Posição na lista: " + (pos + 1));
        }

        teclado.close();
    }
}
