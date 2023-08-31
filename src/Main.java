package src;

import src.models.Pizza;
import src.models.PizzaAdicionada;
import src.models.PizzaPadrao;

public class Main {
    public static void imprimirInformacoes(Pizza pizza) {
        System.out.print("\n\nPizza: " + pizza.informarNome() + ", ingredientes: [" + pizza.retornarIngredientes()
                + "], calorias: " + pizza.informarCalorias() + ", preço: " + pizza.informarPreco() + "\n");

    }

    public static void main(String[] args) { 
        Pizza p = new PizzaPadrao("Marguerita", 1104, 10.00, "tomate, queijo"); 
        imprimirInformacoes(p);

        p = new PizzaAdicionada(p, "Salame"); 
        imprimirInformacoes(p);

        Bebida b = new Bebida(300, "Limonada", 138, 4.0);

        System.out.println(b.toString());

    }
}
