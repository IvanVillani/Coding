import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        TreeMap<String, String> map = new TreeMap<>();

        while (!input.equals("END")) {
            String[] arr = input.split(" ");

            if (arr[0].equals("A")) {
                map.put(arr[1], arr[2]);
            } else if (arr[0].equals("ListAll")) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
                }
            }else {
                if (map.containsKey(arr[1])) {
                    System.out.printf("%s -> %s%n", arr[1], map.get(arr[1]));
                } else {
                    System.out.printf("Contact %s does not exist.%n", arr[1]);
                }
            }


            input = scan.nextLine();
        }
    }
}

