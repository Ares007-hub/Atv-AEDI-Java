package Etapa2;

import java.util.Scanner;

public class C09ex04 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double num, den, serie = 0, valor = 0;
        int vezes;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva as quantidades de vezes que ira repetir o programa: ");
        vezes = teclado.nextInt();
        for (int aux = 1; aux <= vezes; aux++) {
            num = (valor += 1) * (valor += 1);
            den = (valor += 1) * (valor += 1);

            serie += num / den;
        }
        serie = Math.sqrt(serie);
        System.out.print("Valor da Série = " + serie);

        teclado.close();
    }

}
