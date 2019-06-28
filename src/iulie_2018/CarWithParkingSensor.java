package iulie_2018;

public class CarWithParkingSensor extends Car {
    private String sensorType;

    public CarWithParkingSensor(int basePrice, String model, String sensorType) {
        super(basePrice, model);
        this.sensorType = sensorType;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2500;
    }

    @Override
    public String description() {
        return "Car with parking sensor " + this.sensorType + " " + super.description();
    }
}
