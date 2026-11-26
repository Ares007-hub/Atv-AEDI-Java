package Etapa1;

import java.util.Scanner;

public class C06ex07 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double salario, plBruto, plLiquido, impostoRenda, valorFixo, porcentagem;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o sálario do seu empregado: ");
        salario = teclado.nextDouble();
        if (salario <= 300) {
            valorFixo = 500;
            porcentagem = 0.7;
        } else if (salario <= 1000) {
            valorFixo = 200;
            porcentagem = 0.5;

        } else {
            valorFixo = 0;
            porcentagem = 0.3;
        }
        plBruto = valorFixo + salario * porcentagem;
        impostoRenda = 0.25 * plBruto;
        plLiquido = plBruto - impostoRenda;
        System.out.println("O PL liquido do funcionario é: " + plLiquido);


        teclado.close();
    }
}
