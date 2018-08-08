package p02_stack_implementation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T> {
    private final static int FIXED_LENGTH = 16;

    private T[] elements;
    private int index;

    @SuppressWarnings("unchecked")
    public Stack() {
        this.elements = (T[]) new Object[FIXED_LENGTH];
    }

    private final class StackIterator implements Iterator<T> {
        private int cursor;

        public StackIterator() {
            this.cursor = index - 1;
        }

        @Override
        public boolean hasNext() {
            return this.cursor >= 0;
        }

        @Override
        public T next() {
            return elements[this.cursor--];
        }
    }

    public void push(T... pushed) {
        for (T t : pushed) {
            if (this.index < this.elements.length-1) {
                this.elements[this.index++] = t;
            }else {
                grow();
            }
        }
    }

    private void grow() {
        this.elements = Arrays.copyOf(this.elements, this.elements.length*2);
    }

    public void pop() {
        if (this.index <= 0) {
            throw new NoSuchElementException("No elements");
        }
        this.elements[--this.index] = null;
    }

    public void printAll() {
        if (this.index > 0) {
            StringBuilder sb = new StringBuilder();
            for (T t : this) {
                sb.append(t).append(System.lineSeparator());
            }
            System.out.println(sb.toString() + sb.toString().trim());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }
}
