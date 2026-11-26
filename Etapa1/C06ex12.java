package Etapa1;

import java.util.Scanner;

public class C06ex12 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int bolas, bolasEstragadas, mesesCopa;
        double caixaValor, total, valorAluguel, caixaQuantidade, galpao;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas bolas foram produzidas na fabrica? ");
        bolas = teclado.nextInt();
        System.out.print("Quantas bolas tem defeito e serão descartadas? ");
        bolasEstragadas = teclado.nextInt();
        System.out.print("Valor de cada caixa de papelão: ");
        caixaValor = teclado.nextDouble();
        System.out.print("Quantos meses faltam para a copa: ");
        mesesCopa = teclado.nextInt();
        System.out.print("Valor mensal do aluguel: ");
        valorAluguel = teclado.nextDouble();

        bolas = bolas - bolasEstragadas;
        caixaQuantidade = Math.ceil(bolas / 10);
        galpao = Math.ceil(caixaQuantidade / 850);
        total = caixaQuantidade * caixaValor + valorAluguel * galpao * mesesCopa;

        System.out.print("O custo total é: " + total);


        teclado.close();
    }
}
