import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.MalformedParametersException;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class PopulationCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Map<String, Map<String, Long>> map = new LinkedHashMap<>();

        while(true) {
            String input = reader.readLine();
            if ("report".equals(input)) {
                break;
            }

            String[] arr = input.split("\\|");

            String city = arr[0];
            String country = arr[1];
            long popul = Long.parseLong(arr[2]);

            if (map.containsKey(country)) {
                if (map.get(country).containsKey(city)) {
                    long curr = map.get(country).get(city) + popul;
                    map.get(country).put(city, curr);
                } else {
                    map.get(country).put(city, popul);
                }
            } else {
                Map<String, Long> cities = new LinkedHashMap<>();
                cities.put(city, popul);
                map.put(country, cities);
            }

        }

        Map<String, Map<String, Long>> sorted = map
                .entrySet()
                .stream()
                .sorted((a,b) -> {
                    long firstCountryPopul = a
                            .getValue()
                            .values()
                            .stream()
                            .mapToLong(Long::longValue)
                            .sum();

                    long secondCountryPopul = b
                            .getValue()
                            .values()
                            .stream()
                            .mapToLong(Long::longValue)
                            .sum();

                    return Long.compare(secondCountryPopul, firstCountryPopul);
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> a, LinkedHashMap::new));

        for (Map.Entry<String, Map<String, Long>> entry1 : sorted.entrySet()) {
            Map<String, Long> sortedCities = entry1
                    .getValue()
                    .entrySet()
                    .stream()
                    .sorted((a,b) -> Long.compare(b.getValue(), a.getValue()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> a, LinkedHashMap::new));
            long finalPopul = 0;
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Long> entry2 : sortedCities.entrySet()) {
                sb.append("=>").append(entry2.getKey()).append(": ").append(entry2.getValue()).append("\n");
                finalPopul+=entry2.getValue();
            }
            System.out.printf("%s (total population: %d)%n", entry1.getKey(), finalPopul);
            System.out.print(sb.toString());
        }
    }
}
