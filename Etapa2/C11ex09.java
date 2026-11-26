package Etapa2;

import java.util.Scanner;

public class C11ex09 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        Scanner teclado = new Scanner(System.in);
        int qtdGerencia = 0, qtdAdm = 0, qtdPesquisa = 0, qtdObras = 0;
        int admEm2010 = 0;
        String primeiroNome = "", ultimoNome = "";
        long primeiroAnoOrdem = Long.MAX_VALUE, ultimoAnoOrdem = -1;

        while (true) {
            System.out.print("Nome (FIM para sair): ");
            String nome = teclado.nextLine();

            if (nome.equalsIgnoreCase("FIM")) break;

            System.out.print("Registro Funcional: ");
            String rf = teclado.nextLine();

            boolean invalido = false;

            if (rf.length() != 6) {
                invalido = true;
            } else {
                try {
                    int ano = Integer.parseInt(rf.substring(0, 2));
                    int setor = Integer.parseInt(rf.substring(2, 3));
                    int ordem = Integer.parseInt(rf.substring(3, 6));

                    if (ano < 10 || ano > 14 || setor < 1 || setor > 4) {
                        invalido = true;
                    } else {
                        if (setor == 1) qtdGerencia++;
                        else if (setor == 2) {
                            qtdAdm++;
                            if (ano == 10) admEm2010++;
                        }
                        else if (setor == 3) qtdPesquisa++;
                        else if (setor == 4) qtdObras++;

                        long fatorOrdem = ano * 1000L + ordem;

                        if (fatorOrdem < primeiroAnoOrdem) {
                            primeiroAnoOrdem = fatorOrdem;
                            primeiroNome = nome;
                        }
                        if (fatorOrdem > ultimoAnoOrdem) {
                            ultimoAnoOrdem = fatorOrdem;
                            ultimoNome = nome;
                        }
                    }
                } catch (Exception e) {
                    invalido = true;
                }
            }

            if (invalido) {
                System.out.println("REGISTRO INVÁLIDO");
            }
        }

        System.out.println("Funcionários por setor:");
        System.out.println("Gerência = " + qtdGerencia);
        System.out.println("Administração = " + qtdAdm);
        System.out.println("Pesquisa = " + qtdPesquisa);
        System.out.println("Obras = " + qtdObras);
        System.out.println("Admitidos em 2010 na Adm = " + admEm2010);

        int maxFunc = qtdGerencia;
        String setorMais = "Gerência";
        if (qtdAdm > maxFunc) { maxFunc = qtdAdm; setorMais = "Administração"; }
        if (qtdPesquisa > maxFunc) { maxFunc = qtdPesquisa; setorMais = "Pesquisa"; }
        if (qtdObras > maxFunc) { maxFunc = qtdObras; setorMais = "Obras"; }

        System.out.println("Setor com mais funcionários = " + setorMais);
        System.out.println("Primeiro funcionário admitido = " + primeiroNome);
        System.out.println("Último funcionário admitido = " + ultimoNome);

        teclado.close();
    }
}