package sept_2018;

import java.util.*;

import utils.Sortari;

public class Run {
    public void run() throws Exception {
        List<ONG> ongs = new ArrayList<>();
        List<Participant> participants1 = new ArrayList<>();
        participants1.add(new Volunteer("Sorin", "Sutina", 21));
        participants1.add(new Volunteer("Bogdan", "Slatina", 22));
        participants1.add(new Employee("Magda", "Slatina", "HR"));
        participants1.add(new Employee("Magda", "Slatina", "HR"));
        participants1.add(new Employee("Magda", "Slatina", "HR"));
        ONG ong1 = new ONG(participants1);
        List<Participant> participants2 = new ArrayList<>();
        participants2.add(new Volunteer("Paul", "Cluj", 22));
        participants2.add(new Employee("Ionut", "Cluj", "IT"));
        participants2.add(new Employee("Ionut", "Cluj", "IT"));
        participants2.add(new Employee("Ionut", "Cluj", "IT"));
        ONG ong2 = new ONG(participants2);
        ongs.add(ong1);
        ongs.add(ong2);

        Run run = new Run();

        List<Volunteer> b = run.getSortedVolunteer(ong1);

        b.forEach(System.out::println);

        String town = run.theTown(ongs);

        System.out.println(town);

        int d = run.numberOfEmployees(ongs);

        System.out.println(d);
    }

    private List<Volunteer> getSortedVolunteer(ONG ong) {
        List<Participant> participants = ong.getAll(true);
        List<Volunteer> volunteers = new ArrayList<>();
        participants.forEach(p -> {
            volunteers.add((Volunteer) p);
        });
        Sortari<Volunteer> sortari = new Sortari<Volunteer>();
        Comparator<Volunteer> c = (Volunteer v1, Volunteer v2) -> v1.getTown().compareTo(v2.getTown());
        sortari.mergeSort(volunteers, c);
        return volunteers;
    }

    private String theTown(List<ONG> ongs) {
        Map<String, Integer> townFrequency = new HashMap<>();
        for (ONG ong : ongs) {
            List<Participant> participants = ong.getAll(false);
            for (Participant participant : participants) {
                String town = participant.getTown();
                if (!townFrequency.containsKey(town)) {
                    townFrequency.put(town, 1);
                } else {
                    Integer frequency = townFrequency.get(town);
                    townFrequency.put(town, frequency + 1);
                }
            }
        }
        String result = "";
        int highestFrequency = 0;
        for (String town : townFrequency.keySet()) {
            Integer frequency = townFrequency.get(town);
            if (frequency > highestFrequency) {
                result = town;
                highestFrequency = frequency;
            }
        }
        return result;
    }

    private int numberOfEmployees(List<ONG> ongs) {
        int result = 0;
        for (ONG ong : ongs) {
            result += ong.getAll(false).size();
        }
        return result;
    }
}
