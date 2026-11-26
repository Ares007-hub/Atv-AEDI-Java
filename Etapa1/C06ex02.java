package Etapa1;

import java.util.Scanner;

public class C06ex02 {
    public static void main(String[] args) {
        double poluente, multa;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva quantidade de poluente emitido [mg/(t*m²)]: ");
        poluente = teclado.nextDouble();
        if (poluente <= 1500)
            multa = 0;
        else if (poluente > 3500)
            multa = 5000 * poluente;
        else
            multa = 3000;
        System.out.println("O valor da multa é: " + multa);

        teclado.close();
        //Raphael Augusto de Paula Freitas

    }
}
