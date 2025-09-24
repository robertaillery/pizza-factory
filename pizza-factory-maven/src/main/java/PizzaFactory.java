public class PizzaFactory {
    public Pizza createPizza(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equalsIgnoreCase("greek")) {
            return new GreekPizza();
        } else if (type.equalsIgnoreCase("glutenfree")) {
            return new GlutenFreePizza();
        }
        throw new IllegalArgumentException("Unknown pizza type: " + type);
    }
}
