package Etapa2;

import java.util.Scanner;

public class C11ex05 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        int qtdIngles = 0, totalAlunos = 0;
        double totalMensalidades = 0, totalIngles = 0, totalFrances = 0, totalEspanhol = 0;

        while (true) {
            System.out.print("Nome do Aluno (FIM para sair): ");
            String nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("FIM")) break;

            System.out.print("Opção (1-Inglês, 2-Francês, 3-Espanhol): ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            double valor = 0;
            if (opcao == 1) { valor = 100.00; qtdIngles++; totalIngles += valor; }
            else if (opcao == 2) { valor = 150.00; totalFrances += valor; }
            else if (opcao == 3) { valor = 120.00; totalEspanhol += valor; }

            System.out.printf("Aluno: %s | Mensalidade: R$ %.2f\n", nome, valor);
            totalMensalidades += valor;
            totalAlunos++;
        }

        System.out.println("Quantidade de alunos de Inglês: " + qtdIngles);
        if (totalAlunos > 0) {
            System.out.printf("Mensalidade média da escola: R$ %.2f\n", (totalMensalidades / totalAlunos));
        }
        System.out.printf("Total Inglês: R$ %.2f\n", totalIngles);
        System.out.printf("Total Francês: R$ %.2f\n", totalFrances);
        System.out.printf("Total Espanhol: R$ %.2f\n", totalEspanhol);

        teclado.close();
    }
}