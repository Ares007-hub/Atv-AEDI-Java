package Etapa2;

public class C09ex11F {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = (2 * aux - 1) * Math.pow(2, aux + 1);
            double den = Math.pow(5 * aux - 3, 2);
            soma += num / den;
        }
        double serie = 5 * soma;
        System.out.println("Valor da Série F = " + serie);
    }
}