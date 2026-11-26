package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C14EX02 {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        double area;

        opcao = 0;
        area = 0;

        while (opcao != 9) {
            System.out.println("\n=== CÁLCULO DE ÁREA DE FIGURAS GEOMÉTRICAS ===");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Triângulo Retângulo");
            System.out.println("4 - Círculo");
            System.out.println("9 - Sair");
            System.out.print(">>> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    area = C14EX02_Areas.areaQuadrado();
                    break;
                case 2:
                    area = C14EX02_Areas.areaRetangulo();
                    break;
                case 3:
                    area = C14EX02_Areas.areaTrianguloRetangulo();
                    break;
                case 4:
                    area = C14EX02_Areas.areaCirculo();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }

            if (opcao >= 1 && opcao <= 4) {
                System.out.printf("Área da figura = %.2f\n", area);
            }
        }

        System.out.println("FIM DO PROGRAMA");
        teclado.close();
    }
}
