import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Resources {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        Map<String, Long> map = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if ("stop".equals(input)) {
                break;
            } else {
                long quan = Long.parseLong(scan.nextLine());
                if (map.containsKey(input)) {
                    map.put(input, map.get(input) + quan);
                } else {
                    map.put(input, quan);
                }
            }
        }

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
