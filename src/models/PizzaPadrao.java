package src.models;

public class PizzaPadrao implements Pizza {

    private String nome;
    private double calorias;
    private double preco;
    private String ingredientes;

    public PizzaPadrao(String nome, double calorias, double preco, String ingredientes) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    @Override
    public String informarNome() {
        return this.nome;
    }

    @Override
    public double informarCalorias() {

        return this.calorias;
    }

    @Override
    public double informarPreco() {

        return this.preco;
    }

    @Override
    public String retornarIngredientes() {
        return this.ingredientes;
    }

}
