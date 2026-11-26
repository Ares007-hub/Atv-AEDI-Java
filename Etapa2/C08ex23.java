package Etapa2;

public class C08ex23 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        long soma = 0;
        int cont = 0;

        for (int i = 1000; i <= 9999; i++) {
            int d1 = i / 1000;
            int d2 = (i / 100) % 10;
            int d3 = (i / 10) % 10;
            int d4 = i % 10;

            if (d1 == d4 && d2 == d3) {
                System.out.println(i);
                soma += i;
                cont++;
            }
        }
        System.out.println("Média = " + (soma / cont));
    }
}