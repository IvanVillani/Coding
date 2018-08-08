package p03_froggy;

import java.util.Arrays;
import java.util.Iterator;

public class Lake<T> implements Iterable<T>{
    private T[] elements;

    @SuppressWarnings("unchecked")
    public Lake(T... elements) {
        this.elements = (T[]) new Object[elements.length];
        this.elements = elements;
    }

    private final class Frog implements Iterator<T> {
        private int index;
        private boolean isEven;

        public Frog() {
            this.index = 0;
            this.isEven = true;
        }

        @Override
        public boolean hasNext() {
            return this.index < elements.length;
        }

        @Override
        public T next() {
            if (isEven && this.index < elements.length) {
                T t = elements[this.index];
                this.index += 2;
                if (this.index >= elements.length) {
                    this.isEven = false;
                    this.index = 1;
                }
                return t;
            }else if (isEven && elements.length == 1) {
                return elements[this.index++];
            }else {
                T t = elements[this.index];
                this.index += 2;
                return t;
            }
        }
    }

    public String jump() {
        StringBuilder sb = new StringBuilder();
        for (T t : this) {
            sb.append(t).append(", ");
        }
        sb.replace(sb.length()-2, sb.length()-1, "");
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Frog();
    }
}
