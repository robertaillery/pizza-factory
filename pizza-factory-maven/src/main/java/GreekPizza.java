public class GreekPizza extends Pizza {
    public GreekPizza() {
        name = "Connecticut Style Greek Pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Spreading thin crust dough...");
        System.out.println("Adding olive oil, feta cheese, and olives...");
    }

    @Override
    void bake() {
        System.out.println("Baking for 18 minutes at 450 degrees.");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square portions.");
    }

    @Override
    void box() {
        System.out.println("Placing pizza in official PizzaStore box.");
    }
}