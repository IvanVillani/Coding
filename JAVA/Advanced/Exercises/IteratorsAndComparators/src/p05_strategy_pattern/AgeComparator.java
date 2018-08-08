package p05_strategy_pattern;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public AgeComparator() {
    }

    @Override
    public int compare(Person person1, Person person2) {
        int age1 = person1.getAge();
        int age2 = person2.getAge();

        return Integer.compare(age1, age2);
    }
}
