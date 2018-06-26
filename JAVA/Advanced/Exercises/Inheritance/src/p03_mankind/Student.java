package p03_mankind;

public class Student extends Human{
    private String number;

    public Student(String firstName, String lastName, String number) {
        super(firstName, lastName);
        this.setNumber(number);
    }

    public String getNumber() {
        return number;
    }

    protected void setNumber(String number) {
        if (number.length() < 5 || number.length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(super.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(super.getLastName())
                .append(System.lineSeparator())
                .append("Faculty number: ").append(this.getNumber())
                .append(System.lineSeparator());
        return sb.toString();

    }
}
