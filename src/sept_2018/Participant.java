package sept_2018;

public class Participant {
    private String name;
    private String town;

    public Participant(String name, String town) throws Exception {
        if (name == null || "".equals(name)) {
            throw new Exception("Invalid name");
        }
        if (town == null || "".equals(town)) {
            throw new Exception("Invalid town");
        }
        this.name = name;
        this.town = town;
    }

    public String getTown() {
        return this.town;
    }

    @Override
    public String toString() {
        return this.name + this.town;
    }
}
