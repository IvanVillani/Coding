import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnicodeChars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        for (int a = 0; a < input.length(); a++) {
            String uni = String.format("\\u%04x",(int)input.charAt(a));
            System.out.print(uni);
        }
    }
}