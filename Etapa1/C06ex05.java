package Etapa1;

import java.util.Scanner;

public class C06ex05 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int n1, n2, n3;
        String resposta;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva um número inteiro: ");
        n1 = teclado.nextInt();
        n2 = n1 % 7;
        n3 = n1 % 5;
        if (n2 == 0 && n3 == 0)
            resposta = " é divisivel por 5 e 7";
        else
            resposta = " não é divisivel por 5 e 7";
        System.out.println("O número que você enviou" + resposta);

        teclado.close();
    }
}
