package Etapa2;

import java.util.Scanner;

public class C08ex04 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int idade, contagem = 0;
        String nome;

        Scanner teclado = new Scanner(System.in);

        for (byte aux = 1; aux <= 50; aux++) {
            System.out.print("Escreva seu nome: ");
            nome = teclado.nextLine();
            if (aux > 1)
                teclado.nextLine();
            System.out.print("Escreva sua idade: ");
            idade = teclado.nextInt();
            if (idade > 18)
                contagem++;
        }
        System.out.printf("Até 18: %d \nAcima de 18: %d", (50 - contagem),contagem );

        teclado.close();
    }
}