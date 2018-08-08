package p01_listyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();
        ListyIteratorImpl<String> listyIteratorImpl = null;

        while (!"END".equals(input)) {
            String[] arr = input.split(" ");

            switch (arr[0]) {
                case "Create":
                    if (arr.length > 1) {
                        listyIteratorImpl = new ListyIteratorImpl<>(Arrays.stream(arr).skip(1).toArray(String[]::new));
                    }else {
                        listyIteratorImpl = new ListyIteratorImpl<>();
                    }
                    break;
                case "Move":
                    if (listyIteratorImpl != null) {
                        System.out.println(listyIteratorImpl.move());
                    }
                    break;
                case "HasNext":
                    if (listyIteratorImpl != null) {
                        System.out.println(listyIteratorImpl.hasNext());
                    }
                    break;
                case "Print":
                    if (listyIteratorImpl != null) {
                        listyIteratorImpl.print();
                    }
                    break;
                case "PrintAll":
                    if (listyIteratorImpl != null) {
                        listyIteratorImpl.printAll();
                    }
                    break;
            }

            input = reader.readLine();
        }
        reader.close();
    }
}
