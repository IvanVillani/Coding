package p04_border_control;

public class Rebel extends Buyer{
    private String group;

    public Rebel(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    protected void buyFood() {
        super.food += 5;
    }
}
