package decorator;

/**
 * The Component Class
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
