package Etapa3;

//Raphael Augusto de Paula Freitas

public class C14EX02_Areas {
    public static double areaQuadrado() {
        System.out.print("Informe o valor do lado do quadrado: ");
        double lado;
        lado = C14EX02.teclado.nextDouble();
        return Math.pow(lado, 2);
    }

    public static double areaRetangulo() {
        System.out.print("Informe o valor da base do retângulo: ");
        double base, altura;
        base = C14EX02.teclado.nextDouble();
        System.out.print("Informe o valor da altura do retângulo: ");
        altura = C14EX02.teclado.nextDouble();
        return base * altura;
    }

    public static double areaTrianguloRetangulo() {
        System.out.print("Informe o valor da base do triângulo retângulo: ");
        double base, altura;
        base = C14EX02.teclado.nextDouble();
        System.out.print("Informe o valor da altura do triângulo retângulo: ");
        altura = C14EX02.teclado.nextDouble();
        return (base * altura) / 2.0;
    }

    public static double areaCirculo() {
        System.out.print("Informe o valor do raio do círculo: ");
        double raio;
        raio = C14EX02.teclado.nextDouble();
        return Math.PI * Math.pow(raio, 2);
    }
}

