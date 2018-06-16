import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class MatchFullName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();

        while (!"end".equals(input)) {
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]+ [A-Z]{1}[a-z]+$");
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()) {
                System.out.println(input);
            }

            input = reader.readLine();

        }
    }
}
