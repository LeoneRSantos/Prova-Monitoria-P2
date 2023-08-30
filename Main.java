import models.Pizza;
import models.PizzaAdicionada;
import models.PizzaPadrao;

public class Main {
    public static void imprimirInformacoes(Pizza pizza) {
        System.out.print("\n\nPizza: " + pizza.informarNome() + ", ingredientes: " + pizza.retornarIngredientes()
                + ", calorias: " + pizza.informarCalorias() + ", preço: " + pizza.informarPreco() + "\n");

    }

    public static void main(String[] args) { 
        Pizza p = new PizzaPadrao("Marguerita", 0, 0, "tomate, queijo"); 
        imprimirInformacoes(p);

        p = new PizzaAdicionada(p, "Queijo"); 
        imprimirInformacoes(p);

    }
}
