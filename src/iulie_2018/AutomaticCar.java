package iulie_2018;

public class AutomaticCar extends Car {
    private int additionalPrice;

    public AutomaticCar(int basePrice, String model, int additionalPrice) {
        super(basePrice, model);
        this.additionalPrice = additionalPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + this.additionalPrice;
    }

    @Override
    public String description() {
        return "Automatic car " + super.description();
    }
}
