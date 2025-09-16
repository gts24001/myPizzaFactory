package c;
public class PizzaFactory {

    public Pizza PizzaOrder(PizzaType type) {
        switch(type) {
            case Cheese:
                return new CheesePizza();

            case Greek:
                return new GreekPizza();

            case Pepperoni:
                return new PepperoniPizza();

            case GlutenFree:
                return new GlutenFreePizza();

            case Vegan:
                return new VeganPizza();

            default:
                System.err.println("Not a valid pizza type");
                return null;
        }
    }
}