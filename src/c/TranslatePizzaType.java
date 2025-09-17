package c;
public class TranslatePizzaType {

    public static String fromPizzaTypeEnumToString(PizzaType pizzaType) {
        switch(pizzaType) {
            case Cheese:
                return "Cheese";
            case Greek:
                return "Greek";
            case Pepperoni:
                return "Pepperoni";
            case GlutenFree:
                return "GlutenFree";
            case Vegan:
                return "Vegan";
            default:
                return "Unknown";
        }
    }
}