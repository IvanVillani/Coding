package p03_froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] arr = reader.readLine().split("[, ]+");
        String end = reader.readLine();

        if (arr.length > 0) {
            Lake<Integer> lake = new Lake<>(Arrays.stream(arr).map(Integer::valueOf).toArray(Integer[]::new));
            System.out.println(lake.jump());
        }
    }
}
