package p07_my_structure;


import java.util.stream.Collectors;

public class Sorter {
    public static <T extends Comparable<T>> void sort(MyList<T> list) {
        list.setElements(list.getElements().stream()
                .sorted(Comparable::compareTo).collect(Collectors.toList()));
    }
}
