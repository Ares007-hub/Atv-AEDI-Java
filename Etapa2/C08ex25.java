package Etapa2;

public class C08ex25 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        for (int aux3 = 1; aux3 <= 10; aux3++) {
            for (int aux2 = 1; aux2 <= 5; aux2++) {
                for (int aux = 1; aux <= aux2; aux++)
                    System.out.print("* ");
                System.out.println();
            }
            for (int aux2 = 5; aux2 >= 1; aux2--) {
                for (int aux = 1; aux <= aux2; aux++)
                    System.out.print("* ");
                System.out.println();
            }
        }
    }
}