package models;

public abstract class PizzaDecorador implements Pizza {

    private final Pizza pizzaDecorada;

    public PizzaDecorador(Pizza pizza) {
        this.pizzaDecorada = pizza;
    }

    @Override
    public String informarNome() {
        return pizzaDecorada.informarNome();
    }

    @Override
    public double informarCalorias() {
        return pizzaDecorada.informarCalorias();
    }

    @Override
    public double informarPreco() {
        return pizzaDecorada.informarPreco();
    }

    @Override
    public String retornarIngredientes() {
        return pizzaDecorada.retornarIngredientes();
    }

    public Pizza getPizza() {
        return pizzaDecorada;
    }

}
