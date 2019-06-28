package iulie_2018;

public class Car extends Vehicle {
    private String model;

    public Car(int basePrice, String model) {
        super(basePrice);
        this.model = model;
    }

    @Override
    public String description() {
        return this.model;
    }
}
