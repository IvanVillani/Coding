import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P04_Maps {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Map<String, String> conpass = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> users = new TreeMap<>();

        String input = reader.readLine();

        while (!"end of contests".equals(input)) {
            String[] arr = input.split(":");
            conpass.put(arr[0], arr[1]);

            input = reader.readLine();
        }
        while (!"end of submissions".equals(input)) {
            String[] strr = input.split("=>");
            if (conpass.containsKey(strr[0])) {
                if (conpass.get(strr[0]).equals(strr[1])) {
                    Map<String, Integer> tempMap;
                    if (users.containsKey(strr[2])) {
                        tempMap = users.get(strr[2]);
                        if (tempMap.containsKey(strr[0])) {
                            if (tempMap.get(strr[0]) < Integer.parseInt(strr[3])) {
                                tempMap.put(strr[0], Integer.parseInt(strr[3]));
                            }
                        }else {
                            tempMap.put(strr[0], Integer.parseInt(strr[3]));
                        }
                    }else {
                        tempMap = new LinkedHashMap<>();
                        tempMap.put(strr[0], Integer.parseInt(strr[3]));
                    }
                    users.put(strr[2], tempMap);
                }
            }

            input = reader.readLine();
        }

        String winner = "";
        int max = 0;

        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
            int curr = 0;


            for (Map.Entry<String, Integer> entry1 : entry.getValue().entrySet()) {
                curr += entry1.getValue();
            }
            if (curr > max) {
                max = curr;
                winner = entry.getKey();
            }
        }

        System.out.printf("Best candidate is %s with total %d points.%n", winner, max);
        System.out.println("Ranking:");

        users.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().entrySet().stream()
                            .sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()))
                            .forEach(entry1 -> {
                                System.out.printf("#  %s -> %d%n", entry1.getKey(), entry1.getValue());
                            });
                });
    }
}
