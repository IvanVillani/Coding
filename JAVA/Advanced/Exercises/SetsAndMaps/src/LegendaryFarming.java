import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class LegendaryFarming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Map<String, Integer> legend = new TreeMap<>();
        Map<String, Integer> junk = new TreeMap<>();
        legend.put("shards", 0);
        legend.put("fragments", 0);
        legend.put("motes", 0);
        String type = "";
        boolean check = false;

        while (true) {
            String[] arr = reader.readLine().split(" ");

            for (int i = 1; i < arr.length; i = i + 2) {
                if ("motes".equals(arr[i].toLowerCase()) || "fragments".equals(arr[i].toLowerCase()) || "shards".equals(arr[i].toLowerCase())) {
                    int update = legend.get(arr[i].toLowerCase()) + Integer.parseInt(arr[i - 1]);
                    legend.put(arr[i].toLowerCase(), update);
                    if (update >= 250) {
                        int diff = update - 250;
                        legend.put(arr[i].toLowerCase(), diff);
                        check = true;
                        type = arr[i].toLowerCase();
                        break;
                    }
                } else {
                    if (junk.containsKey(arr[i].toLowerCase())) {
                        int update = junk.get(arr[i].toLowerCase()) + Integer.parseInt(arr[i - 1]);
                        junk.put(arr[i].toLowerCase(), update);
                    } else {
                        junk.put(arr[i].toLowerCase(), Integer.parseInt(arr[i - 1]));
                    }
                }

            }
            if (check) {
                break;
            }

        }

        if (!legend.containsKey("shards")) {
            legend.put("shards", 0);
        }else if (!legend.containsKey("fragments")) {
            legend.put("fragments", 0);
        }else if (!legend.containsKey("motes")) {
            legend.put("motes", 0);
        }

        String reward = "";
        switch (type) {
            case "motes":
                reward = "Dragonwrath";
                break;
            case "shards":
                reward = "Shadowmourne";
                break;
            case "fragments":
                reward = "Valanyr";
                break;
            default:
                break;
        }

        Map<String, Integer> sortedLegend = legend
                .entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        System.out.println(reward + " obtained!");
        for (Map.Entry<String, Integer> entry : sortedLegend.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
