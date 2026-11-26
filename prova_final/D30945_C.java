package prova_final;

import Etapa3.C14EX02_Areas;

import java.util.Scanner;

public class D30945_C {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        String frases ;

        System.out.print("Escreva a frase: ");
        frases = teclado.nextLine();
        frases = D30945_C_class.frase();


        teclado.close();
    }
}
