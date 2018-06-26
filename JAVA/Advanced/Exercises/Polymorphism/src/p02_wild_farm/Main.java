package p02_wild_farm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<String> animals = new LinkedList<>();

        for (; ; ) {
            String[] arr1 = reader.readLine().split(" ");
            if ("End".equals(arr1[0])) {
                break;
            }
            String[] arr2 = reader.readLine().split(" ");

            Food food = null;

            if ("Vegetable".equals(arr2[0])) {
                food = new Vegetable(Integer.parseInt(arr2[1]));
            }else {
                food = new Meat(Integer.parseInt(arr2[1]));
            }

            if (arr1.length == 5) {
                Cat cat = new Cat(arr1[1], arr1[0], Double.parseDouble(arr1[2]), arr1[3], arr1[4]);
                cat.makeSound();
                try {
                    cat.eat(food);
                }catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
                animals.add(cat.toString());
            } else {
                switch (arr1[0]) {
                    case "Tiger":
                        Tiger tiger = new Tiger(arr1[1], arr1[0], Double.parseDouble(arr1[2]), arr1[3]);
                        tiger.makeSound();
                        try {
                            tiger.eat(food);
                        }catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        animals.add(tiger.toString());
                        break;
                    case "Zebra":
                        Zebra zebra = new Zebra(arr1[1], arr1[0], Double.parseDouble(arr1[2]), arr1[3]);
                        zebra.makeSound();
                        try {
                            zebra.eat(food);
                        }catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        animals.add(zebra.toString());
                        break;
                    case "Mouse":
                        Mouse mouse = new Mouse(arr1[1], arr1[0], Double.parseDouble(arr1[2]), arr1[3]);
                        mouse.makeSound();
                        try {
                            mouse.eat(food);
                        }catch (IllegalArgumentException ex) {
                            System.out.println(ex.getMessage());
                        }
                        animals.add(mouse.toString());
                        break;
                    default:
                        break;
                }
            }


        }

        for (String animal : animals) {
            System.out.print(animal);
        }
    }
}
