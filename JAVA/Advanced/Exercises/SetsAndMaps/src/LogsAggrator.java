import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class LogsAggrator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(reader.readLine());

        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] arr = reader.readLine().split(" ");
            String ip = arr[0];
            String user = arr[1];
            int dur = Integer.parseInt(arr[2]);

            if (map.containsKey(user)) {
                if (map.get(user).containsKey(ip)) {
                    int curr = map.get(user).get(ip) + dur;
                    map.get(user).put(ip, curr);
                } else {
                    map.get(user).put(ip, dur);
                }
            } else {
                Map<String, Integer> ips = new LinkedHashMap<>();
                ips.put(ip, dur);
                map.put(user, ips);
            }
        }

        Map<String, Map<String, Integer>> sorted = map
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> a, LinkedHashMap::new));

        for (Map.Entry<String, Map<String, Integer>> entry1 : sorted.entrySet()) {
            Map<String, Integer> sortedIps = entry1
                    .getValue()
                    .entrySet()
                    .stream()
                    .sorted(Comparator.comparing(Map.Entry::getKey))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> a, LinkedHashMap::new));
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (Map.Entry<String, Integer> entry2 : sortedIps.entrySet()) {
                if (sum > 0) {
                    sb.append(", ");
                }
                sb.append(entry2.getKey());
                sum += entry2.getValue();
            }
            sb.append("]");
            System.out.printf("%s: %d %s%n", entry1.getKey(), sum, sb.toString());
        }
    }
}
