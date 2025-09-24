public class GlutenFreePizza extends Pizza {
    public GlutenFreePizza() {
        name = "Connecticut Style Gluten-Free Pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Preparing cauliflower crust...");
        System.out.println("Adding sauce and toppings...");
    }

    @Override
    void bake() {
        System.out.println("Baking for 25 minutes at 375 degrees.");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into 6 slices.");
    }

    @Override
    void box() {
        System.out.println("Placing pizza in a special gluten-free box.");
    }
}