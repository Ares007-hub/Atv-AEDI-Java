package Etapa2;

import java.util.Scanner;

public class C08ex05 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int voto, votoFu = 0, votoCi = 0, votoBe = 0, random = 0;
        String vencedor;


        Scanner teclado = new Scanner(System.in);

        for (byte aux = 1; aux <= 5; aux++) {
            System.out.print("Em quem você vai votar? (1 - Fulano, 2 - Ciclano e 3 - Beltrano): ");
            voto = teclado.nextInt();
            if (voto >= 1 && voto < 4) {
                if (voto == 1)
                    votoFu++;
                else if (voto == 3)
                    votoBe++;
                else
                    votoCi++;

            } else {
                System.out.println("Não pode votar nulo, seu voto vai para um qualquer um dos três");
                random++;
            }
        }
        random = random / 3;
        if (votoFu == votoCi || votoFu == votoBe) {
            votoFu--;
            votoBe++;
        } else if (votoBe == votoCi) {
            votoBe--;
            votoFu++;
        }
        if (votoBe > votoCi && votoBe > votoFu)
            vencedor = "Beltrano";
        else if (votoCi > votoBe && votoCi > votoFu)
            vencedor = "Ciclano";
        else
            vencedor = "Fulano";
        System.out.printf("Fulano recebeu %d votor \nCiclano recebeu %d votos \nBeltrano recebeu %d votos", (votoFu + random), (votoCi + random), (votoBe + random));
        System.out.println("O "+vencedor+" ganhou a eleição");


        teclado.close();
    }
}
