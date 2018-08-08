package p01_listyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIteratorImpl<T> implements Iterable<T>{
    private List<T> elements;
    private int index;

    @SuppressWarnings("unchecked")
    public ListyIteratorImpl(T... elements) {
        this.elements = Arrays.asList(elements);
    }

    private final class ListyIterator implements Iterator<T> {
        private int cursor;

        public ListyIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return this.cursor < elements.size();
        }

        @Override
        public T next() {
            return elements.get(this.cursor++);
        }
    }

    public boolean move() {
        if (this.hasNext()) {
            this.index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return this.index < this.elements.size() - 1;
    }

    public void print() {
        if (this.elements.size() > 0) {
            System.out.println(this.elements.get(this.index));
        }else {
            System.out.println("Invalid Operation!");
        }
    }

    public void printAll() {
        if (this.elements.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (T t : this) {
                sb.append(t).append(" ");
            }
            System.out.println(sb.replace(sb.length()-1, sb.length()-1, "").toString());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListyIterator();
    }
}
