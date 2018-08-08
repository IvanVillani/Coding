package p01_generic_box;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>>{
    private T value;

    public Box() {}

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.value.getClass().getName(), this.value);
    }

    @Override
    public int compareTo(Box<T> element) {
        return this.value.compareTo(element.value);
    }
}
