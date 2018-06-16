package p05_speed_racing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] arr = reader.readLine().split(" ");
            String model = arr[0];
            double fuel = Double.parseDouble(arr[1]);
            double pointer = Double.parseDouble(arr[2]);
            Car car = new Car(model, fuel, pointer);
            cars.put(model, car);
        }

        String input = reader.readLine();

        while (!"End".equals(input)) {
            String[] arr = input.split(" ");
            String model = arr[1];
            int distance = Integer.parseInt(arr[2]);

            if (cars.containsKey(model)) {
                Car curr = cars.get(model);
                double pointer = curr.getPointer();
                double fuel = curr.getFuel();
                if (pointer * distance <= fuel) {
                    curr.setFuel(fuel - pointer * distance);
                    curr.setDistance(curr.getDistance() + distance);
                }else {
                    System.out.println("Insufficient fuel for the drive");
                }
            }
            input = reader.readLine();
        }

        cars.forEach((key, value) -> System.out.printf("%s %.2f %d%n", key, value.getFuel(), value.getDistance()));
    }
}
