package Etapa2;

import java.util.Scanner;

public class C08ex13 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        String nome = "", nomeMenor = "";
        long populacao = 0, eleitores = 0, homens = 0, mulheres = 0;
        long menorPop = Long.MAX_VALUE;
        int cidadesAcima1M = 0, cidadesMaisMulheres = 0;
        double percentual = 0;

        Scanner arquivo = new Scanner(
                C08ex13.class.getResourceAsStream("c08ex13.txt"));

        while (arquivo.hasNext()) {
            nome = arquivo.nextLine();

            if (nome.trim().isEmpty()) {
                continue;
            }

            populacao = arquivo.nextLong();
            eleitores = arquivo.nextLong();
            homens = arquivo.nextLong();
            mulheres = arquivo.nextLong();

            arquivo.nextLine();

            if ((homens + mulheres) != populacao) {
                System.out.println("Aviso em " + nome + ": soma de homens e mulheres difere da populacao da cidade");
            }

            percentual = ((double) eleitores / populacao) * 100;
            System.out.println("Percentual de eleitores em " + nome + ": " + percentual + "%");

            if (populacao > 1000000) {
                cidadesAcima1M++;
            }

            if (mulheres > homens) {
                cidadesMaisMulheres++;
            }

            if (populacao < menorPop) {
                menorPop = populacao;
                nomeMenor = nome;
            }
        }

        System.out.println("\nQuantidade de cidades com populacao acima de 1 milhao: " + cidadesAcima1M);
        System.out.println("Quantidade de cidades com mais mulheres: " + cidadesMaisMulheres);
        System.out.println("Nome da cidade de menor populacao: " + nomeMenor);

        arquivo.close();
    }
}