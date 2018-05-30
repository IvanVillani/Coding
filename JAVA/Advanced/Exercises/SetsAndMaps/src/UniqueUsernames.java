import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        int n = Integer.parseInt(scan.nextLine());

        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(scan.nextLine());
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
