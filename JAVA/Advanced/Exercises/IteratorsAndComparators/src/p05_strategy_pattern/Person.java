package p05_strategy_pattern;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        int firstCompare = this.getName().compareTo(person.getName());
        int secondCompare = Integer.compare(this.getAge(), person.getAge());

        if (firstCompare == 0) {
            return secondCompare;
        }
        return firstCompare;
    }
}
