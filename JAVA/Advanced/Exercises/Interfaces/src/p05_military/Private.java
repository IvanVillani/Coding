package p05_military;

public abstract class Private extends Soldier implements IPrivate{
    protected double salary;

    public Private(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

}
