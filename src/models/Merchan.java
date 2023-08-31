package src.models;

public class Merchan {
    private String tipo;
    private double preco;

    public Merchan(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Merchan [Tipo = " + tipo + ", Preco=" + preco + "]";
    }
}
