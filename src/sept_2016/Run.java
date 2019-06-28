package sept_2016;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public void run() {
        List<Entitate> entitati = this.create();
        this.sort(entitati);
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        System.out.println(this.sum(entitati, town));
    }

    private List<Entitate> create() {
        List<Entitate> entitati = new ArrayList<>();
        entitati.add(new Student("Slatina", 600));
        entitati.add(new Student("Cluj", 1000));
        entitati.add(new Profesor("Cluj", 1900));
        entitati.add(new Profesor("Slatina", 1400));
        return entitati;
    }

    private void sort(List<Entitate> list) {
        List<Entitate> profesori = new ArrayList<>();
        List<Entitate> studenti = new ArrayList<>();
        for (Entitate entitate : list) {
            if (entitate instanceof Profesor) {
                int i = 0;
                int sizeProfesori = profesori.size();
                while (i < sizeProfesori && entitate.sumaIncasata() < profesori.get(i).sumaIncasata()) {
                    i++;
                }
                profesori.add(i, entitate);
            } else {
                int i = 0;
                int sizeStundeti = studenti.size();
                while (i < sizeStundeti && entitate.sumaIncasata() > studenti.get(i).sumaIncasata()) {
                    i++;
                }
                studenti.add(i, entitate);
            }
        }
        for (int i = 0; i < profesori.size(); i++) {
            list.remove(i);
            list.add(i, profesori.get(i));
        }
        int startStudenti = profesori.size();
        for (int i = 0; i < studenti.size(); i++) {
            list.remove(i + startStudenti);
            list.add(i + startStudenti, studenti.get(i));
        }
    }

    private double sum(List<Entitate> list, String oras) {
        double suma = 0;
        for (Entitate entitate : list) {
            if (entitate.getOras().equals(oras)) {
                suma += entitate.sumaIncasata();
            }
        }
        return suma;
    }
}
