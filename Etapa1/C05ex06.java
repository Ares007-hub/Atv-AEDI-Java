package Etapa1;

import java.util.Scanner;

public class C05ex06 {
    public static void main(String[] args) {

        double valA, valB, valC, cordX, cordY, dist;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o valor A: ");
        valA = teclado.nextDouble();
        System.out.print("Escreva o valor B: ");
        valB = teclado.nextDouble();
        System.out.print("Escreva o valor C: ");
        valC = teclado.nextDouble();
        System.out.print("Escreva a coordemada X: ");
        cordX = teclado.nextDouble();
        System.out.print("Escreva a coordenada Y: ");
        cordY = teclado.nextDouble();
        dist = (float) (valA * cordX + valB * cordY + valC) / (Math.sqrt(Math.pow(valA, 2) + Math.pow(valB, 2)));
        System.out.println("O valor da distância entre P e R é: " + dist);

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
