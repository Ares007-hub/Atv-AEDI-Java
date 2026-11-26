package Etapa2;

import java.util.Scanner;

public class C08ex05a {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int votoFu = 0, votoCi = 0, votoBe = 0, nulo = 0;
        Scanner teclado = new Scanner(System.in);

        for (byte aux = 1; aux <= 5; aux++) {
            System.out.print("Em quem você vai votar? (1 - Fulano, 2 - Ciclano e 3 - Beltrano, Qualquer outro número - Nulo): ");
            int voto = teclado.nextInt();

            if (voto == 1) votoFu++;
            else if (voto == 2) votoCi++;
            else if (voto == 3) votoBe++;
            else nulo++;
        }

        int validos = votoFu + votoCi + votoBe;

        if (nulo > validos) {
            System.out.println("\nA eleição foi ANULADA! (Quantidade de votos nulos maior do que os votos válidos).");
        } else {
            int maior = Math.max(votoFu, Math.max(votoCi, votoBe));

            boolean fuEmpatou = (votoFu == maior);
            boolean ciEmpatou = (votoCi == maior);
            boolean beEmpatou = (votoBe == maior);

            int qtdEmpatados = (fuEmpatou ? 1 : 0) + (ciEmpatou ? 1 : 0) + (beEmpatou ? 1 : 0);

            if (qtdEmpatados == 1) {
                if (fuEmpatou) System.out.println("\nVencedor no 1º Turno: Fulano");
                else if (ciEmpatou) System.out.println("\nVencedor no 1º Turno: Ciclano");
                else System.out.println("\nVencedor no 1º Turno: Beltrano");
            } else {

                System.out.println("\nHouve um empate no 1º Turno! Iniciando o Segundo Turno...");

                int votoFu2 = 0, votoCi2 = 0, votoBe2 = 0, nulo2 = 0;

                String opcoes = "";
                if (fuEmpatou) opcoes += "1 - Fulano ";
                if (ciEmpatou) opcoes += "2 - Ciclano ";
                if (beEmpatou) opcoes += "3 - Beltrano ";

                for (byte aux = 1; aux <= 5; aux++) {
                    System.out.print("2º Turno - Em quem você vai votar? (" + opcoes + "| Qualquer outro número - Nulo): ");
                    int voto = teclado.nextInt();

                    if (voto == 1 && fuEmpatou) votoFu2++;
                    else if (voto == 2 && ciEmpatou) votoCi2++;
                    else if (voto == 3 && beEmpatou) votoBe2++;
                    else nulo2++;
                }

                int validos2 = votoFu2 + votoCi2 + votoBe2;

                if (nulo2 > validos2) {
                    System.out.println("\nA eleição de 2º Turno foi ANULADA! (Quantidade de votos nulos maior do que os votos válidos).");
                } else {
                    int maior2 = Math.max(votoFu2, Math.max(votoCi2, votoBe2));

                    boolean fuVenceu = (fuEmpatou && votoFu2 == maior2);
                    boolean ciVenceu = (ciEmpatou && votoCi2 == maior2);
                    boolean beVenceu = (beEmpatou && votoBe2 == maior2);

                    int qtdVencedores2 = (fuVenceu ? 1 : 0) + (ciVenceu ? 1 : 0) + (beVenceu ? 1 : 0);

                    if (qtdVencedores2 == 1) {
                        if (fuVenceu) System.out.println("\nVencedor do 2º Turno: Fulano");
                        else if (ciVenceu) System.out.println("\nVencedor do 2º Turno: Ciclano");
                        else System.out.println("\nVencedor do 2º Turno: Beltrano");
                    } else {
                        System.out.println("\nA eleição no 2º Turno terminou empatada novamente!");
                    }
                }
            }
        }

        teclado.close();
    }
}