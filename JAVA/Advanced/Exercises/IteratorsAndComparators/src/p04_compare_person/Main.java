package p04_compare_person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();
        List<Person> persons = new ArrayList<>();

        while (!"END".equals(input)) {
            String[] arr = input.split(" ");

            Person person = new Person(arr[0], Integer.parseInt(arr[1]), arr[2]);
            persons.add(person);

            input = reader.readLine();
        }
        int index = Integer.parseInt(reader.readLine());
        if (index < 0 || index >= persons.size()) {
            System.out.println("No matches");
            return;
        }
        reader.close();

        Person person = persons.get(index);

        int count = persons.size();
        int equal = 0;
        int diff = 0;

        for (Person toCompare : persons) {
            if (person.compareTo(toCompare) == 0) {
                equal++;
            }else {
                diff++;
            }
        }

        System.out.println(String.format("%d %d %d", equal, diff, count));

    }
}
