package p03_telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] line1 = reader.readLine().split(" ");
        String[] line2 = reader.readLine().split(" ");

        List<String> numbers = new LinkedList<>();
        List<String> urls = new LinkedList<>();

        Collections.addAll(numbers, line1);
        Collections.addAll(urls, line2);

        Smartphone smartphone = new Smartphone(numbers, urls);

        for (String number : smartphone.getNumbers()) {
            String result = null;
            try {
                result = smartphone.call(number);
                System.out.println(result);
            }catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        for (String url : smartphone.getUrls()) {
            String result = null;
            try {
                result = smartphone.browse(url);
                System.out.println(result);
            }catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
