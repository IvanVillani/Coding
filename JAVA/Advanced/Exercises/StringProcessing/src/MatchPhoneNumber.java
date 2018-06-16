import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();

        while (!"end".equals(input)) {
            Pattern pattern = Pattern.compile("^\\+359([ -]{1})2\\1\\d{3}\\1\\d{4}$");
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()) {
                System.out.println(input);
            }

            input = reader.readLine();

        }
    }
}
