package iulie_2018;

public abstract class Vehicle {
    private int basePrice;

    public Vehicle(int basePrice) {
        this.basePrice = basePrice;
    }

    public abstract String description();

    public int getPrice() {
        return this.basePrice;
    }
}
