package p03_dependency_inversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        PrimitiveCalculator primitiveCalculator = new PrimitiveCalculator();

        while (true) {
            String input = reader.readLine();

            if ("End".equals(input)) {
                break;
            }
            String[] arr = input.split(" ");
             if ("mode".equals(arr[0])) {
                 primitiveCalculator.changeStrategy(arr[1].charAt(0));
             }else {
                 System.out.println(primitiveCalculator.performCalculation(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
             }
        }
    }
}
