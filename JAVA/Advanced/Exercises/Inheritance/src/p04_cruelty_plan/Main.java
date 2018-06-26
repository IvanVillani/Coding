package p04_cruelty_plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] arr = reader.readLine().toLowerCase().split(" ");
        List<String> foods = new LinkedList<>();

        foods.addAll(Arrays.asList(arr));

        Gandalf gandalf = new Gandalf(foods);
        gandalf.updateMood();
        System.out.println(gandalf.toString());
    }
}
