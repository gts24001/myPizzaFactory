package c;
public static class TranslatePizzaType {

    public static String fromPizzaTypeEnumToString(PizzaType pizzatype) {
        switch(pizzaType) {
            case PizzaType.Cheese:
                return "Cheese";
                break;

            case PizzaType.Greek:
                return "Greek";
                break;

            case PizzaType.Pepperoni:
                return "Pepperoni";
                break;

            case PizzaType.GlutenFree:
                return "GlutenFree";
                break;

            case PizzaType.Vegan:
                return "Vegan";
                break;

            default:
                System.err.println("Not a valid pizza type");
                break;

        }
    }
}