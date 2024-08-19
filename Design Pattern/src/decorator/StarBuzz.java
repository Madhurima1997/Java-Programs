package decorator;

public class StarBuzz {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() +" : $"+beverage.getCost());

        Beverage myDrink = new DarkRoast();
        myDrink = new Mocha(myDrink);
        myDrink = new Mocha(myDrink);
        myDrink = new Whip(myDrink);
        System.out.println(myDrink.getDescription() +" : $"+myDrink.getCost());

        Beverage barista = new HouseBlend();
        barista = new Soy(barista);
        barista = new Mocha(barista);
        barista = new Mocha(barista);
        barista = new Whip(barista);
        System.out.println(barista.getDescription() +" : $"+barista.getCost());
    }
}
