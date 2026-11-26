package Etapa1;

import java.util.Scanner;

public class C06ex06 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double a, b, c, delta, respostaPositivo, respostaNegativo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva a letra A da função de segundo grau: ");
        a = teclado.nextDouble();
        System.out.print("Escreva a letra B da função de segundo grau: ");
        b = teclado.nextDouble();
        System.out.print("Escreva a letra C da função de segundo grau: ");
        c = teclado.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            respostaPositivo = (-b + Math.sqrt(delta)) / (2 * a);
            respostaNegativo = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Temos 2 raízes e são: " + respostaPositivo + " " + respostaNegativo);
        } else if (delta == 0) {
            respostaNegativo = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Temos 1 raíz e é: " + respostaNegativo);
        } else
            System.out.println("Não temos raízes ");


        teclado.close();
    }
}
