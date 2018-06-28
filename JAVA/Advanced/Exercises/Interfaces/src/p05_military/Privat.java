package p05_military;

public class Privat extends Private{

    public Privat(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d Salary: %.2f",
                super.firstName, super.lastName, super.id, this.salary);
    }
}
