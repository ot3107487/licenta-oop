package iulie_2016;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Run {
    public void run() {
        List<Student> studenti = new ArrayList<>();
        this.insert(new Student("Marcu", "Arad"), studenti);
        this.insert(new StudentBursier("Marcus", "Arad", 500), studenti);
        this.insert(new StudentBursier("Marcus", "Oradea", 500), studenti);
        this.insert(new StudentBursier("Marcel", "Oradea", 700), studenti);

        this.print(studenti);

        this.bursieri(studenti);
    }

    private void insert(Student student, List<Student> students) {
        int i = 0;
        while (i < students.size() && (student.getNume().compareTo(students.get(i).getNume()) > 0)) {
            i++;
        }
        students.add(i, student);
    }

    private void print(List<Student> students) {
        students.forEach(System.out::println);
    }

    private void bursieri(List<Student> students) {
        Map<String, List<Student>> data = new HashMap<>();
        for (Student student : students) {
            data.putIfAbsent(student.getOras(), new ArrayList<>());
        }

        for (Student student : students) {
            if (student instanceof StudentBursier) {
                this.insert(student, data.get(student.getOras()));
            }
        }
        for (String oras : data.keySet()) {
            System.out.println(oras);
            this.print(data.get(oras));
        }
    }
}
