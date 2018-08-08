package p02_stack_implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();
        Stack<Integer> stack = new Stack<>();

        while (!"END".equals(input)) {
            String[] arr = input.split("[, ]+");

            switch (arr[0]) {
                case "Push":
                    stack.push(Arrays.stream(arr).skip(1).map(Integer::valueOf).toArray(Integer[]::new));
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    }catch (NoSuchElementException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

            }

            input = reader.readLine();
        }
        reader.close();
        stack.printAll();
    }
}
