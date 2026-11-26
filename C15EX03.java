package Etapa3;

//Raphael Augusto de Paula Freitas

public class C15EX03 {
    public static void main(String[] args) {
        C15EX02 carro1;
        C15EX02 carro2;
        C15EX02 carro3;

        carro1 = new C15EX02("Toyota", "Corolla", 2023, 138000.00, 25000, 4, "Automático");
        carro2 = new C15EX02("Honda", "Civic", 2021, 118500.00, 41000, 4, "Automático CVT");
        carro3 = new C15EX02("Renault", "Kwid", 2022, 49800.00, 38000, 4, "Manual");

        System.out.println("=== CARRO 1 ===");
        carro1.imprimeVeiculo();

        System.out.println("\n=== CARRO 2 ===");
        carro2.imprimeVeiculo();

        System.out.println("\n=== CARRO 3 ===");
        carro3.imprimeVeiculo();
    }
}
