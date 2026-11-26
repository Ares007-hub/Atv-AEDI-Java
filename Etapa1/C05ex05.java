package Etapa1;

import java.util.Scanner;

public class C05ex05 {
    public static void main(String[] args) {
        double celsius, kelvin, fahrenheit;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escreva o valor em Celsius: ");
        celsius = teclado.nextDouble();
        kelvin = celsius + 273;
        fahrenheit = ((9 * celsius) + 160) / 5.0;
        System.out.println("O valor em celsius é : " + celsius + "\nO valor em Kelvin é: " + kelvin + "\nO valor em Fahrenheit é: " + fahrenheit);

        teclado.close();
        //Raphael Augusto de Paula Freitas
    }
}
