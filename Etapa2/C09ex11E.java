package Etapa2;

public class C09ex11E {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            double num1 = Math.pow(aux, 2);
            double den1 = 4 * aux - 1;
            double num2 = Math.pow(aux + 1, aux);
            double den2 = Math.pow(2, aux);
            serie += (num1 / den1) * (num2 / den2);
        }
        System.out.println("Valor da Série E = " + serie);
    }
}