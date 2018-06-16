import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class MagicWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] input = reader.readLine().split("\\s+");

        Map<Character, Character> map = new LinkedHashMap<>();

        String word1 = input[0];
        String word2 = input[1];

        StringBuilder longer;
        StringBuilder shorter;

        int check = Math.max(word1.length(), word2.length());
        if (check == word1.length()) {
            longer = new StringBuilder(word1);
            shorter = new StringBuilder(word2);
        }else {
            longer = new StringBuilder(word2);
            shorter = new StringBuilder(word1);
        }


        for (int i = 0; i < longer.length(); i++) {
            if (i < shorter.length()) {
                if (map.containsKey(longer.charAt(i))) {
                    if (map.get(longer.charAt(i)) != shorter.charAt(i)) {
                        System.out.println("false");
                        return;
                    }
                }else {
                    if (map.containsValue(shorter.charAt(i))) {
                        System.out.println("false");
                        return;
                    }else {
                        map.put(longer.charAt(i), shorter.charAt(i));
                    }
                }
            }else {
                if (!map.containsKey(longer.charAt(i))) {
                    System.out.println("false");
                    return;
                }
            }
        }

        System.out.println("true");
    }
}
