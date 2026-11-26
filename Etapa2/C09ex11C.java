package Etapa2;

public class C09ex11C {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = (2 * aux + 1) * (4 * aux + 1);
            double den = Math.pow(5, aux);
            soma += num / den;
        }
        double serie = Math.pow(soma, 2);
        System.out.println("Valor da Série C = " + serie);
    }
}