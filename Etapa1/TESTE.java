package Etapa1;

import javax.swing.*;
//Não precisa de Scaner com JOptionPane


public class TESTE {
    public static void main(String[] args) {
        String teste;
        //Lê
        teste = JOptionPane.showInputDialog(null,
                "Digite um numero:",
                "teste",
                JOptionPane.QUESTION_MESSAGE
        );

        //Transforma string para int
        int i = Integer.parseInt(teste);

        //Escreve
        JOptionPane.showMessageDialog(null,
                "Resultado: " + i,
                "teste",
                JOptionPane.INFORMATION_MESSAGE
        );
        char letra = '1';
        int j = Integer.valueOf(letra);
        System.out.println(letra);

    }
}

