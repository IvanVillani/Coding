package p04_compare_person;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person person) {
        int firstComparing = this.name.compareTo(person.getName());
        int secondComparing = Integer.compare(this.age, person.getAge());
        int thirdComparing = this.town.compareTo(person.getTown());
        if (firstComparing != 0) {
            return firstComparing;
        }else if (secondComparing != 0) {
            return secondComparing;
        }else {
            return thirdComparing;
        }
    }
}
