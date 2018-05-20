import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        while (!input.equals("END")) {
            String[] arr = input.split(" ");

            if (arr[0].equals("A")) {
                map.put(arr[1], arr[2]);
            }else {
                if (map.containsKey(arr[1])) {
                    System.out.printf("%s -> %s%n", arr[1], map.get(arr[1]));
                }else {
                    System.out.printf("Contact %s does not exist.%n", arr[1]);
                }
            }


            input = scan.nextLine();
        }
    }
}
