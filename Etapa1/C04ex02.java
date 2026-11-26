package Etapa1;

import java.util.Scanner;

public class C04ex02 {
    public static void main(String[] args) {

        String nome, CPF, identidade, tituloEleitor, carteiraMotorista, nomeEmpresa;
        double salario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        nome = teclado.nextLine();
        System.out.print("Escreva seu CPF: ");
        CPF = teclado.nextLine();
        System.out.print("Escreva sua identidade: ");
        identidade = teclado.nextLine();
        System.out.print("Digite seu titulo de eleitor: ");
        tituloEleitor = teclado.nextLine();
        System.out.print("Digite sua carteira de motorista: ");
        carteiraMotorista = teclado.nextLine();
        System.out.print("Escreva seu salário: ");
        salario = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Digite o nome da sua empresa: ");
        nomeEmpresa = teclado.nextLine();
        System.out.println("FICHA FUNCIONAL DE: " + nome + "\n\nDocumentos:\nCPF ............................................. " + CPF + "\nC.I. ............................................... " + identidade + "\nTitulo de eleitor  ........................... " + tituloEleitor + "\nCarteira de motorista ................... " + carteiraMotorista + "\n\nEmpresa: " + nomeEmpresa + "\nSalário: R$ " + salario);

        teclado.close();
        //Raphael Augusto de Paula Freitas

    }
}
