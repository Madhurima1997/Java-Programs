package decorator;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+",Whipped Cream";
    }

    @Override
    public double getCost() {
        return this.beverage.getCost()+0.10;
    }
}
