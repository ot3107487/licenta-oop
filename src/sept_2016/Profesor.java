package sept_2016;

public class Profesor extends Entitate {
    private double salar;

    public Profesor(String oras, double salar) {
        super(oras);
        this.salar = salar;
    }

    @Override
    public double sumaIncasata() {
        return this.salar;
    }
}
