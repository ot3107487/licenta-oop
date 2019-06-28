package sept_2018;

public class Employee extends Participant {
    private String departament;

    public Employee(String name, String town, String departament) throws Exception {
        super(name, town);
        if (departament == null || "".equals(departament)) {
            throw new Exception("Departament invalid");
        }
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Employee " + this.departament + super.toString();
    }
}
