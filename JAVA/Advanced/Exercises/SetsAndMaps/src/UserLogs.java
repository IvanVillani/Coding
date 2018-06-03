import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class UserLogs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();

        while (true) {
            String input = reader.readLine();
            if ("end".equals(input)) {
                break;
            }

            String[] arr = input.split("[= ]");
            String ip = arr[1];
            String message = arr[3];
            String user = arr[5];

            if (map.containsKey(user)) {
                if (map.get(user).containsKey(ip)) {
                    int curr = map.get(user).get(ip) + 1;
                    map.get(user).put(ip, curr);
                } else {
                    map.get(user).put(ip, 1);
                }
            } else {
                Map<String, Integer> ips = new LinkedHashMap<>();
                ips.put(ip, 1);
                map.put(user, ips);
            }
        }


        Map<String, Map<String, Integer>> sorted = map
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        for (Map.Entry<String, Map<String, Integer>> entry1 : sorted.entrySet()) {
            System.out.printf("%s:%n", entry1.getKey());
            StringBuilder sb = new StringBuilder();
            int counter = 0;
            for (Map.Entry<String, Integer> entry2 : entry1.getValue().entrySet()) {
                if (counter > 0) {
                    sb.append(", ");
                }
                sb.append(entry2.getKey()).append(" => ").append(entry2.getValue());
                counter++;
            }
            sb.append(".");
            System.out.println(sb.toString());
        }

    }
}
