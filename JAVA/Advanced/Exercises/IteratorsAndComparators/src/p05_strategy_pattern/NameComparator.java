package p05_strategy_pattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    public NameComparator() {
    }

    @Override
    public int compare(Person person1, Person person2) {
        String name1 = person1.getName();
        String name2 = person2.getName();
        int firstCompare = Integer.compare(name1.length(), name2.length());
        int secondCompare = String.valueOf(name1.charAt(0)).compareToIgnoreCase(String.valueOf(name2.charAt(0)));

        if (firstCompare == 0) {
            return secondCompare;
        }
        return firstCompare;
    }

}
