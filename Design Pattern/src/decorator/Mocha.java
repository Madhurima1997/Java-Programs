package decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",Mocha";
    }

    @Override
    public double getCost() {
        return this.beverage.getCost()+0.20;
    }
}
