import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class TextEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] bannedWords = reader.readLine().split(", ");
        String text = reader.readLine();
        StringBuilder sb = new StringBuilder(text);

        for (String  banned: bannedWords) {
            StringBuilder replacer = new StringBuilder();
            for (int i = 0; i < banned.length(); i++) {
                replacer.append("*");
            }
            while (sb.indexOf(banned) > -1) {
                int start = sb.indexOf(banned);
                int end = start + banned.length();
                sb.replace(start, end, replacer.toString());
            }
        }
        System.out.println(sb.toString());
    }
}
