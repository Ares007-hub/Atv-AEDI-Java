package Etapa3;

//Raphael Augusto de Paula Freitas

import java.util.Scanner;

public class C13EX05 {
    public static void main(String[] args) {
        Scanner teclado;
        double anguloGraus;
        double anguloRad;
        double seno;
        double cosseno;
        double tangente;

        teclado = new Scanner(System.in);

        System.out.print("Informe o ângulo em graus: ");
        anguloGraus = teclado.nextDouble();

        anguloRad = Math.toRadians(anguloGraus);
        seno = Math.sin(anguloRad);
        cosseno = Math.cos(anguloRad);
        tangente = Math.tan(anguloRad);

        System.out.println("Seno = " + seno);
        System.out.println("Cosseno = " + cosseno);
        System.out.println("Tangente = " + tangente);
        System.out.println("Arco seno (cossecante) = " + (1.0 / seno));
        System.out.println("Arco cosseno (secante) = " + (1.0 / cosseno));
        System.out.println("Arco tangente (cotangente) = " + (1.0 / tangente));

        teclado.close();
    }
}
