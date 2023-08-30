package models;

public class PizzaAdicionada extends PizzaDecorador {
    private String ingredienteExtra;

    public PizzaAdicionada(Pizza pizza, String ingrediente) {
        super(pizza);
        this.ingredienteExtra = ingrediente;
    }

    @Override
    public double informarCalorias() {
        if (ingredienteExtra == "Queijo") {
            return super.informarCalorias() + 92;
        } else if (ingredienteExtra == "Presunto") {
            return super.informarCalorias() + 35;

        } else if (ingredienteExtra == "Cebola") {
            return super.informarCalorias() + 22;
        } else if (ingredienteExtra == "Abacaxi") {
            return super.informarCalorias() + 24;
        } else if (ingredienteExtra == "Salame") {
            return super.informarCalorias() + 26;
        } else {
            return super.informarCalorias() + 0;
        }
    }

    @Override
    public double informarPreco() {
        if (ingredienteExtra == "Queijo") {
            return super.informarPreco() + 0.69;
        }
        return super.informarPreco();
    }

    @Override
    public String retornarIngredientes() {
        if (ingredienteExtra == "Queijo") {
            return super.retornarIngredientes() + ", Queijo";
        }
        return super.retornarIngredientes();
    }

}
