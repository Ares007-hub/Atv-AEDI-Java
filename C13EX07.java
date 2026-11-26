package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX07 {
    public static void main(String[] args) {
        Scanner teclado;
        String nomeCompleto;
        String ultimoSobrenome;
        String[] partesNome;

        teclado = new Scanner(System.in);

        System.out.print("Informe o nome completo: ");
        nomeCompleto = teclado.nextLine().trim();

        partesNome = nomeCompleto.split(" ");
        ultimoSobrenome = partesNome[partesNome.length - 1];

        System.out.println("Nome de família: " + ultimoSobrenome);
        teclado.close();
    }
}
