package Etapa1;

import java.util.Scanner;

public class C06ex04 {
    public static void main(String[] args) {

        double IMC, peso, altura;
        String resposta;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o seu peso: ");
        peso = teclado.nextDouble();
        System.out.print("Escreva o sua altura: ");
        altura = teclado.nextDouble();
        IMC = (float) peso / Math.pow(altura, 2);
        if (IMC < 18)
            resposta = "pessoa está desnutrida";
        else if (IMC < 20 && IMC > 18)
            resposta = "pessoa está abaixo do peso";
        else if (IMC >= 20 && IMC <= 25)
            resposta = "pessoa está no peso ideal";
        else if (IMC > 25 && IMC <= 27)
            resposta = "pessoa está acima do peso";
        else
            resposta = "pessoa está obesa";
        System.out.println("A " + resposta);

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
