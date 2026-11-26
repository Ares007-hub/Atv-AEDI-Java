package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX09 {
    public static void main(String[] args) {
        Scanner teclado;
        String frase;
        String fraseFormatada;
        String[] palavras;
        String primeiraLetra;
        String restante;

        teclado = new Scanner(System.in);
        fraseFormatada = "";

        System.out.print("Informe uma frase curta: ");
        frase = teclado.nextLine().trim();

        palavras = frase.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            if (!palavras[i].isEmpty()) {
                primeiraLetra = palavras[i].substring(0, 1).toUpperCase();
                restante = palavras[i].substring(1).toLowerCase();
                fraseFormatada += primeiraLetra + restante + " ";
            }
        }

        System.out.println(fraseFormatada.trim());
        teclado.close();
    }
}
