package iulie_2017;

public class Watermelon extends MelonLike {
    public Watermelon(double kg, boolean withSeeds) {
        super(kg, withSeeds);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " watermelon";
    }
}
