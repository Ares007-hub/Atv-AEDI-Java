package Etapa2;

public class C08ex24 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double somaParcelas = 0;
        for (int i = 1; i <= 99; i += 2) {
            somaParcelas += Math.pow(2, i);
        }
        double serie = (1.0 / 3.0) * somaParcelas;
        System.out.println("Valor da Série = " + serie);
    }
}