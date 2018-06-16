package p07_car_salesman;

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

        Map<String, Engine> engines = new LinkedHashMap<>();
        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] arr = reader.readLine().split("\\s+");
            String model = arr[0];
            String power = arr[1];
            Engine engine;

            if (arr.length == 3) {
                try {
                    int displace = Integer.parseInt(arr[2]);
                    engine = new Engine(model, power);
                    engine.setDisplace(arr[2]);
                    engine.setEffic(Engine.DEFAULT_VALUE);
                }catch (Exception e) {
                    engine = new Engine(model, power);
                    engine.setDisplace(Engine.DEFAULT_VALUE);
                    engine.setEffic(arr[2]);
                }
            }else if (arr.length == 4) {
                engine = new Engine(model, power, arr[2], arr[3]);
            }else {
                engine = new Engine(model, power);
                engine.setDisplace(Engine.DEFAULT_VALUE);
                engine.setEffic(Engine.DEFAULT_VALUE);
            }
            engines.put(model, engine);
        }

        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < m; i++) {
            String[] arr = reader.readLine().split("\\s+");
            String model = arr[0];
            Engine engine = engines.get(arr[1]);
            Car car;

            if (arr.length == 3) {
                try {
                    int weight = Integer.parseInt(arr[2]);
                    car = new Car(model, engine);
                    car.setWeight(arr[2]);
                    car.setColor(Car.DEFAULT_VALUE);
                }catch (Exception e) {
                    car = new Car(model, engine);
                    car.setWeight(Car.DEFAULT_VALUE);
                    car.setColor(arr[2]);
                }
            }else if (arr.length == 4) {
                car = new Car(model, engine, arr[2], arr[3]);
            }else {
                car = new Car(model, engine);
                car.setWeight(Car.DEFAULT_VALUE);
                car.setColor(Car.DEFAULT_VALUE);
            }
            cars.put(model, car);
        }

        cars.forEach((key, value) -> {
            System.out.printf("%s:%n", value.getModel());
            System.out.printf("%s:%n", value.getEngine().getModel());
            System.out.printf("Power: %s%n", value.getEngine().getPower());
            System.out.printf("Displacement: %s%n", value.getEngine().getDisplace());
            System.out.printf("Efficiency: %s%n", value.getEngine().getEffic());
            System.out.printf("Weight: %s%n", value.getWeight());
            System.out.printf("Color: %s%n", value.getColor());
        });
    }
}
