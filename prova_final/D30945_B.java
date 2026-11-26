package prova_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D30945_B {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        List<Double> corredores = new ArrayList<Double>();
        List<String> nomeCorredores = new ArrayList<String>();
        double topDez[] = new double[10], tempo;
        String topDezNomes[] = new String[10], nome, nomeBusca;
        int posicao = -1;


        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite o RA do aluno (X para encerrar): ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                nomeCorredores.add(nome);
                System.out.print("Digite o tempo do corredor: ");
                tempo = teclado.nextDouble();
                corredores.add(tempo);
                teclado.nextLine();
            }
        } while (!nome.equalsIgnoreCase("X"));

        for (int i = 0; i < corredores.size() - 1; i++) {
            for (int x = 0; x < corredores.size() - 1; x++) {
                if (corredores.get(x + 1) < (corredores.get(x))) {
                    tempo = corredores.get(x);
                    corredores.set(x + 1, corredores.get(x));
                    corredores.set(x + 1, tempo);

                    nome = nomeCorredores.get(x + 1);
                    nomeCorredores.set(x + 1, nomeCorredores.get(x));
                    nomeCorredores.set(x, nome);
                }
            }
        }

        System.out.print("Escreva o nome que você quer buscar para ver se está no top 10: ");
        nomeBusca = teclado.nextLine();

        for (int i = 0; i < 10; i++) {
            if (nomeCorredores.get(i).equalsIgnoreCase(nomeBusca)) {
                posicao = i + 1;
                break;
            }
        }
        if (posicao == -1)
            System.out.println("NÃO ENCONTRADO NO TOP 10");
        else
            System.out.println("Está na posição: " + posicao);


        teclado.close();
    }
}
