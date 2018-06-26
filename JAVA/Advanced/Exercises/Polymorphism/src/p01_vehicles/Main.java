package p01_vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] arr1 = reader.readLine().split(" ");
        String[] arr2 = reader.readLine().split(" ");
        String[] arr3 = reader.readLine().split(" ");

        Car car = null;
        Truck truck = null;
        Bus bus = null;

        try {
            car = new Car(Double.parseDouble(arr1[3]), Double.parseDouble(arr1[1]), Double.parseDouble(arr1[2]));
            truck = new Truck(Double.parseDouble(arr2[3]), Double.parseDouble(arr2[1]), Double.parseDouble(arr2[2]));
            bus = new Bus(Double.parseDouble(arr3[3]), Double.parseDouble(arr3[1]), Double.parseDouble(arr3[2]));
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            double value = Double.parseDouble(input[2]);
            if ("Drive".equals(input[0])) {
                if ("Car".equals(input[1])) {
                    try {
                        car.drive(value);
                        DecimalFormat df = new DecimalFormat( "#.##" );
                        String distance = df.format(value);
                        System.out.printf("Car travelled %s km%n", distance);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }else if ("Bus".equals(input[1])) {
                    try {
                        bus.drive(value);
                        DecimalFormat df = new DecimalFormat( "#.##" );
                        String distance = df.format(value);
                        System.out.printf("Bus travelled %s km%n", distance);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }else {
                    try {
                        truck.drive(value);
                        DecimalFormat df = new DecimalFormat( "#.##" );
                        String distance = df.format(value);
                        System.out.printf("Truck travelled %s km%n", distance);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }else if ("DriveEmpty".equals(input[0])) {
                try {
                    bus.driveEmpty(value);
                    DecimalFormat df = new DecimalFormat( "#.##" );
                    String distance = df.format(value);
                    System.out.printf("Bus travelled %s km%n", distance);
                }catch (IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }else {
                if ("Car".equals(input[1])) {
                    try {
                        car.refuel(value);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }else if ("Bus".equals(input[1])) {
                    try {
                        bus.refuel(value);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }else {
                    try {
                        truck.refuel(value);
                    }catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());

//        Car 15 0.3
//        Truck 100 0.9
//        4
//        Drive Car 9
//        Drive Car 30
//        Refuel Car 50
//        Drive Truck 10

    }
}
