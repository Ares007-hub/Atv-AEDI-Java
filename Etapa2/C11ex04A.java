package Etapa2;

import java.util.Scanner;

public class C11ex04A {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        int somaIdade = 0, contHomens = 0, contMulheres7Pts = 0, maiorIdade = -1;
        double totalMultas = 0;
        String nomeMaisVelho = "";

        for (int i = 1; i <= 230; i++) {
            System.out.print("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.print("Idade: ");
            int idade = teclado.nextInt();
            System.out.print("Sexo (M/F): ");
            String sexo = teclado.next();
            System.out.print("Pontos: ");
            int pontos = teclado.nextInt();
            System.out.print("Valor Multa: ");
            double valor = teclado.nextDouble();

            somaIdade += idade;
            totalMultas += valor;

            if (sexo.equalsIgnoreCase("M")) contHomens++;
            else if (sexo.equalsIgnoreCase("F") && pontos == 7) contMulheres7Pts++;

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeMaisVelho = nome;
            }
        }

        System.out.println("Idade média: " + ((double) somaIdade / 230));
        System.out.printf("Valor total das multas: R$ %.2f\n", totalMultas);
        System.out.println("Percentual de homens multados: " + ((double) contHomens / 230 * 100) + "%");
        System.out.println("Mulheres que perderam 7 pontos: " + contMulheres7Pts);
        System.out.println("Pessoa mais velha: " + nomeMaisVelho + " (" + maiorIdade + " anos)");

        teclado.close();
    }
}