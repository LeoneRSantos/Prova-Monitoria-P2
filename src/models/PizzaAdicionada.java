package src.models;

public class PizzaAdicionada extends PizzaDecorador {
    private String ingredienteExtra;
    private Boolean pizzaFamilia;

    public PizzaAdicionada(Pizza pizza, String ingrediente, Boolean pizzaFamilia) {
        super(pizza);
        this.ingredienteExtra = ingrediente; 
        this.pizzaFamilia = pizzaFamilia;
    }

    @Override
    public double informarCalorias() {
        if (ingredienteExtra == "Queijo") {
            if (pizzaFamilia) {
                return super.informarCalorias() + (92*1.95);
            }
            return super.informarCalorias() + 92;
        } else if (ingredienteExtra == "Presunto") { 
            if (pizzaFamilia) {
                return super.informarCalorias() + (35*1.95);
            }
            return super.informarCalorias() + 35;

        } else if (ingredienteExtra == "Cebola") {
            if (pizzaFamilia) {
                return super.informarCalorias() + (22 * 1.95);
            }
            return super.informarCalorias() + 22;
        } else if (ingredienteExtra == "Abacaxi") { 
            if (pizzaFamilia) {
                return super.informarCalorias() + (24*1.95);
            }
            return super.informarCalorias() + 24;
        } else if (ingredienteExtra == "Salame") { 
            if (pizzaFamilia) {
                return super.informarCalorias() + (26*1.95);
            }
            return super.informarCalorias() + 26;
        } else {
            return super.informarCalorias() + 0;
        }
    }

    @Override
    public double informarPreco() {
        if (ingredienteExtra == "Queijo") {
            if (pizzaFamilia) {
                return super.informarPreco() + 0.69 + 4.15;
            }
            return super.informarPreco() + 0.69;
        } else if (ingredienteExtra == "Presunto") { 
            if (pizzaFamilia) {
                return super.informarPreco() + 0.99 + 4.15;
            }
            return super.informarPreco() + 0.99;

        } else if (ingredienteExtra == "Cebola") {
            if (pizzaFamilia) {
                return super.informarPreco() + 0.69 + 4.15;
            }
            return super.informarPreco() + 0.69;
        } else if (ingredienteExtra == "Abacaxi") { 
            if (pizzaFamilia) {
                return super.informarPreco() + 0.79 + 4.15;
            }
            return super.informarPreco() + 0.79;
        } else if (ingredienteExtra == "Salame") { 
            if (pizzaFamilia) {
                return super.informarPreco() + 0.99 + 4.15;
            }
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
