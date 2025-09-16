package u;

import c.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaFactoryTest {
    private PizzaFactory factory = new PizzaFactory();

    @Test
    public void testCreateCheesePizza() {
        Pizza pizza = factory.createPizza(PizzaType.Cheese);
        assertNotNull("Created cheese pizza should not be null", pizza);
        assertTrue("Pizza should be an instance of CheesePizza", pizza instanceof CheesePizza);
    }

    @Test
    public void testCreateGreekPizza() {
        Pizza pizza = factory.createPizza(PizzaType.Greek);
        assertNotNull("Created greek pizza should not be null", pizza);
        assertTrue("Pizza should be an instance of GreekPizza", pizza instanceof GreekPizza);
    }

    @Test
    public void testCreatePepperoniPizza() {
        Pizza pizza = factory.createPizza(PizzaType.Pepperoni);
        assertNotNull("Created pepperoni pizza should not be null", pizza);
        assertTrue("Pizza should be an instance of PepperoniPizza", pizza instanceof PepperoniPizza);
    }

    @Test
    public void testCreateGlutenFreePizza() {
        Pizza pizza = factory.createPizza(PizzaType.GlutenFree);
        assertNotNull("Created gluten-free pizza should not be null", pizza);
        assertTrue("Pizza should be an instance of GlutenFreePizza", pizza instanceof GlutenFreePizza);
    }

    @Test
    public void testCreateVeganPizza() {
        Pizza pizza = factory.createPizza(PizzaType.Vegan);
        assertNotNull("Created vegan pizza should not be null", pizza);
        assertTrue("Pizza should be an instance of VeganPizza", pizza instanceof VeganPizza);
    }
}