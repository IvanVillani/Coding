package p01_class_person;

class Person {
    private static String DEFAULT_NAME = "No name";
    private static int DEFAULT_AGE = 1;

    private String name;
    private int age;

    public Person() {
        this.name = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
    }

    public Person(int age) {
        this.name = DEFAULT_NAME;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
