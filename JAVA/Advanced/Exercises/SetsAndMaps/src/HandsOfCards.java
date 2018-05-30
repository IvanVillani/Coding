import java.util.*;

import static java.lang.System.in;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        Map<String, Integer> cardValues = new LinkedHashMap<>();
        cardValues.put("J", 11);
        cardValues.put("Q", 12);
        cardValues.put("K", 13);
        cardValues.put("A", 14);

        Map<String, Integer> cardsPower = new LinkedHashMap<>();
        cardsPower.put("S", 4);
        cardsPower.put("H", 3);
        cardsPower.put("D", 2);
        cardsPower.put("C", 1);

        Map<String, Set<String>> map = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if ("JOKER".equals(input)) {
                break;
            }
            String[] arr = input.split(": ");
            String player = arr[0];
            String[] cards = arr[1].split(", ");
            Set<String> set = new HashSet<>();
            Collections.addAll(set, cards);
            if (map.containsKey(player)) {
                set.addAll(map.get(player));
                map.put(player, set);
            }else {
                map.put(player, set);
            }



        }

        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            long result = 0;
            for (String str : entry.getValue()) {
                String first = str.substring(0, str.length() - 1);
                String second = str.substring(str.length() - 1);
                int card;
                try {
                    card = Integer.parseInt(first);
                }catch (NumberFormatException ex) {
                    card = cardValues.get(first);
                }
                int power = cardsPower.get(second);

                int po = card * power;
                result+= po;
            }
            System.out.printf("%s: %d%n", entry.getKey(), result);
        }
    }
}
