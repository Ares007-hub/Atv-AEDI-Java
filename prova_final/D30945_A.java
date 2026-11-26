package prova_final;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D30945_A {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas

        List<String> listaMenorNomes;
        List<Double> listaMenorNota;
        double menorNum = 0, listaNota[] = new double[1000], nota;
        int contador = 0, quantidade;
        String menorNome = "", listaNomes[] = new String[1000], nome;

        listaMenorNomes = new ArrayList<String>();
        listaMenorNota = new ArrayList<Double>();


        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva a quantidade de vezes que o programa vai rodar: ");
        quantidade = teclado.nextInt();

        for (int aux = 0; aux < quantidade; aux++) {
            teclado.nextLine();
            System.out.print("Escreva o nome do aluno: ");
            listaNomes[aux] = teclado.nextLine();
            System.out.print("Escreva a nota do aluno: ");
            listaNota[aux] = teclado.nextDouble();


            if (listaNota[aux] < listaNota[aux + 1]) {
                nota = listaNota[aux + 1];
                listaNota[aux + 1] = listaNota[aux]  ;
                listaNota[aux] = nota;

                nome = listaNomes[aux];
                listaNomes[aux + 1] = listaNomes[aux];
                listaNomes[aux] = nome;

            }

        }
        for (int aux = 0; aux < quantidade; aux++) {
            if (listaNota[aux] == listaNota[0]) {
                contador++;
                listaMenorNomes.add(listaNomes[aux]);
            }
        }

        System.out.print("A menor nota é: " + listaNota[0] + "\nA quantidade de alunos que tiraram esta menor nota: " + contador + "\nNomes dos alunos que tiraram esta menor nota: ");
        for (int aux = 0; aux < contador; aux++) {
            System.out.print(listaMenorNomes.get(aux)+" ");
        }

        teclado.close();
    }
}
