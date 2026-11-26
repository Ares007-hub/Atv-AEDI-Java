package Etapa2;

public class C09ex12 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double soma = 0;
        for (int aux = 1; aux <= 10000; aux++) {
            double den = 2 * aux - 1;
            if (aux % 2 != 0) {
                soma += 1.0 / den;
            } else {
                soma -= 1.0 / den;
            }
        }
        double pi = 4 * soma;
        System.out.println("Valor de PI = " + pi);
    }
}