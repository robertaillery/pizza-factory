public abstract class Pizza {
    String name;

    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();

    public String getName() {
        return name;
    }
}
