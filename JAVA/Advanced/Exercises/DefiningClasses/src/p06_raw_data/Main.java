package p06_raw_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            String model = input[0];
            int speed = Integer.parseInt(input[1]);
            int power = Integer.parseInt(input[2]);
            int weight = Integer.parseInt(input[3]);
            String type = input[4];

            Engine engine = new Engine(speed, power);
            Cargo cargo = new Cargo(weight, type);
            List<Tire> tires = new ArrayList<>(4);

            for (int j = 5; j < 12; j=j+2) {
                Tire tire = new Tire(Double.parseDouble(input[j]), Integer.parseInt(input[j+1]));
                tires.add(tire);
            }

            Car car = new Car(model, engine, cargo, tires);
            cars.put(model, car);
        }

        if ("fragile".equals(reader.readLine())) {
            cars.entrySet().stream()
                    .filter(entry -> "fragile".equals(entry.getValue().getCargo().getType()))
                    .filter(entry -> entry.getValue().getTires().stream()
                            .anyMatch(tire -> tire.getPressure() < 1))
                    .forEach(entry -> System.out.printf("%s%n", entry.getValue().getModel()));
        }else {
            cars.entrySet().stream()
                    .filter(entry -> "flamable".equals(entry.getValue().getCargo().getType()))
                    .filter(entry -> entry.getValue().getEngine().getPower() > 250)
                    .forEach(entry -> System.out.printf("%s%n", entry.getValue().getModel()));
        }
    }
}
