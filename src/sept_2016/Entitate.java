package sept_2016;

public abstract class Entitate {
    private String oras;

    public Entitate(String oras) {
        this.oras = oras;
    }

    public String getOras() {
        return this.oras;
    }

    public abstract double sumaIncasata();

    @Override
    public String toString() {
        return this.oras + this.sumaIncasata();
    }
}
