package Etapa1;

import java.util.Scanner;

public class C05ex08 {
    public static void main(String[] args) {

        double areaSetor, angulo, raio;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escre o valor da área de um setor circular: ");
        areaSetor = teclado.nextDouble();
        System.out.print("Escre o valor do ângulo: ");
        angulo = teclado.nextDouble();
        raio = Math.sqrt((areaSetor / angulo / 3.1416) * 360);
        System.out.println(raio);


        teclado.close();
        //Raphael Augusto de Paula Freitas

    }
}
