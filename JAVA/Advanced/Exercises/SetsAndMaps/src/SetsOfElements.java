import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        String[] strr = scan.nextLine().split(" ");

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        int firstl = Integer.parseInt(strr[0]);
        int secondl = Integer.parseInt(strr[1]);

        for (int i = 0; i < firstl; i++) {
            set1.add(Integer.parseInt(scan.nextLine()));
        }

        for (int i = 0; i < secondl; i++) {
            set2.add(Integer.parseInt(scan.nextLine()));
        }

        StringBuilder sb = new StringBuilder();

        for (Integer i: set1) {
            if (set2.contains(i)){
                sb.append(i);
                sb.append(" ");
            }
        }

        String result = sb.toString();
        result = result.trim();

        System.out.println(result);
    }
}
