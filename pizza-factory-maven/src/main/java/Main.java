public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        System.out.println("Ordering a Cheese Pizza:");
        store.orderPizza("cheese");
        System.out.println("\n--------------------------\n");

        System.out.println("Ordering a Pepperoni Pizza:");
        store.orderPizza("pepperoni");
        System.out.println("\n--------------------------\n");
    }
}
