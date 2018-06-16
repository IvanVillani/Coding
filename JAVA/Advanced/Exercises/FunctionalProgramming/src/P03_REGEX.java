import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class P03_REGEX {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();

        Map<String, Integer> map = new LinkedHashMap<>();

        while (!"Stop!".equals(input)) {
            Pattern pattern = Pattern.compile("([a-z@!#$?]+)=([0-9]+)--([0-9]+)<<([a-z]+)");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String[] arr = matcher.group(1).split("[@!?#$]");
                StringBuilder sb = new StringBuilder();
                for (String s : arr) {
                    if (!"".equals(s)) {
                        sb.append(s);
                    }
                }
                if (sb.length() == Integer.parseInt(matcher.group(2))) {
                    if (map.containsKey(matcher.group(4))) {
                        map.put(matcher.group(4), map.get(matcher.group(4)) + Integer.parseInt(matcher.group(3)));
                    }else {
                        map.put(matcher.group(4), Integer.parseInt(matcher.group(3)));
                    }
                }
            }
            input = reader.readLine();
        }

        map.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                .forEach(entry -> {
                    System.out.printf("%s has genome size of %d%n", entry.getKey(), entry.getValue());
                });
    }
}
