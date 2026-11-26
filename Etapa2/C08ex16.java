package Etapa2;


public class C08ex16 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        long soma = 0;
        int cont = 0;
        for (int i = 1000; i <= 2000; i++) {
            if (i % 2 != 0) {
                soma += i;
                cont++;
            }
        }
        System.out.println("Média dos números ímpares: " + (soma / cont));
    }
}
