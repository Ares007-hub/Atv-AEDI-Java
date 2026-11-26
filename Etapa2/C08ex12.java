package Etapa2;

import java.util.Scanner;

public class C08ex12 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int codigo, qtde1 = 0, qtde2 = 0, qtde3 = 0, qtde4 = 0, qtde5 = 0;
        double total;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 11; aux++) {
            System.out.print("Informe o código do seu produto(A2450: 1 ; B2356: 2; C3900: 3; D4100: 4; E6749: 5. ): ");
            codigo = teclado.nextInt();
            if (codigo == 1)
                qtde1++;
            else if (codigo == 2)
                qtde2++;
            else if (codigo == 3)
                qtde3++;
            else if (codigo == 4)
                qtde4++;
            else if (codigo == 5)
                qtde5++;

        }
        total = qtde1 * 1565.00 + qtde2 * 1890.00 + qtde3 * 2150.00 + qtde4 * 2963.00 + qtde5 * 3750.00;
        System.out.println("Produto 1: " + qtde1 + "\nProduto 2: " + qtde2 + "\nProduto 3: " + qtde3 + "\nProduto 4: " + qtde4 + "\nProduto 5: " + qtde5 + "\n\nTotal: " + total);

        teclado.close();
    }
}
