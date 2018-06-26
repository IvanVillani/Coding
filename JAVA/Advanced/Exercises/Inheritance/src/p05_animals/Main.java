package p05_animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Animal> animals = new LinkedList<>();

        for (;;) {
            String input1 = reader.readLine();
            if ("Beast!".equals(input1)) {
                break;
            }
            String[] arr = reader.readLine().split(" ");

            switch (input1) {
                case"Cat":
                    try {
                        Cat cat = new Cat(arr[0], arr[1], arr[2]);
                        animals.add(cat);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case"Dog":
                    try {
                        Dog dog = new Dog(arr[0], arr[1], arr[2]);
                        animals.add(dog);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case"Frog":
                    try {
                        Frog frog = new Frog(arr[0], arr[1], arr[2]);
                        animals.add(frog);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case"Tomcat":
                    try {
                        Tomcat tomcat = new Tomcat(arr[0], arr[1], arr[2]);
                        animals.add(tomcat);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case"Kitten":
                    try {
                        Kitten kitten = new Kitten(arr[0], arr[1], arr[2]);
                        animals.add(kitten);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.toString());
            System.out.println(animal.produceSound());
        }
    }
}
