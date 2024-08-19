package decorator;

public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double getCost() {
        return 1.05;
    }
}
