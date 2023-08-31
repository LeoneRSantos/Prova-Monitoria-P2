package src.models;

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
            return super.informarPreco() + 92;
        } else if (ingredienteExtra == "Presunto") {
            return super.informarPreco() + 0.99;

        } else if (ingredienteExtra == "Cebola") {
            return super.informarPreco() + 0.69;
        } else if (ingredienteExtra == "Abacaxi") {
            return super.informarPreco() + 0.79;
        } else if (ingredienteExtra == "Salame") {
            return super.informarPreco() + 0.99;
        } else {
            return super.informarPreco() + 0;
        }
    }

    @Override
    public String retornarIngredientes() {
        if (ingredienteExtra == "Queijo") {
            return super.retornarIngredientes() + ", " + ingredienteExtra;
        } else if (ingredienteExtra == "Presunto") {
            return super.retornarIngredientes() + ", " + ingredienteExtra;

        } else if (ingredienteExtra == "Cebola") {
            return super.retornarIngredientes() + ", " + ingredienteExtra;
        } else if (ingredienteExtra == "Abacaxi") {
            return super.retornarIngredientes() + ", " + ingredienteExtra;
        } else if (ingredienteExtra == "Salame") {
            return super.retornarIngredientes() + ", " + ingredienteExtra;
        } else {
            return super.retornarIngredientes() + ", " + ingredienteExtra;
        }
    }

}
