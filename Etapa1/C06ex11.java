package Etapa1;

import java.util.Scanner;

public class C06ex11 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        String equipe1, equipe2;
        int sets1, sets2;
        int pontos1, pontos2;
        System.out.print("Digite o nome da equipe 1: ");
        equipe1 = teclado.nextLine();
        System.out.print("Digite o nome da equipe 2: ");
        equipe2 = teclado.nextLine();
        System.out.print("Digite os sets ganhos pela equipe 1: ");
        sets1 = teclado.nextInt();
        System.out.print("Digite os sets ganhos pela equipe 2: ");
        sets2 = teclado.nextInt();
        if (sets1 > sets2) {
            if (sets2 == 2) {
                pontos1 = 2;
                pontos2 = 1;
            } else {
                pontos1 = 3;
                pontos2 = 0;
            }
        } else {
            if (sets1 == 2) {
                pontos1 = 1;
                pontos2 = 2;
            } else {
                pontos1 = 0;
                pontos2 = 3;
            }
        }
        System.out.println("\nResultado da partida:");
        System.out.println(equipe1 + " ganhou " + pontos1 + " ponto(s).");
        System.out.println(equipe2 + " ganhou " + pontos2 + " ponto(s).");

        teclado.close();
    }
}
        
