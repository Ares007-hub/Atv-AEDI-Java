package Etapa1;

import java.util.Scanner;

public class C05ex11 {
    public static void main(String[] args) {

        int bank, agencia, sequencial, cheque;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o número do seu cheque (9 números): ");
        cheque = teclado.nextInt();
        bank = cheque / 1000000;
        agencia = cheque / 1000 % 1000;
        sequencial = cheque % 1000;
        System.out.println("Cheque: " + cheque + "\nBanco: " + bank + "\nAgencia: " + agencia + "\nSequencial: " + sequencial);

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
