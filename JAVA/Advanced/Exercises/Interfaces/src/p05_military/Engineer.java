package p05_military;

import java.util.HashSet;

public class Engineer extends SpecialisedSoldier implements IEngineer{
    private HashSet<Repair> repairs;

    public Engineer(int id, String firstName, String lastName, double salary, String corps, HashSet<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f",
                super.firstName, super.lastName, super.id, super.salary))
                .append(System.lineSeparator())
                .append(String.format("Corps: %s", super.corps))
                .append(System.lineSeparator())
                .append("Repairs:");
        repairs.forEach(repair -> sb.append(System.lineSeparator())
                .append(repair.toString()));

        return sb.toString();
    }
}
