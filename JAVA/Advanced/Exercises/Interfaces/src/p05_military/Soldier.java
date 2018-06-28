package p05_military;

public abstract class Soldier implements ISoldier{
    protected int id;
    protected String firstName;
    protected String lastName;

    public Soldier(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract String toString();
}
