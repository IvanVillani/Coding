package p02_animal_farm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        try {
            Chicken chicken = new Chicken(name, age);

            System.out.println(chicken.getProductPerDay());
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
