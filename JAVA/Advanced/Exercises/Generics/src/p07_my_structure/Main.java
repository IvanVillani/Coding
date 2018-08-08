package p07_my_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        MyList<String> mylist = new MyListImpl<>();

        String input = reader.readLine();

        while (!"END".equals(input)) {
            String[] arr = input.split(" ");
            switch (arr[0]) {
                case "Add":
                    mylist.add(arr[1]);
                    break;
                case "Remove":
                    mylist.remove(Integer.valueOf(arr[1]));
                    break;
                case "Contains":
                    System.out.println(mylist.contains(arr[1]));
                    break;
                case "Swap":
                    mylist.swap(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
                    break;
                case "Greater":
                    System.out.println(mylist.countGreaterThan(arr[1]));
                    break;
                case "Max":
                    System.out.println(mylist.getMax());
                    break;
                case "Min":
                    System.out.println(mylist.getMin());
                    break;
                case "Print":
                    mylist.print().forEach(System.out::println);
                    break;
                case "Sort":
                    Sorter.sort(mylist);
                    break;
            }
            input = reader.readLine();
        }
    }

}
