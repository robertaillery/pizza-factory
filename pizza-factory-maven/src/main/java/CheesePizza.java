public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Connecticut Style Cheese Pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding tomato sauce...");
        System.out.println("Adding mozzarella cheese...");
    }

    @Override
    void bake() {
        System.out.println("Baking for 20 minutes at 400 degrees.");
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