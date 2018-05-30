import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        Map<String, String> map = new HashMap<>();

        while(true) {
            String input = scan.nextLine();

            if ("search".equals(input)) {
                while(true) {
                    String search = scan.nextLine();

                    if ("stop".equals(search)) {
                        input = "stop";
                        break;
                    }

                    if (map.containsKey(search)) {
                        System.out.printf("%s -> %s%n", search, map.get(search));
                    }else {
                        System.out.printf("Contact %s does not exist.%n", search);
                    }
                }
            }

            if ("stop".equals(input)) {
                break;
            }

            String[] arr = input.split("-");

            map.put(arr[0], arr[1]);

        }
    }
}
