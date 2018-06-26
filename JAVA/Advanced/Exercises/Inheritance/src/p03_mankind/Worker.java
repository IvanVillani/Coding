package p03_mankind;

public class Worker extends Human{
    private double salary;
    private double hours;

    public Worker(String firstName, String lastName, double salary, double hours) {
        super(firstName, lastName);
        this.setSalary(salary);
        this.setHours(hours);
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length() < 4) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        if (salary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.salary = salary;
    }

    public double getHours() {
        return hours;
    }

    protected void setHours(double hours) {
        if (hours < 1 || hours > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hours = hours;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(super.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(super.getLastName())
                .append(System.lineSeparator())
                .append("Week Salary: ").append(String.format("%.2f",this.getSalary()))
                .append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f",this.getHours()))
                .append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f",(this.getSalary() / 7) / this.getHours()))
                .append(System.lineSeparator());

        return sb.toString();

    }
}
