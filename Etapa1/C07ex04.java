package Etapa1;

import java.util.Scanner;

public class C07ex04 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        String equipe, estado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome da equipe: ");
        //equalsIgnoreCase trim() tira o espaço no começo e no final da da string
        equipe = scanner.nextLine().trim().toLowerCase();

        estado = switch (equipe) {
            case "américa", "atlético", "cruzeiro", "villa nova" -> "Minas Gerais";
            case "botafogo", "flamengo", "fluminense", "vasco" -> "Rio de Janeiro";
            case "corinthians", "palmeiras", "santos", "são paulo" -> "São Paulo";
            case "grêmio", "internacional", "juventude" -> "Rio Grande do Sul";
            case "náutico", "santa cruz", "sport" -> "Pernambuco";
            default -> "Estado não encontrado ou equipe inválida";
        };

        System.out.println("Estado: " + estado);
        scanner.close();
    }
}