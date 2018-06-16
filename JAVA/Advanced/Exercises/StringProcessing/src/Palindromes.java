import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.in;

public class Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] text = reader.readLine().split("[, .?!]+");
        Set<String> set = new TreeSet<>();

        for (String word : text) {
            if (word.length() == 1) {
                set.add(word);
            }else {
                StringBuilder first = new StringBuilder(word.substring(0, word.length() / 2));
                StringBuilder second;
                if (word.length() % 2 == 0) {
                    second = new StringBuilder(word.substring(word.length() / 2));
                }else {
                    second = new StringBuilder(word.substring(word.length() / 2 + 1));
                }
                if (first.toString().equals(second.reverse().toString())) {
                    set.add(word);
                }
            }
        }

        System.out.println(set);
    }
}
