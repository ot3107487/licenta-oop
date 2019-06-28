package sept_2017;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public void run() {
        List<Pizza> l1 = new ArrayList<>();
        l1.add(new Pizza("Canibale", 22));
        l1.add(new Pizza("Carnivora", 21));
        l1.add(new PizzaWithIngredients("Carnivora", 21, 3));

        List<Pizza> l2 = new ArrayList<>();
        l2.add(new PizzaWithIngredients("Prosciuto", 22, 3));
        l2.add(new PizzaWithIngredients("Hawai", 19, 1));
        l2.add(new Pizza("Vegana", 16));

        this.sort(l1);
        this.sort(l2);

        List<Pizza> all = this.interclasare(l1, l2);

        this.print(all);

    }

    private List<Pizza> interclasare(List<Pizza> list1, List<Pizza> list2) {
        List<Pizza> result = new ArrayList<>();

        int indexL1 = 0;
        int indexL2 = 0;
        while (indexL1 < list1.size() && indexL2 < list2.size()) {
            if (list1.get(indexL1).getPrice() > list2.get(indexL2).getPrice()) {
                result.add(list1.get(indexL1));
                indexL1++;
            } else {
                result.add(list2.get(indexL2));
                indexL2++;
            }
        }
        while (indexL1 < list1.size()) {
            result.add(list1.get(indexL1));
            indexL1++;
        }
        while (indexL2 < list2.size()) {
            result.add(list2.get(indexL2));
            indexL2++;
        }
        return result;
    }

    private void sort(List<Pizza> list) {
        int i;
        for (i = 1; i < list.size(); i++) {
            Pizza pizza = list.get(i);
            int j = 0;
            while (j < i - 1 && pizza.getPrice() < list.get(j).getPrice()) {
                j++;
            }
            if (j != i - 1) {
                list.remove(i);
                list.add(j, pizza);
            }
        }
    }

    private void print(List<Pizza> list) {
        int suma = 0;
        for (Pizza pizza : list) {
            System.out.println(pizza);
            suma += pizza.getPrice();
        }
        System.out.println(suma);
        ;
    }


}
