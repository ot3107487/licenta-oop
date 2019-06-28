package iulie_2017;

public class Melon extends MelonLike {
    public Melon(double kg, boolean withSeed) {
        super(kg, withSeed);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " melon";
    }
}
