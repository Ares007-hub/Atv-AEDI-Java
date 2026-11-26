package Etapa2;

public class C11ex14 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double pi = 0;
        int termos = 0;
        double divisor = 1;
        int sinal = 1;

        while ((pi * 4) <= 3.1416 || (pi * 4) >= 3.1417) {
            pi += sinal * (1.0 / divisor);
            divisor += 2;
            sinal *= -1;
            termos++;
        }

        System.out.println("Valor de PI = " + (pi * 4));
        System.out.println("Termos = " + termos);
    }
}
