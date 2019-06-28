package sept_2018;

public class Volunteer extends Participant {
    private int years;

    public Volunteer(String name, String town, int years) throws Exception {
        super(name, town);
        if (years < 0) {
            throw new Exception("Years invalid");
        }
        this.years = years;
    }

    @Override
    public String toString() {
        return "Volunteer " + this.years + " years" + super.toString();
    }
}
