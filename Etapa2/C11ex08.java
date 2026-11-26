package Etapa2;

import java.util.Scanner;

public class C11ex08 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor da hora trabalhada: ");
        double valorHora = teclado.nextDouble();
        teclado.nextLine();

        double totalFolha = 0, maiorSalario = 0;
        int totalPessoas = 0, somaHoras = 0;
        int faixa1 = 0, faixa2 = 0, faixa3 = 0;
        String nomeMaior = "", funcMaior = "";

        while (true) {
            System.out.print("Nome (FIM para sair): ");
            String nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("FIM")) break;

            System.out.print("Função: ");
            String funcao = teclado.nextLine();
            System.out.print("Horas Trabalhadas: ");
            int horas = teclado.nextInt();
            teclado.nextLine();

            double premio;
            if (horas <= 100) {
                premio = 1000.00;
                faixa1++;
            } else if (horas <= 500) {
                premio = 10.00 * horas;
                faixa2++;
            } else {
                premio = 100.00 * (horas / 10);
                faixa3++;
            }

            double salario = (horas * valorHora) + premio;
            System.out.printf("Valor a receber: R$ %.2f\n", salario);

            totalFolha += salario;
            somaHoras += horas;
            totalPessoas++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaior = nome;
                funcMaior = funcao;
            }
        }

        if (totalPessoas > 0) {
            System.out.println("Média de horas trabalhadas: " + ((double) somaHoras / totalPessoas));
            System.out.println("Maior salário: " + nomeMaior + " (" + funcMaior + ")");
            System.out.println("Qtd Pessoas - Prêmio até 100h: " + faixa1);
            System.out.println("Qtd Pessoas - Prêmio 101h a 500h: " + faixa2);
            System.out.println("Qtd Pessoas - Prêmio acima de 500h: " + faixa3);
            System.out.printf("Valor total da folha: R$ %.2f\n", totalFolha);
        }

        teclado.close();
    }
}
