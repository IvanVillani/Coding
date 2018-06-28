package p05_military;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LeutenantGeneral extends Private implements ILeutenantGeneral{
    private HashSet<Private> privates;

    public LeutenantGeneral(int id, String firstName, String lastName, double salary, HashSet<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f",
                super.firstName, super.lastName, super.id, super.salary))
                .append(System.lineSeparator());
        sb.append("Privates:");
        privates.stream()
                .sorted((ele1, ele2) -> Integer.compare(ele2.id, ele1.id))
                .forEach(pri -> sb.append(System.lineSeparator()).append(pri.toString()));
        return sb.toString();
    }
}
