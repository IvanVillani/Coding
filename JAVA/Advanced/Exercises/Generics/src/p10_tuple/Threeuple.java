package p10_tuple;

public class Threeuple<F, S, T> {
    private F firstItem;
    private S secondItem;
    private T thirdItem;

    public Threeuple(F firstItem, S secondItem, T thirdItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
    }

    public F getFirstItem() {
        return firstItem;
    }

    public S getSecondItem() {
        return secondItem;
    }

    public T getThirdItem() {
        return thirdItem;
    }

    public void setFirstItem(F firstItem) {
        this.firstItem = firstItem;
    }

    public void setSecondItem(S secondItem) {
        this.secondItem = secondItem;
    }

    public void setThirdItem(T thirdItem) {
        this.thirdItem = thirdItem;
    }
}
