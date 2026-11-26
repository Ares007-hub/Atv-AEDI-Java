package Etapa2;

public class C09ex11B {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double soma = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = 3 * aux - 2;
            double den = 3 * aux + 4;
            soma += num / den;
        }
        double serie = 5 * Math.cbrt(soma);
        System.out.println("Valor da Série B = " + serie);
    }
}