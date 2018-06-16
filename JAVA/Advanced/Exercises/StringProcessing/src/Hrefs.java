import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class Hrefs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String input = reader.readLine();

        StringBuilder sb = new StringBuilder();

        while (!"END".equals(input)) {
            sb.append(input).append(System.lineSeparator());
            input = reader.readLine();
        }

        String result = sb.toString();


        Pattern pattern = Pattern.compile("(<a)\\s+href[^>]+(>)\\s*.*?(<\\/a>)");
        Matcher matcher = pattern.matcher(result);

        while (matcher.find()){
            String entireGroup = matcher.group(0);
            String openTag = matcher.group(1);
            String closeOpenTag = matcher.group(2);
            String closeTag = matcher.group(3);
            String replace = entireGroup.replaceFirst(openTag,"[URL");
            replace = replace.replaceFirst(closeOpenTag,"]");
            replace = replace.replaceFirst(closeTag,"[/URL]");

            result = result.replace(entireGroup,replace);
        }
        System.out.println(result);
    }
}
