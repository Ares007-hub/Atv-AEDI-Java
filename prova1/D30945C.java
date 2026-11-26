package prova1;

import javax.swing.*;
import java.util.Scanner;

public class D30945C {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        String codigoCurso, copias, bolsa;
        int mensalidade, codigoCursoInt, copiasDouble;
        double total, bolsaPorcento;

        Scanner teclado = new Scanner(System.in);

        codigoCurso = JOptionPane.showInputDialog(null,
                "Digite o numero do seu curso:",
                "Escola",
                JOptionPane.QUESTION_MESSAGE
        );
        copias = JOptionPane.showInputDialog(null,
                "Digite quantas copias xerox:",
                "Escola",
                JOptionPane.QUESTION_MESSAGE
        );
        bolsa = JOptionPane.showInputDialog(null,
                "Digite se tem bolsa ou não:",
                "Escola",
                JOptionPane.QUESTION_MESSAGE
        );
        codigoCursoInt = Integer.parseInt(codigoCurso);
        copiasDouble = Integer.parseInt(copias);

        if (bolsa.trim().equalsIgnoreCase("sim")) {
            if (codigoCursoInt == 1) {
                mensalidade = 1200;
                bolsaPorcento = 0.05;
                total = mensalidade + (copiasDouble * 0.08) - (bolsaPorcento * mensalidade);
                JOptionPane.showMessageDialog(null,
                        "O valor total é: " + total,
                        "Escola",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (codigoCursoInt == 2) {
                mensalidade = 1350;
                bolsaPorcento = 0.10;
                total = mensalidade + (copiasDouble * 0.08) - (bolsaPorcento * mensalidade);
                JOptionPane.showMessageDialog(null,
                        "O valor total é: " + total,
                        "Escola",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (codigoCursoInt == 3) {
                mensalidade = 2100;
                bolsaPorcento = 0.15;
                total = mensalidade + (copiasDouble * 0.08) - (bolsaPorcento * mensalidade);
                JOptionPane.showMessageDialog(null,
                        "O valor total é: " + total,
                        "Escola",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        } else if (bolsa.trim().equalsIgnoreCase("não")) {
            if (codigoCursoInt == 1) {
                mensalidade = 1200;
                total = mensalidade + (copiasDouble * 0.08);
                JOptionPane.showMessageDialog(null,
                        "O valor total é: " + total,
                        "Escola",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (codigoCursoInt == 2) {
                mensalidade = 1350;
                total = mensalidade + (copiasDouble * 0.08);
                JOptionPane.showMessageDialog(null,
                        "O valor total é: " + total,
                        "Escola",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (codigoCursoInt == 3) {
                mensalidade = 2100;
                total = mensalidade + (copiasDouble * 0.08);
                JOptionPane.showMessageDialog(null,
                        "O valor total é: " + total,
                        "Escola",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Não tem essa opção",
                    "Escola",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }


        teclado.close();
    }
}
