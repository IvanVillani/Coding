package p02_wild_farm;

public abstract class Food {
    protected int guantity;

    public Food(int guantity) {
        this.guantity = guantity;
    }

    public int getGuantity() {
        return guantity;
    }
}
