package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX04_Aux {
    public static void main(String[] args) {
        Scanner teclado;
        int numeroGerado;
        int palpite;
        int tentativas;

        teclado = new Scanner(System.in);
        numeroGerado = (int) Math.floor(Math.random() * 101);
        tentativas = 0;

        do {
            System.out.print("Tente adivinhar o número (0 a 100): ");
            palpite = teclado.nextInt();
            tentativas++;

            if (palpite > numeroGerado) {
                System.out.println("O número informado está ACIMA do número gerado.");
            } else if (palpite < numeroGerado) {
                System.out.println("O número informado está ABAIXO do número gerado.");
            }
        } while (palpite != numeroGerado);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
        teclado.close();
    }

    public static void executar() {
    }
}