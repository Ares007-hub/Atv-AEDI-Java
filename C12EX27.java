package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
    public static void main(String[] args) {
        Scanner teclado;
        List<String> listaCpfs;
        List<String> listaEnderecos;
        String cpf;
        String endereco;
        String cpfBusca;
        int pos;
        String resp;

        teclado = new Scanner(System.in);
        listaCpfs = new ArrayList<String>();
        listaEnderecos = new ArrayList<String>();

        do {
            System.out.print("Digite o CPF (0 para encerrar): ");
            cpf = teclado.nextLine();
            if (!cpf.equals("0")) {
                listaCpfs.add(cpf);
                System.out.print("Digite o endereço: ");
                endereco = teclado.nextLine();
                listaEnderecos.add(endereco);
            }
        } while (!cpf.equals("0"));

        System.out.print("\nInforme um CPF para pesquisar: ");
        cpfBusca = teclado.nextLine();
        pos = listaCpfs.indexOf(cpfBusca);

        if (pos == -1) {
            System.out.println("CPF não encontrado!");
            System.out.print("Deseja incluí-lo na lista (S/N)? ");
            resp = teclado.nextLine();
            if (resp.equalsIgnoreCase("S")) {
                System.out.print("Informe o novo endereço: ");
                endereco = teclado.nextLine();
                listaCpfs.add(cpfBusca);
                listaEnderecos.add(endereco);
            }
        } else {
            System.out.println("CPF encontrado!");
            System.out.print("Deseja alterar o endereço ou excluir o registro (A/E)? ");
            resp = teclado.nextLine();
            if (resp.equalsIgnoreCase("A")) {
                System.out.print("Informe o novo endereço: ");
                endereco = teclado.nextLine();
                listaEnderecos.set(pos, endereco);
            } else if (resp.equalsIgnoreCase("E")) {
                listaCpfs.remove(pos);
                listaEnderecos.remove(pos);
            }
        }

        System.out.println("\nLista de CPFs e Endereços:");
        for (int i = 0; i < listaCpfs.size(); i++) {
            System.out.println(listaCpfs.get(i) + " - " + listaEnderecos.get(i));
        }

        teclado.close();
    }
}
