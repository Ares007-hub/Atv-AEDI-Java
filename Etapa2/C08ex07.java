package Etapa2;

import java.util.Scanner;

public class C08ex07 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        int idade, ateDoze = 0, maiorTrinta = 0, aux;
        double media = 0;
        String nome;

        Scanner teclado = new Scanner(System.in);

        for (aux = 1; aux <= 50; aux++) {
            System.out.print("Escreva o nome da pessoa: ");
            nome = teclado.nextLine();
            System.out.print("Escreva a idade da pessoa: ");
            idade = teclado.nextInt();

            if (idade <= 12) ateDoze++;
            if (idade > 30) maiorTrinta++;
            media += idade;

            teclado.nextLine();
        }
        media = (float) media / (aux - 1);
        System.out.printf("Alunos que tem até 12 anos: %d \nAlunos que tem acima de 30: %d \nMédia das idades informadas: %1.1f ", ateDoze, maiorTrinta, media);

        teclado.close();
    }
}
