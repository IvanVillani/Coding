import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.in;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        int n = Integer.parseInt(scan.nextLine());

        Set<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String [] arr = scan.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                set.add(arr[j]);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String s : set) {
            sb.append(s).append(" ");
        }

        String result = sb.toString().trim();

        System.out.println(result);
    }
}
