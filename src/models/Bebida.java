package src.models;

public class Bebida {
    private double ml;
    private String nome;
    private double calorias;
    private double preco;

    public Bebida(double ml, String nome, double calorias, double preco) {
        this.ml = ml;
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Bebida [ml=" + ml + ", nome=" + nome + ", calorias=" + calorias + ", preco=" + preco + "]";
    }

    

}
