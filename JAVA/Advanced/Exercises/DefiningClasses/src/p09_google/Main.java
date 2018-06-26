package p09_google;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();
        Map<String, Person> persons = new LinkedHashMap<>();

        while (!"End".equals(input)) {
            String[] arr = input.split(" ");
            if (persons.containsKey(arr[0])) {
                switch (arr[1]) {
                    case "company":
                        Company company = new Company(arr[2], arr[3], Double.parseDouble(arr[4]));
                        persons.get(arr[0]).setCompany(company);
                        break;
                    case "car":
                        Car car = new Car(arr[2], arr[3]);
                        persons.get(arr[0]).setCar(car);
                        break;
                    case "pokemon":
                        Pokemon pokemon = new Pokemon(arr[2], arr[3]);
                        if (persons.get(arr[0]).getPokemons() == null) {
                            LinkedList<Pokemon> pokemons = new LinkedList<>();
                            pokemons.add(pokemon);
                            persons.get(arr[0]).setPokemons(pokemons);
                        }else {
                            persons.get(arr[0]).getPokemons().add(pokemon);
                        }
                        break;
                    case "parents":
                        Parent parent = new Parent(arr[2], arr[3]);
                        if (persons.get(arr[0]).getParents() == null) {
                            LinkedList<Parent> parents = new LinkedList<>();
                            parents.add(parent);
                            persons.get(arr[0]).setParents(parents);
                        }else {
                            persons.get(arr[0]).getParents().add(parent);
                        }
                        break;
                    case "children":
                        Child child = new Child(arr[2], arr[3]);
                        if (persons.get(arr[0]).getChildren() == null) {
                            LinkedList<Child> children = new LinkedList<>();
                            children.add(child);
                            persons.get(arr[0]).setChildren(children);
                        }else {
                            persons.get(arr[0]).getChildren().add(child);
                        }
                        break;
                    default:
                        break;
                }
            }else {
                p09_google.Person person;
                switch (arr[1]) {
                    case "company":
                        Company company = new Company(arr[2], arr[3], Double.parseDouble(arr[4]));
                        person = new Person(arr[0], company);
                        persons.put(arr[0], person);
                        break;
                    case "car":
                        Car car = new Car(arr[2], arr[3]);
                        person = new Person(arr[0], car);
                        persons.put(arr[0], person);
                        break;
                    case "pokemon":
                        Pokemon pokemon = new Pokemon(arr[2], arr[3]);
                        LinkedList<Pokemon> pokemons = new LinkedList<>();
                        pokemons.add(pokemon);
                        person = new Person(arr[0], pokemons, "");
                        persons.put(arr[0], person);
                        break;
                    case "parents":
                        Parent parent = new Parent(arr[2], arr[3]);
                        LinkedList<Parent> parents = new LinkedList<>();
                        parents.add(parent);
                        person = new Person(arr[0], parents, 1);
                        persons.put(arr[0], person);
                        break;
                    case "children":
                        Child child = new Child(arr[2], arr[3]);
                        LinkedList<Child> children = new LinkedList<>();
                        children.add(child);
                        person = new Person(arr[0], children, 1.1);
                        persons.put(arr[0], person);
                        break;
                    default:
                        break;
                }
            }

            input = reader.readLine();
        }

        input = reader.readLine();

        if (persons.containsKey(input)) {
            Person person = persons.get(input);
            System.out.printf("%s%n", person.getName());
            if (person.getCompany() == null) {
                System.out.printf("Company:%n");

            }else {
                System.out.printf("Company:%n%s %s %.2f%n", person.getCompany().getName(), person.getCompany().getDepar(), person.getCompany().getSalary());

            }
            if (person.getCar() == null) {
                System.out.printf("Car:%n");
            }else {
                System.out.printf("Car:%n%s %s%n", person.getCar().getModel(), person.getCar().getSpeed());

            }
            System.out.printf("Pokemon:%n");
            if (person.getPokemons() != null) {
                person.getPokemons()
                        .forEach(pokemon -> {
                            System.out.printf("%s %s%n", pokemon.getName(), pokemon.getType());
                        });
            }
            System.out.printf("Parents:%n");
            if (person.getParents() != null) {
                person.getParents()
                        .forEach(parent -> {
                            System.out.printf("%s %s%n", parent.getName(), parent.getBirthday());
                        });
            }
            System.out.printf("Children:%n");
            if (person.getChildren() != null) {
                person.getChildren()
                        .forEach(child -> {
                            System.out.printf("%s %s%n", child.getName(), child.getBirthday());
                        });
            }
        }
    }
}
