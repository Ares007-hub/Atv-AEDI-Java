package Etapa1;

import java.util.Scanner;

public class C06ex09 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        String sexo, resposta;
        double altura, pesoIdeal;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva seu sexo(F or M): ");
        sexo = teclado.nextLine();
        System.out.print("Escreva sua altura em metros: ");
        altura = teclado.nextDouble();
        if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
            resposta = "sim";
        }
        else if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
            resposta = "sim";
        }
        else {
            pesoIdeal = 0;
            resposta = "não";
        }
        if (resposta == "sim")
            System.out.printf("Seu peso ideal é: %1.3f", pesoIdeal);
        else
            System.out.println("Não existe essa resposta");

        teclado.close();
    }
}
