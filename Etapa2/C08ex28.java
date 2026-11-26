package Etapa2;

public class C08ex28 {
    public static void main() {
        //Raphael Augusto de Paula Freitas
        int numero = 0, dividir = 0, numero2 = 0;
        double media;

        for (int aux = 6; aux <= 1000; aux++) {
            numero2 = aux % 6;
            if (numero2 == 0) {
                System.out.print(aux + " ");
                numero += aux;
                dividir++;
            }
        }
        media = numero / dividir;
        System.out.println("Médía " + media);
    }
}
