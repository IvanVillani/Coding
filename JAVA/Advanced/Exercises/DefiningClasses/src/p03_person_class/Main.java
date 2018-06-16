package p03_person_class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, Person> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            Person newPerson = new Person(input[0], Integer.parseInt(input[1]));

            map.put(input[0], newPerson);
        }

        for (Map.Entry<String, Person> entry : map.entrySet()) {
            if (entry.getValue().getAge() > 30) {
                System.out.printf("%s - %d%n", entry.getValue().getName(), entry.getValue().getAge());
            }
        }
    }
}
