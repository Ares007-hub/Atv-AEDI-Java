package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX06 {
    public static void main(String[] args) {
        Scanner teclado;
        String familia;
        String nomeCompleto;
        String ultimoSobrenome;
        String[] partesNome;
        int contFamilia;

        teclado = new Scanner(System.in);
        contFamilia = 0;

        System.out.print("Informe o nome da família: ");
        familia = teclado.nextLine().trim();

        for (int i = 1; i <= 100; i++) {
            System.out.print("Informe o " + i + "º nome completo: ");
            nomeCompleto = teclado.nextLine().trim();
            partesNome = nomeCompleto.split(" ");
            ultimoSobrenome = partesNome[partesNome.length - 1];

            if (ultimoSobrenome.equalsIgnoreCase(familia)) {
                contFamilia++;
            }
        }

        System.out.println("Quantidade de pessoas pertencentes à família " + familia + ": " + contFamilia);
        teclado.close();
    }
}
