import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaFactoryTest {

    private PizzaFactory factory;

    @Before
    public void setUp() {
        factory = new PizzaFactory();
    }

    @Test
    public void testCreateCheesePizza() {
        Pizza pizza = factory.createPizza("cheese");
        assertNotNull(pizza);
        assertTrue("Should be an instance of CheesePizza", pizza instanceof CheesePizza);
    }

    @Test
    public void testCreatePepperoniPizza() {
        Pizza pizza = factory.createPizza("pepperoni");
        assertNotNull(pizza);
        assertTrue("Should be an instance of PepperoniPizza", pizza instanceof PepperoniPizza);
    }

    @Test
    public void testCreateGreekPizza() {
        Pizza pizza = factory.createPizza("greek");
        assertNotNull(pizza);
        assertTrue("Should be an instance of GreekPizza", pizza instanceof GreekPizza);
    }

    @Test
    public void testCreateGlutenFreePizza() {
        Pizza pizza = factory.createPizza("glutenfree");
        assertNotNull(pizza);
        assertTrue("Should be an instance of GlutenFreePizza", pizza instanceof GlutenFreePizza);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalidPizza() {
        // This should throw an exception.
        factory.createPizza("tuna");
    }

    @Test
    public void testCreatePizzaCaseInsensitive() {
        Pizza pizza = factory.createPizza("ChEeSe");
        assertNotNull(pizza);
        assertTrue("Should be an instance of CheesePizza", pizza instanceof CheesePizza);
    }
}
