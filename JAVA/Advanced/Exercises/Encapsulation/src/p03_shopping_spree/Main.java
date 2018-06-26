package p03_shopping_spree;

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
        
        String[] arr = reader.readLine().split(";");
        String[] arr1 = reader.readLine().split(";");

        Map<String, Person> persons = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        for (String s : arr) {
            String[] personArr = s.split("=");
            Person person;
            try {
                person = new Person(personArr[0], Integer.parseInt(personArr[1]));
            }catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
            persons.put(person.getName(), person);
        }

        for (String s : arr1) {
            String[] productArr = s.split("=");
            Product product;
            try {
                product = new Product(productArr[0], Integer.parseInt(productArr[1]));
            }catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
            products.put(product.getName(), product);
        }

        String input = reader.readLine();

        while (!"END".equals(input)) {
            String[] arrr = input.split(" ");
            if (persons.containsKey(arrr[0])) {
                if (products.containsKey(arrr[1])) {
                    Person person = persons.get(arrr[0]);
                    Product product = products.get(arrr[1]);
                    if (person.updateBagAndMoney(product)) {
                        System.out.printf("%s bought %s%n", person.getName(), product.getName());
                    }else {
                        System.out.printf("%s can't afford %s%n", person.getName(), product.getName());
                    }
                }
            }

            input = reader.readLine();
        }

        reader.close();

        for (Map.Entry<String, Person> entry : persons.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
