package p10_family_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String find = reader.readLine();

        LinkedList<Person> persons = new LinkedList<>();

        Map<String, String> map = new LinkedHashMap<>();

        String input = reader.readLine();

        while (!"End".equals(input)) {
            String[] arr = input.split(" - ");
            if (arr.length == 2) {
                map.put(arr[0], arr[1]);
            }else {
                String[] arr1 = input.split(" ");
                Person person = new Person(arr1[0] + " " + arr1[1], arr1[2]);
                persons.add(person);
            }

            input = reader.readLine();
        }

        LinkedList<Person> newPersons = new LinkedList<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            for (Person person : persons) {
                if (entry.getKey().equals(person.getName()) || entry.getKey().equals(person.getDate())) {
                    if (!newPersons.contains(person)) {
                        newPersons.add(person);
                    }
                    break;
                }
            }
            for (Person person : persons) {
                if (entry.getValue().equals(person.getName()) || entry.getValue().equals(person.getDate())) {
                    if (!newPersons.contains(person)) {
                        newPersons.add(person);
                    }
                    break;
                }
            }
            if (newPersons.size() == persons.size()) {
                break;
            }
        }

        Person person = null;
        for (Person curr : newPersons) {
            if (curr.getName().equals(find) || curr.getDate().equals(find)) {
                person = new Person(curr.getName(), curr.getDate());
                break;
            }
        }
        String name = person.getName();
        String date = person.getDate();

        Map<String, String> filtered = map.entrySet().stream()
                .filter(entry -> {
                    if (entry.getKey().equals(name) || entry.getKey().equals(date)){
                        return true;
                    }else if (entry.getValue().equals(name) || entry.getValue().equals(date)) {
                        return true;
                    }else {
                        return false;
                    }
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        LinkedList<Person> parents = new LinkedList<>();
        LinkedList<Person> children = new LinkedList<>();

        for (Map.Entry<String, String> entry : filtered.entrySet()) {
            if (person.getName().equals(entry.getKey()) || person.getDate().equals(entry.getKey())) {
                Person check = null;
                for (Person curr : newPersons) {
                    if (curr.getName().equals(entry.getValue()) || curr.getDate().equals(entry.getValue())) {
                        check = new Person(curr.getName(), curr.getDate());
                        break;
                    }
                }
                children.add(check);
            }else {
                Person check = null;
                for (Person curr : newPersons) {
                    if (curr.getName().equals(entry.getKey()) || curr.getDate().equals(entry.getKey())) {
                        check = new Person(curr.getName(), curr.getDate());
                        break;
                    }
                }
                parents.add(check);
            }
        }
        LinkedList<Person> last1 = new LinkedList<>();
        LinkedList<Person> last2 = new LinkedList<>();

        for (Person ele : newPersons) {
            if(last1.size() < children.size()) {
                for (Person child : children) {
                    if (child.getName().equals(ele.getName())) {
                        last1.add(ele);
                    }
                }
            }
            if (last2.size() < parents.size()) {
                for (Person parent : parents) {
                    if (parent.getName().equals(ele.getName())) {
                        last2.add(ele);
                    }
                }
            }
        }

        person.setParents(last2);
        person.setChildren(last1);

        System.out.printf("%s %s%n", person.getName(), person.getDate());
        System.out.printf("Parents:%n");
        if (person.getParents() != null) {
            person.getParents()
                    .forEach(parent -> {
                        System.out.printf("%s %s%n", parent.getName(), parent.getDate());
                    });
        }
        System.out.printf("Children:%n");
        if (person.getChildren() != null) {
            person.getChildren()
                    .forEach(child -> {
                        System.out.printf("%s %s%n", child.getName(), child.getDate());
                    });
        }

    }

    private static boolean checkIfDate(String s) {
        if (s.contains("/")) {
            return true;
        }else {
            return false;
        }
    }


}
