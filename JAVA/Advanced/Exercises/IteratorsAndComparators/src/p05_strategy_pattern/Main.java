package p05_strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());

        TreeSet<Person> personsByName = new TreeSet<>(new NameComparator());
        TreeSet<Person> personsByAge = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < n; i++) {
            String[] arr = reader.readLine().split(" ");
            Person person = new Person(arr[0], Integer.parseInt(arr[1]));
            personsByName.add(person);
            personsByAge.add(person);
        }
        reader.close();

        for (Person person : personsByName) {
            System.out.println(person.getName() + " " + person.getAge());
        }
        for (Person person : personsByAge) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
