package Etapa2;

import java.util.Scanner;

public class C10ex08 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        String cidade, cidadeMenorPop = "";
        long popTotal = 0, eleitoresTotal = 0;
        int contCidades = 0, contCidadesMaisMulheres = 0;
        long somaHomens = 0, menorPop = Long.MAX_VALUE;

        do {
            System.out.print("Cidade: ");
            cidade = teclado.nextLine();

            if (cidade.equalsIgnoreCase("Zimbabue de Minas")) {
                System.out.print("População: ");
                long pop = teclado.nextLong();
                System.out.print("Eleitores: ");
                long eleitores = teclado.nextLong();
                System.out.print("Homens: ");
                long homens = teclado.nextLong();
                System.out.print("Mulheres: ");
                long mulheres = teclado.nextLong();
                teclado.nextLine();

                if ((homens + mulheres) != pop) {
                    System.out.println("Aviso em " + cidade + ": Soma de homens e mulheres difere da população.");
                }

                contCidades++;
                popTotal += pop;
                eleitoresTotal += eleitores;
                somaHomens += homens;

                if (mulheres > homens) {
                    contCidadesMaisMulheres++;
                }

                if (pop < menorPop) {
                    menorPop = pop;
                    cidadeMenorPop = cidade;
                }
                break; // A cidade flag também é processada
            }

            System.out.print("População: ");
            long pop = teclado.nextLong();
            System.out.print("Eleitores: ");
            long eleitores = teclado.nextLong();
            System.out.print("Homens: ");
            long homens = teclado.nextLong();
            System.out.print("Mulheres: ");
            long mulheres = teclado.nextLong();
            teclado.nextLine();

            if ((homens + mulheres) != pop) {
                System.out.println("Aviso em " + cidade + ": Soma de homens e mulheres difere da população.");
            }

            contCidades++;
            popTotal += pop;
            eleitoresTotal += eleitores;
            somaHomens += homens;

            if (mulheres > homens) {
                contCidadesMaisMulheres++;
            }

            if (pop < menorPop) {
                menorPop = pop;
                cidadeMenorPop = cidade;
            }

        } while (true);

        if (contCidades > 0) {
            System.out.println("Total de cidades do estado = " + contCidades);
            System.out.println("População total do estado = " + popTotal);
            System.out.printf("Percentual de eleitores = %.3f%%\n", ((double)eleitoresTotal / popTotal * 100));
            System.out.println("Quantidade de cidades cuja população tem mais mulheres = " + contCidadesMaisMulheres);
            System.out.printf("Média de homens (em relação a todas as cidades) = %d\n", (somaHomens / contCidades));
            System.out.println("O nome da cidade de menor população do estado = " + cidadeMenorPop);
        }

        teclado.close();
    }
}
