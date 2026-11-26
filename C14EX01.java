package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C14EX01 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        opcao = 0;

        while (opcao != 9) {
            System.out.println("\n=== MENU DE PROGRAMAS ANTERIORES ===");
            System.out.println("1 - Distância entre dois pontos (C13EX01)");
            System.out.println("2 - Jogo de adivinhação de número (C13EX04)");
            System.out.println("3 - Seno, Cosseno e Tangente (C13EX05)");
            System.out.println("4 - Extrair último sobrenome (C13EX07)");
            System.out.println("5 - Formatar nome no padrão ABNT (C13EX08)");
            System.out.println("9 - Sair");
            System.out.print(">>> ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    C13EX01_Aux.executar();
                    break;
                case 2:
                    C13EX04_Aux.executar();
                    break;
                case 3:
                    C13EX05_Aux.executar();
                    break;
                case 4:
                    C13EX07_Aux.executar();
                    break;
                case 5:
                    C13EX08_Aux.executar();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        }

        System.out.println("FIM DO PROGRAMA");
        teclado.close();
    }
}