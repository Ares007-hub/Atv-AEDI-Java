package Etapa1;

import java.util.Scanner;

public class C06ex03 {
    public static void main(String[] args) {
        double salarioFixo, salario, venda;

        Scanner teclado = new Scanner(System.in);

        System.out.print("fale quanto vc vendeu:  ");
        venda = teclado.nextDouble();
        salarioFixo = 240;
        if (venda <= 1000)
            salario = salarioFixo + 0;
        else if (venda > 10000)
            salario = salarioFixo + 1000;
        else
            salario = salarioFixo + venda * 0.1;
        System.out.println("O seu salário é: " + salario);

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
