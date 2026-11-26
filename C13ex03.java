package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX03 {
    public static void main(String[] args) {
        Scanner teclado;
        int numero;
        int posicao;
        int digito;

        teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro (0 a 999999999): ");
        numero = teclado.nextInt();
        System.out.print("Informe a posição do dígito (da direita para a esquerda): ");
        posicao = teclado.nextInt();

        digito = retornaDigito(numero, posicao);
        System.out.println("Retorno = " + digito);

        teclado.close();
    }

    static int retornaDigito(int num, int pos) {
        return (num / (int) Math.pow(10, pos - 1)) % 10;
    }
}