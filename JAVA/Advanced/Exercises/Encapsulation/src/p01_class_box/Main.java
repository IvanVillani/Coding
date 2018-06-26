package p01_class_box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        try {
            Box box = new Box(length, width, height);

            System.out.printf("Surface Area - %.2f%n", box.getSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n", box.getLateralArea());
            System.out.printf("Volume - %.2f%n", box.getVolume());
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
