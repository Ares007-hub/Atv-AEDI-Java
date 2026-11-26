package Etapa2;

public class C08ex19 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        long soma = 0;
        for (int i = 1; i <= 100; i++) {
            long termo = (long) Math.pow(i, 2);
            System.out.println(termo);
            soma += termo;
        }
        System.out.println("Soma dos 100 primeiros termos: " + soma);
    }
}