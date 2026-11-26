package Etapa1;

import java.util.Scanner;

public class C05ex09 {
    public void main(String[] args) {

        double nota1, nota2, nota3, media;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva a primeira nota do aluno: ");
        nota1 = teclado.nextDouble();
        System.out.print("Escreva a segunda nota do aluno: ");
        nota2 = teclado.nextDouble();
        System.out.print("Escreva a terceira nota do aluno: ");
        nota3 = teclado.nextDouble();
        media = ((nota1 * 2 + nota2 * 3 + nota3 * 5) / 10.0);
        System.out.print(media);
        teclado.close();

    }
}
