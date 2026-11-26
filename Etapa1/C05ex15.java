package Etapa1;

import java.util.Scanner;
import java.util.Locale;

public class C05ex15 {
    public static void main(String[] args) {
        Locale ptBR = new Locale("pt", "BR");
        Scanner teclado = new Scanner(System.in).useLocale(ptBR);

        System.out.print("Produção = ");
        int producao = teclado.nextInt();

        System.out.print("Perda = ");
        int perda = teclado.nextInt();

        System.out.print("Caixa Papelão = R$");
        double precoPapelao = teclado.nextDouble();

        System.out.print("Madeira = R$");
        double precoMadeira = teclado.nextDouble();

        System.out.print("Frete = R$");
        double precoFrete = teclado.nextDouble();

        int mudasAproveitadas = producao - perda;
        int caixasPapelao = mudasAproveitadas / 7;
        int caixasMadeira = (int) Math.ceil(caixasPapelao / 15.0);
        int viagens = (int) Math.ceil(caixasMadeira / 50.0);

        double custoTotal = (caixasPapelao * precoPapelao) +
                (caixasMadeira * precoMadeira) +
                (viagens * precoFrete);

        System.out.println();
        System.out.printf(ptBR, "Custo = R$%.2f\n", custoTotal);

        teclado.close();
    }
}