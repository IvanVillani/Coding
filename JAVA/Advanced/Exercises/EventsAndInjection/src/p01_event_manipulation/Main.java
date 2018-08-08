package p01_event_manipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Dispatcher dispatcher = new Dispatcher(new ArrayList<>());
        NameChangeListener handler = new Handler();
        dispatcher.addNameChangeListener(handler);

        while (true) {
            String input = reader.readLine();

            if ("End".equals(input)) {
                break;
            }

            dispatcher.setName(input);
        }
    }
}
