package Etapa1;

import java.util.Scanner;

public class C06ex13 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int hora1, hora2, horaFinal, min1, min2, minSoma, minFinal;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva a hora que começa o jogo: ");
        hora1 = teclado.nextInt();
        System.out.print("Escreva o minuto que começa o jogo: ");
        min1 = teclado.nextInt();
        System.out.print("Escreva a hora que termina o jogo: ");
        hora2 = teclado.nextInt();
        System.out.print("Escreva o minuto que termina o jogo: ");
        min2 = teclado.nextInt();

        minSoma = (min2 - min1) / 60;
        horaFinal = hora2 - hora1 + minSoma;
        minFinal = (min2 - min1) % 60;

        System.out.printf("O jogo durou %d horas e %d minutos ", horaFinal, minFinal);

        teclado.close();
    }
}
