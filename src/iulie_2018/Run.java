package iulie_2018;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public void run() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(1000, "Audi"));
        vehicles.add(new AutomaticCar(1000, "Audi", 200));
        vehicles.add(new Car(800, "Toyota"));
        vehicles.add(new AutomaticCar(1200, "Mercedes", 300));
        vehicles.add(new CarWithParkingSensor(1200, "Mercedes", "bip"));
        System.out.println("b");
        this.getPairs(vehicles).forEach(System.out::println);

        System.out.println("c");
        this.arrange(vehicles);

        this.description(vehicles);
    }

    private List<Pair> getPairs(List<Vehicle> vehicles) {
        List<Pair> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            String description = vehicle.description();
            String[] descriptors = description.split(" ");
            String model = descriptors[descriptors.length - 1];
            boolean found = false;
            for (Pair pair : result) {
                if (pair.getModel().equals(model)) {
                    found = true;
                    pair.setNrCars(pair.getNrCars() + 1);
                    break;
                }
            }
            if (!found) {
                result.add(new Pair(model, 1));
            }
        }
        return result;
    }

    private void arrange(List<Vehicle> vehicles) {
        int lastIndex = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            if (v.getPrice() > 1000 && v.getPrice() < 2000) {
                vehicles.remove(i);
                vehicles.add(lastIndex, v);
                lastIndex++;
                i--;
            }
        }
    }

    private void description(List<Vehicle> vehicles) {
        vehicles.forEach(v -> {
            System.out.println(v.description());
        });
    }
}
