package p04_pizza_calories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] first = reader.readLine().split(" ");
        String[] second = reader.readLine().split(" ");

        Pizza pizza;
        try {
            pizza = new Pizza(first[1], Integer.parseInt(first[2]));
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        Dough dough;
        try {
            dough = new Dough(second[1], second[2], Integer.parseInt(second[3]));
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        pizza.setDough(dough);

        for (int i = 0; i < Integer.parseInt(first[2]); i++) {
            String[] arr = reader.readLine().split(" ");
            Topping topping;
            try {
                topping = new Topping(arr[1], Integer.parseInt(arr[2]));
            }catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
            pizza.getToppings().add(topping);
        }

        System.out.println(pizza);
    }
}
