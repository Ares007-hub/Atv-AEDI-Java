package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX08 {
    public static void main(String[] args) {
        Scanner teclado;
        String nomeCompleto;
        String nomeAbnt;
        String[] partesNome;

        teclado = new Scanner(System.in);

        System.out.print("Informe o nome completo do autor: ");
        nomeCompleto = teclado.nextLine().trim();

        partesNome = nomeCompleto.split(" ");
        nomeAbnt = partesNome[partesNome.length - 1].toUpperCase() + ",";

        for (int i = 0; i < partesNome.length - 1; i++) {
            if (!partesNome[i].isEmpty()) {
                nomeAbnt += " " + partesNome[i].toUpperCase().charAt(0) + ".";
            }
        }

        System.out.println(nomeAbnt);
        teclado.close();
    }
}
