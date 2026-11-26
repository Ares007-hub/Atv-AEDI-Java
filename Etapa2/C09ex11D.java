package Etapa2;

public class C09ex11D {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num = Math.pow(aux, 3);
            double den = Math.pow(10, aux - 1);
            serie += num / den;
        }
        System.out.println("Valor da Série D = " + serie);
    }
}