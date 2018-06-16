import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.load;

public class SumBigNumbs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String str1 = reader.readLine();
        String str2 = reader.readLine();

        StringBuilder longer;
        StringBuilder shorter;

        int check = Math.max(str1.length(), str2.length());
        if (check == str1.length()) {
            longer = new StringBuilder(str1);
            shorter = new StringBuilder(str2);
        }else {
            longer = new StringBuilder(str2);
            shorter = new StringBuilder(str1);
        }

        longer.reverse();
        shorter.reverse();

        int remain = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < longer.length(); i++) {
            if (Character.getNumericValue(longer.charAt(i)) == 0) {
                Pattern pattern = Pattern.compile("^0+$");
                Matcher matcher = pattern.matcher(longer.substring(i));
                if (matcher.find()) {
                    break;
                }
            }

            int sum;
            if (i < shorter.length()) {
                sum = Character.getNumericValue(longer.charAt(i)) + Character.getNumericValue(shorter.charAt(i)) + remain;
            }else {
                sum = Character.getNumericValue(longer.charAt(i)) + remain;
            }

            if (sum >= 10) {
                result.append(sum - 10);
                remain = 1;
            }else {
                result.append(sum);
                remain = 0;
            }
        }
        if (remain == 1) {
            result.append(1);
        }

        System.out.println(result.reverse().toString());
    }
}
