import java.util.*;

import static java.lang.System.in;

public class Poison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        int n = Integer.parseInt(scan.nextLine());

        String[] arr = scan.nextLine().split(" ");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> temp = new ArrayDeque<>();

        for (String s : arr) {
            queue.add(Integer.parseInt(s));
        }

        int before = 0;
        int days = 0;

        for (;;) {
            boolean check = true;
            while (queue.size() > 0) {
                if (temp.size() == 0 && queue.size() > 0) {
                    before = queue.peek();
                    temp.add(queue.remove());
                }else {
                    if (queue.peek() > before) {
                        before = queue.peek();
                        queue.remove();
                        check = false;
                    }else {
                        before = queue.peek();
                        temp.add(queue.remove());
                    }
                }
            }

            if (check) {
                break;
            }else {
                days++;
            }

            for (Integer t : temp) {
                queue.add(temp.remove());
            }

        }

        System.out.println(days);
    }
}
