package decorator;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}
