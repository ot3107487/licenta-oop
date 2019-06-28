package iulie_2016;

public class Student {
    private String nume;
    private String oras;

    public Student(String nume, String oras) {
        this.nume = nume;
        this.oras = oras;
    }

    public String getNume() {
        return nume;
    }

    public String getOras() {
        return oras;
    }

    @Override
    public String toString() {
        return this.nume + " " + this.oras;
    }
}
