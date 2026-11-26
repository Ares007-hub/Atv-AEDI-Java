package Etapa2;

import java.util.Scanner;

public class C08ex06 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int numero, verificacao, par = 0, impar = 0, divisivelPorQuatro = 0, divisivelPorTres = 0;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Escreva um número: ");
            numero = teclado.nextInt();
            verificacao = numero % 2;
            if (verificacao == 0)
                par++;

            else impar++;
            verificacao = numero % 4;
            if (verificacao == 0) divisivelPorQuatro += numero;
            verificacao = numero % 3;
            if (verificacao == 0) divisivelPorTres++;
        }
        System.out.println("Númer(os) par(es) " + par + "\nNúmer(os) Ímpar(es): : " + impar + "\nSoma dos números divisíveis por 4 =  " + divisivelPorQuatro + "\nQuantidade de números divisíveis por 3 =  " + divisivelPorTres);

        teclado.close();
    }
}
