import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.in;

public class Emails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        Map<String, String> map = new LinkedHashMap<>();

        while (true) {
            String name = scan.nextLine();
            if ("stop".equals(name)) {
                break;
            }
            String email = scan.nextLine();
            String[] arr = email.split("\\.");
            String check = arr[1].toLowerCase();

            if (!"uk".equals(check) && !"us".equals(check) && !"com".equals(check)){
                map.put(name, email);
            }
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
