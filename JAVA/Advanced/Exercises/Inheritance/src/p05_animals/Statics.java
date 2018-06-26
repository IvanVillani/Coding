package p05_animals;

import java.util.ArrayList;
import java.util.List;

public class Statics {
    public static final List<String> DEFAULT_ANIMALS = new ArrayList<>();
    static {
        DEFAULT_ANIMALS.add("Dog");
        DEFAULT_ANIMALS.add("Cat");
        DEFAULT_ANIMALS.add("Frog");
        DEFAULT_ANIMALS.add("Kitten");
        DEFAULT_ANIMALS.add("Tomcat");
    }
    public static final List<String> DEFAULT_GENDERS = new ArrayList<>();
    static {
        DEFAULT_GENDERS.add("Male");
        DEFAULT_GENDERS.add("Female");
    }
}
