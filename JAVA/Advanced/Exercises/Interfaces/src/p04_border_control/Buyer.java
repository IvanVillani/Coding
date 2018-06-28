package p04_border_control;

public abstract class Buyer {
    protected int food;
    protected String name;
    private int age;

    public Buyer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract void buyFood();

}
