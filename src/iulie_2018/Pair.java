package iulie_2018;

public class Pair {
    private String model;
    private int nrCars;

    public Pair(String model, int nrCars) {
        this.model = model;
        this.nrCars = nrCars;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrCars() {
        return nrCars;
    }

    public void setNrCars(int nrCars) {
        this.nrCars = nrCars;
    }
}
