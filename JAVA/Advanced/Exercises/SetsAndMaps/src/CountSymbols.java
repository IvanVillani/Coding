import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        String[] input = scan.nextLine().split("");

        if ("".equals(input[0])) {
            return;
        }

        Map<String, Integer> occur = new TreeMap<>();

        for (String s : input) {
            if (!occur.containsKey(s)) {
                occur.put(s, 1);
            }else {
                occur.put(s, occur.get(s) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : occur.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }



    }
}
