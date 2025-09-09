public static class TranslatePizzaType {

    public static String fromPizzaTypeEnumToString(PizzaType pizzatype) {
        switch(pizzaType) {
            case PizzaType.Cheese:
                return "Cheese";
                break;

            case PizzaType.Greek:
                return "Greek";
                break;

            case PizzaType.Peperoni:
                return "Peperoni";
                break;

            case PizzaType.GlutenFree:
                return "GlutenFree";
                break;

            case PizzaType.Vegan:
                return "Vegan";
                break;

            default:
                System.err.append(0)
                break;

        }
    }
}