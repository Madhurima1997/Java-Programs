package decorator;

/**
 * The Concrete Beverage class Espresso
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double getCost() {
        return 1.99;
    }
}
