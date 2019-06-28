package iulie_2017;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public void run() {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Melon(10, true));
        fruits.add(new MelonLike(11, false));
        fruits.add(new Watermelon(13, true));
        fruits.add(new Watermelon(6, false));

        this.insert(new Watermelon(12, false), fruits);

        this.print(true, fruits);
        this.print(false, fruits);

    }

    private int getPozitie(Fruit fruit, List<Fruit> list) {
        int left = 0;
        int right = list.size() - 1;
        int middle = (left + right) / 2;
        while (left < right) {
            String fruitDescription = fruit.getDescription();
            String listDescription = list.get(middle).getDescription();
            int comparison = fruitDescription.compareTo(listDescription);
            if (comparison > 0) {
                left = middle + 1;
                middle = (right + left) / 2;
            }

            if (comparison == 0) {
                return middle;
            }

            if (comparison < 0) {
                right = middle - 1;
                middle = (right + left) / 2;
            }
        }

        return middle;
    }

    private void insert(Fruit fruit, List<Fruit> list) {
        int index = this.getPozitie(fruit, list);
        list.add(index, fruit);
    }

    private void print(boolean withSeeds, List<Fruit> list) {
        for (Fruit fruit : list) {
            if (fruit.isWithSeeds() == withSeeds)
                System.out.println(fruit);
        }
    }
}
