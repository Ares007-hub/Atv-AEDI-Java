package Etapa2;

import java.util.Scanner;

public class C11ex04B {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        int somaIdade = 0, contHomens = 0, contMulheres7Pts = 0, maiorIdade = -1, totalCondutores = 0;
        double totalMultas = 0;
        String nomeMaisVelho = "";

        while (true) {
            System.out.print("Nome (X para sair): ");
            String nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("X")) break;

            System.out.print("Idade: ");
            int idade = teclado.nextInt();
            System.out.print("Sexo (M/F): ");
            String sexo = teclado.next();
            System.out.print("Pontos: ");
            int pontos = teclado.nextInt();
            System.out.print("Valor Multa: ");
            double valor = teclado.nextDouble();
            teclado.nextLine();

            somaIdade += idade;
            totalMultas += valor;
            totalCondutores++;

            if (sexo.equalsIgnoreCase("M")) contHomens++;
            else if (sexo.equalsIgnoreCase("F") && pontos == 7) contMulheres7Pts++;

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeMaisVelho = nome;
            }
        }

        if (totalCondutores > 0) {
            System.out.println("Idade média: " + ((double) somaIdade / totalCondutores));
            System.out.printf("Valor total das multas: R$ %.2f\n", totalMultas);
            System.out.println("Percentual de homens multados: " + ((double) contHomens / totalCondutores * 100) + "%");
            System.out.println("Mulheres que perderam 7 pontos: " + contMulheres7Pts);
            System.out.println("Pessoa mais velha: " + nomeMaisVelho + " (" + maiorIdade + " anos)");
        }

        teclado.close();
    }
}