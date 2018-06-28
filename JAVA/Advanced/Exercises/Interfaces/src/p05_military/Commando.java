package p05_military;

import java.util.HashSet;

public class Commando extends SpecialisedSoldier implements ICommando{
    private HashSet<Mission> missions;

    public Commando(int id, String firstName, String lastName, double salary, String corps, HashSet<Mission> missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions = missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f",
                super.firstName, super.lastName, super.id, super.salary))
                .append(System.lineSeparator())
                .append(String.format("Corps: %s", super.corps))
                .append(System.lineSeparator())
                .append("Missions:");
        missions.forEach(mission -> sb.append(System.lineSeparator())
                .append(mission.toString()));

        return sb.toString();
    }
}
