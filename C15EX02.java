package Etapa3;

//Raphael Augusto de Paula Freitas

public class C15EX02 extends Veiculo {
    // Novos atributos encapsulados
    private int quantidadePortas;
    private String tipoCambio;

    // Construtor padrão
    public C15EX02() {
        super();
    }

    // Método 1: Construtor com parâmetros (incluindo atributos da superclasse)
    public C15EX02(String marca, String modelo, int ano, double preco, int quilometragem, int quantidadePortas, String tipoCambio) {
        super(marca, modelo, ano, preco, quilometragem);
        this.quantidadePortas = quantidadePortas;
        this.tipoCambio = tipoCambio;
    }

    // Getters e Setters dos novos atributos
    public int getQuantidadePortas() {
        return this.quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getTipoCambio() {
        return this.tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    // Método 2 (Polimorfismo / Sobrescrita): Imprime todos os dados do carro
    @Override
    public void imprimeVeiculo() {
        super.imprimeVeiculo();
        System.out.println("Portas: " + this.quantidadePortas);
        System.out.println("Câmbio: " + this.tipoCambio);
    }
}
