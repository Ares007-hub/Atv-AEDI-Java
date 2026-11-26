package Etapa3;

public class C13ex02p1 {
    public static double calcularFx(double x) {
        double numerador, denominador;

        numerador = (5 * x) + 3;

        if (x < 4) {
            denominador = Math.sqrt(16 - Math.pow(x, 2));
            return numerador / denominador;
        } else if (x == 4) {
            return 0;
        } else {
            denominador = Math.sqrt(Math.pow(x, 2) - 16);
            return numerador / denominador;
        }
    }
}
