package decorator;

public class Milk extends CondimentDecorator{

    public Milk (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+ ", Steamed Milk";
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.10;
    }
}
