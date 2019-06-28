package iulie_2017;

public class MelonLike extends Fruit {
    private double kg;

    public MelonLike(double kg, boolean withSeed) {
        super(withSeed);
        this.kg = kg;
    }

    @Override
    public String getDescription() {
        return this.kg + " " + "melon like" + " " + (super.isWithSeeds() ? "with seeds" : "without seeds");
    }
}
