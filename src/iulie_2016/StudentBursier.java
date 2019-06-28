package iulie_2016;

public class StudentBursier extends Student {
    private int bursa;

    public StudentBursier(String nume, String oras, int bursa) {
        super(nume, oras);
        this.bursa = bursa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.bursa;
    }
}
