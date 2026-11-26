package Etapa1;

import javax.swing.*;
import java.util.Scanner;

public class C04ex05 {
    static void main(String[] args) {
        String nome, CPF, identidade, tituloEleitor, carteiraMotorista, nomeEmpresa;
        double salario;
        Scanner arquivo = new Scanner(
                C04ex05.class.getResourceAsStream("ArquivoC04ex05.txt"));
        nome = arquivo.nextLine();
        CPF = arquivo.nextLine();
        identidade = arquivo.nextLine();
        tituloEleitor = arquivo.nextLine();
        carteiraMotorista = arquivo.nextLine();
        salario = arquivo.nextDouble();
        nomeEmpresa = arquivo.nextLine();
        JOptionPane.showInternalMessageDialog(null,
                "FICHA FUNCIONAL DE: " + nome + "\n\nDocumentos:\nCPF ............................................... " + CPF + "\nC.I. ................................................. " + identidade + "\nTitulo de eleitor  ........................... " + tituloEleitor + "\nCarteira de motorista ................... " + carteiraMotorista + "\n\nEmpresa: " + nomeEmpresa + "\nSalário: R$ " + salario,
                "Atividade java",
                JOptionPane.INFORMATION_MESSAGE);

        arquivo.close();
        //Raphael Augusto de Paula Freitas
    }

}
