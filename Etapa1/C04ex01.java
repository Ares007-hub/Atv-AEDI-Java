package Etapa1;


import java.util.Scanner;

public class C04ex01 {
    public static void main(String[] args) {
        String primeiroNome, segundoNome, sobreNome;
        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva seu primeiro nome: ");
        primeiroNome = teclado.nextLine();
        System.out.print("Escreva seu segundo nome: ");
        segundoNome = teclado.nextLine();
        System.out.print("Escreva seu sobre nome: ");
        sobreNome = teclado.nextLine();
        System.out.print("Escreva sua idade: ");
        idade = teclado.nextInt();
        System.out.println(sobreNome + ", " + primeiroNome + " " + segundoNome + "\nIdade: " + idade + " anos.");

        teclado.close();
        //Raphael Augusto de Paula Freitas

    }
}
