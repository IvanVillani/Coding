package p04_border_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, Buyer> buyers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] arr = reader.readLine().split(" ");
            if (arr.length == 4) {
                Citizen citizen = new Citizen(arr[0], Integer.parseInt(arr[1]), arr[2], arr[3]);
                buyers.put(arr[0], citizen);
            }else {
                Rebel rebel = new Rebel(arr[0], Integer.parseInt(arr[1]), arr[2]);
                buyers.put(arr[0], rebel);
            }
        }

        String input = reader.readLine();

        while (!"End".equals(input)) {
            if (buyers.containsKey(input)){
                buyers.get(input).buyFood();
            }

            input = reader.readLine();
        }

        reader.close();

        int result = 0;

        for (Map.Entry<String, Buyer> entry : buyers.entrySet()) {
            result += entry.getValue().food;
        }

        System.out.println(result);
    }
}
