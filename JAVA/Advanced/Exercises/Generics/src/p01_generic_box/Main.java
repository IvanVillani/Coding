package p01_generic_box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Box<Double>> boxes = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(reader.readLine());
            Box<Double> newBox = new Box<>();
            newBox.setValue(num);
            boxes.add(newBox);
        }
        Box<Double> box = new Box<>();
        box.setValue(Double.valueOf(reader.readLine()));
        reader.close();
        System.out.println(getCounOfGreaterElements(boxes, box));
//        String[] arr = reader.readLine().split(" ");
//        swap(boxes, Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
//        for (Box<Integer> box : boxes) {
//            System.out.println(box.toString());
//        }
    }
//
//    private static <T> void swap(List<Box<T>> boxes, int firstIndex, int secondIndex) {
//        Box<T> firstBox = boxes.get(firstIndex);
//        boxes.set(firstIndex, boxes.get(secondIndex));
//        boxes.set(secondIndex, firstBox);
//    }

    private static <T extends Comparable<T>> int getCounOfGreaterElements(List<Box<T>> boxes, Box<T> box) {
        return boxes.stream()
                .filter(el -> el.compareTo(box) > 0)
                .collect(Collectors.toList())
                .size();
    }
}
