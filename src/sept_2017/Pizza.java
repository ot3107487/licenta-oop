package sept_2017;

public class Pizza {
    private String description;
    private int basePrice;

    public Pizza(String description, int basePrice) {
        this.description = description;
        this.basePrice = basePrice;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPrice() {
        return this.basePrice;
    }
}
