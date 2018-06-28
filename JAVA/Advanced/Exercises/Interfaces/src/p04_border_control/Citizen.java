package p04_border_control;

public class Citizen extends Buyer{
    private String id;
    private String birthdate;

    public Citizen(String name, int age, String id, String birthdate) {
        super(name, age);
        this.id = id;
        this.birthdate = birthdate;
    }

    @Override
    protected void buyFood() {
        super.food += 10;
    }
}
