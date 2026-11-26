package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C12EX24 {
    public static void main(String[] args) {
        Scanner teclado;
        String equipes[];
        int pontos[];
        String tempEquipe;
        int tempPontos;
        String busca;
        int pos;

        teclado = new Scanner(System.in);
        equipes = new String[20];
        pontos = new int[20];

        for (int i = 0; i < equipes.length; i++) {
            System.out.print("Informe o nome da equipe: ");
            equipes[i] = teclado.nextLine();
            System.out.print("Informe a pontuação final: ");
            pontos[i] = teclado.nextInt();
            teclado.nextLine();
        }

        // Ordenação decrescente pela pontuação
        for (int i = 0; i < pontos.length - 1; i++) {
            for (int x = 0; x < pontos.length - 1; x++) {
                if (pontos[x] < pontos[x + 1]) {
                    tempPontos = pontos[x];
                    pontos[x] = pontos[x + 1];
                    pontos[x + 1] = tempPontos;

                    tempEquipe = equipes[x];
                    equipes[x] = equipes[x + 1];
                    equipes[x + 1] = tempEquipe;
                }
            }
        }

        System.out.print("\nInforme o nome da equipe para pesquisar: ");
        busca = teclado.nextLine();
        pos = -1;

        for (int i = 0; i < equipes.length; i++) {
            if (equipes[i].equalsIgnoreCase(busca)) {
                pos = i + 1;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Equipe não encontrada.");
        } else {
            System.out.print("Posição: " + pos + "º lugar - Situação: ");
            if (pos >= 1 && pos <= 4) {
                System.out.println("Copa Libertadores");
            } else if (pos >= 5 && pos <= 12) {
                System.out.println("Copa Sul-americana");
            } else if (pos >= 17 && pos <= 20) {
                System.out.println("Rebaixada");
            } else {
                System.out.println("Permanece na Série A");
            }
        }

        teclado.close();
    }
}
