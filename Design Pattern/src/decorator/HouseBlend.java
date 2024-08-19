package decorator;

/**
 * Another Concrete Component House Blend
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}
