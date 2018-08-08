package p07_my_structure;

import java.util.List;

public interface MyList<T extends Comparable<T>> {
    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int firstIndex, int secondIndex);

    int countGreaterThan(T element);

    T getMax();

    T getMin();

    Iterable<T> print();

    List<T> getElements();

    void setElements(List<T> newElements);
}
