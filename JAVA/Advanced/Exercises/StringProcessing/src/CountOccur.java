import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class CountOccur {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String text = reader.readLine().toLowerCase();
        String find = reader.readLine().toLowerCase();

        int count = 0;

        StringBuilder sb = new StringBuilder(text);
        while(sb.indexOf(find) > -1) {
            count++;
            int index = sb.indexOf(find);
            sb.delete(0, index + 1);
        }

        System.out.println(count);

    }
}
