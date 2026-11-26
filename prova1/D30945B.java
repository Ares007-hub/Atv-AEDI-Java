package prova1;

import java.util.Scanner;

public class D30945B {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int n1, n2, n3, n4, n5, numeroPrincipal;
        double valorSoma;
        String verificacao;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva um número binario de 5 dígitos: ");
        numeroPrincipal = teclado.nextInt();


        n1 = numeroPrincipal / 10000;
        n2 = numeroPrincipal / 1000 % 10;
        n3 = numeroPrincipal / 100 % 10;
        n4 = numeroPrincipal / 10 % 10;
        n5 = numeroPrincipal / 100 % 10;
        verificacao = Integer.toString(n1);


        if (verificacao.trim().equalsIgnoreCase("1") || verificacao.trim().equalsIgnoreCase("0") ) {
            valorSoma = n1 * Math.pow(2, 4) + n2 * Math.pow(2, 3) + n3 * Math.pow(2, 2) + n4 * Math.pow(2, 1) + n5 * Math.pow(2, 0);
            System.out.println("O valor dado em binário é: " + valorSoma);
        } else {
            System.out.println("Não pode ser mais que 5 números");
        }


        teclado.close();
    }
}
