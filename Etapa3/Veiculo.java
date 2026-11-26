package Etapa3;

//Raphael Augusto de Paula Freitas

public class Veiculo {
    // Atributos privados (encapsulamento)
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private int quilometragem;

    // Construtor padrão
    public Veiculo() {
    }

    // Método 1: Construtor com parâmetros
    public Veiculo(String marca, String modelo, int ano, double preco, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.quilometragem = quilometragem;
    }

    // Métodos Getters e Setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    // Método 2: Imprime os dados do veículo
    public void imprimeVeiculo() {
        System.out.println("Marca/Modelo: " + this.marca + " " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.println("Quilometragem: " + this.quilometragem + " km");
    }

    // Método 3: Calcula o tempo de uso do veículo
    public int idadeVeiculo(int anoAtual) {
        return anoAtual - this.ano;
    }
}
