package sept_2017;

public class PizzaWithIngredients extends Pizza {
    private int ingredientsPrice;

    public PizzaWithIngredients(String description, int basePrice, int ingredientsPrice) {
        super(description, basePrice);
        this.ingredientsPrice = ingredientsPrice;
    }

    @Override
    public String getDescription() {
        return this.getDescription() + "+ ingredients";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + this.ingredientsPrice;
    }
}
