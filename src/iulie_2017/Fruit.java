package iulie_2017;

public abstract class Fruit {
    private boolean withSeeds;

    public Fruit(boolean withSeeds) {
        this.withSeeds = withSeeds;
    }

    public abstract String getDescription();

    public boolean isWithSeeds() {
        return this.withSeeds;
    }
}
