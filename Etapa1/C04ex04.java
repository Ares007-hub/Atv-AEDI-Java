package Etapa1;


import javax.swing.*;
import java.util.Scanner;

public class C04ex04 {
    public static void main(String[] args) {
        String primeiroNome, segundoNome, sobreNome, idade;


        Scanner teclado = new Scanner(System.in);

        primeiroNome = JOptionPane.showInputDialog(null,
                "Digite seu primeiro nome: ",
                "Aula Java",
                JOptionPane.QUESTION_MESSAGE);
        segundoNome = JOptionPane.showInputDialog(null,
                "Digite seu segundo nome: ",
                "Aula Java",
                JOptionPane.QUESTION_MESSAGE);
        sobreNome = JOptionPane.showInputDialog(null,
                "Escreva seu sobrenome",
                "Aula java",
                JOptionPane.QUESTION_MESSAGE);
        idade = JOptionPane.showInputDialog(null,
                "Escreva sua idade",
                "Aula java",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                sobreNome + ", " + primeiroNome + " " + segundoNome + "\nIdade: " + idade + " anos.",
                "Aula java",
                JOptionPane.INFORMATION_MESSAGE);

        teclado.close();
        //Raphael Augusto de Paula Freitas


    }
}
