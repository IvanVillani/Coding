package p07_my_structure;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MyListImpl<T extends Comparable<T>> implements MyList<T>, Iterable<T>{
    private List<T> elements;

    public MyListImpl() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        this.elements.add(element);
    }

    @Override
    public T remove(int index) {
        return this.elements.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {
        T firstEl = this.elements.get(firstIndex);
        this.elements.set(firstIndex, this.elements.get(secondIndex));
        this.elements.set(secondIndex, firstEl);
    }

    @Override
    public int countGreaterThan(T element) {
        return this.elements.stream()
                .filter(ele -> ele.compareTo(element) > 0)
                .collect(Collectors.toList())
                .size();
    }

    @Override
    public T getMax() {
        return this.elements.stream()
                .max(Comparator.naturalOrder())
                .get();
    }

    @Override
    public T getMin() {
        return this.elements.stream()
                .min(Comparator.naturalOrder())
                .get();
    }

    @Override
    public Iterable<T> print() {
        return this.elements;
    }

    @Override
    public List<T> getElements() {
        return this.elements;
    }

    @Override
    public void setElements(List<T> newElements) {
        this.elements = newElements;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
