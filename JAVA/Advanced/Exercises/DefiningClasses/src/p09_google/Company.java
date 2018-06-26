package p09_google;

public class Company {
    private String name;
    private String depar;
    private double salary;

    public Company(String name, String depar, double salary) {
        this.name = name;
        this.depar = depar;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepar() {
        return depar;
    }

    public void setDepar(String depar) {
        this.depar = depar;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
