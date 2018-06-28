package p05_military;

public class Spy extends Soldier implements ISpy{
    private int codeNumber;

    public Spy(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d%nCode Number: %d",
                super.firstName, super.lastName, super.id, this.codeNumber);
    }
}
