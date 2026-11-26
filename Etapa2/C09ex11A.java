package Etapa2;

public class C09ex11A {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = 7 * aux - 6;
            double den = Math.pow(4, aux - 1) + (aux + 1);
            soma += num / den;
        }
        double serie = 3 * soma;
        System.out.println("Valor da Série A = " + serie);
    }
}