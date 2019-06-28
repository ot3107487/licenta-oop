package sept_2016;

public class Student extends Entitate {
    private double bursa;

    public Student(String oras, double bursa) {
        super(oras);
        this.bursa = bursa;
    }

    @Override
    public double sumaIncasata() {
        return this.bursa;
    }
}
