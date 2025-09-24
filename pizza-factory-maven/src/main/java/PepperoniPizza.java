public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Connecticut Style Pepperoni Pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding tomato sauce and cheese...");
        System.out.println("Adding pepperoni slices...");
    }

    @Override
    void bake() {
        System.out.println("Baking for 22 minutes at 425 degrees.");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into 8 slices.");
    }

    @Override
    void box() {
        System.out.println("Placing pizza in official PizzaStore box.");
    }
}