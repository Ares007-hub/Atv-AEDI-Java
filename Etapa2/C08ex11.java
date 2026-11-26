package Etapa2;

import javax.swing.JOptionPane;

public class C08ex11 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        String nome, nomeMaiorGeral = "";
        char sexo, estadoCivil, corOlhos, corCabelo;
        byte idade, escolaridade;
        double salario, maiorSalarioGeral = 0, maiorSalHomem = 0, menorSalHomem = 9999999.0, diferencaHomens;;
        int contagemMulheres = 0;

        for (byte aux = 1; aux <= 50; aux++) {

            nome = JOptionPane.showInputDialog("Pessoa " + aux + "\nEscreva o nome:");
            idade = Byte.parseByte(JOptionPane.showInputDialog("Idade:"));

            sexo = JOptionPane.showInputDialog("Sexo (M/F):").toUpperCase().charAt(0);
            estadoCivil = JOptionPane.showInputDialog("Estado Civil (C/S/O):").toUpperCase().charAt(0);
            corOlhos = JOptionPane.showInputDialog("Cor dos Olhos (A/C/P/O):").toUpperCase().charAt(0);
            corCabelo = JOptionPane.showInputDialog("Cor dos Cabelos (L/P/C/R):").toUpperCase().charAt(0);

            salario = Double.parseDouble(JOptionPane.showInputDialog("Salário (R$):"));
            escolaridade = Byte.parseByte(JOptionPane.showInputDialog("Escolaridade (1 a 4):"));

            if (sexo == 'F' && corCabelo == 'L' && corOlhos == 'A' && idade >= 18 && idade <= 25 && estadoCivil == 'S' && salario > 10000 && escolaridade == 4) {
                contagemMulheres++;
            }
            if (salario > maiorSalarioGeral) {
                maiorSalarioGeral = salario;
                nomeMaiorGeral = nome;
            }
            if (sexo == 'M') {
                if (salario > maiorSalHomem) {
                    maiorSalHomem = salario;
                }
                if (salario < menorSalHomem) {
                    menorSalHomem = salario;
                }
            }
        }

        diferencaHomens = maiorSalHomem - menorSalHomem;
        if (maiorSalHomem == 0) {
            diferencaHomens = 0;
        }

        String resultado = "Mulheres (Loiras, olho azul, 18-25, solteira, salário mais de 10k, com curso superior): " + contagemMulheres + "\n"
                + "Maior salário geral: " + nomeMaiorGeral + " (R$ " + maiorSalarioGeral + ")\n"
                + "Diferença entre maior e menor salário dos homens: R$ " + diferencaHomens;

        JOptionPane.showMessageDialog(null, resultado);
    }
}