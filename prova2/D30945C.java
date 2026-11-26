package prova2;

import java.util.Scanner;


public class D30945C {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        String nome = "", codigo = "", nomeMenor = "", precoMax = "";
        double preco = 0, media = 0, menorPreco = 10000;
        boolean comecar = true;
        int contagemS = 0, contagemC = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Estamos fazendo uma fiscalização sobre o preço da gasolina. \nCaso tenha terminado a pesquisa, escreva X no nome do posto");
        while (comecar == true) {
            System.out.print("\nEscreva o nome do posto: ");
            nome = teclado.nextLine();
            if (nome.trim().equalsIgnoreCase("X"))
                break;
            System.out.print("Escreva o código da região(S, N ou C): ");
            codigo = teclado.nextLine();
            System.out.print("Escreva o valor da gasolina: ");
            preco = teclado.nextDouble();
            if (codigo.trim().equalsIgnoreCase("S")) {
                if (preco > 2.5)
                    precoMax = "PREÇO ACIMA DO TETO";
                else
                    precoMax = "";
                contagemS++;
                media += preco;
            } else if (codigo.trim().equalsIgnoreCase("N")) {
                if (preco > 2.10)
                    precoMax = "PREÇO ACIMA DO TETO";
                else
                    precoMax = "";
            } else if (codigo.trim().equalsIgnoreCase("C")) {
                if (preco > 2.25)
                    precoMax = "PREÇO ACIMA DO TETO";
                else if (preco <= 2)
                    contagemC++;
                else
                    precoMax = "";
            } else
                System.out.println("Código da região está errado.");
            System.out.print(precoMax);
            if (menorPreco > preco) {
                menorPreco = preco;
                nomeMenor = nome;
            }
            teclado.nextLine();
        }
        media = media / contagemS;
        System.out.println("Média dos preços da gasolina cobrados pelos postos da região SUL/LESTE = " + media + "\nQuantidade de postos da região CENTRO que cobram até R$2,00 = " + contagemC + "\nO NOME do posto de gasolina que cobra o MENOR preço = " + nomeMenor);

        teclado.close();
    }
}