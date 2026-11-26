package Etapa3;

//Raphael Augusto de Paula Freitas

public class C15EX01 {
    public static void main(String[] args) {
        // Instanciando pelo menos 3 objetos da classe Veiculo
        Veiculo v1;
        Veiculo v2;
        Veiculo v3;

        v1 = new Veiculo("Fiat", "Argo", 2022, 68500.00, 32000);
        v2 = new Veiculo("Volkswagen", "Polo", 2024, 89900.00, 11500);
        v3 = new Veiculo();

        v3.setMarca("Chevrolet");
        v3.setModelo("Onix");
        v3.setAno(2020);
        v3.setPreco(59000.00);
        v3.setQuilometragem(54000);

        System.out.println("--- VEÍCULO 1 ---");
        v1.imprimeVeiculo();
        System.out.println("Tempo de uso em 2026: " + v1.idadeVeiculo(2026) + " anos\n");

        System.out.println("--- VEÍCULO 2 ---");
        v2.imprimeVeiculo();
        System.out.println("Tempo de uso em 2026: " + v2.idadeVeiculo(2026) + " anos\n");

        System.out.println("--- VEÍCULO 3 ---");
        v3.imprimeVeiculo();
        System.out.println("Tempo de uso em 2026: " + v3.idadeVeiculo(2026) + " anos");
    }
}