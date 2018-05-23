import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class Queue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        String[] input = scan.nextLine().split(" ");

        int add = Integer.parseInt(input[0]);

        ArrayDeque<Integer> queue = new ArrayDeque<>(add);

        String[] arr = scan.nextLine().split(" ");

        for (int i = 0; i < add; i++) {
            queue.add(Integer.parseInt(arr[i]));
        }

        int remove = Integer.parseInt(input[1]);

        for (int i = 0; i < remove; i++) {
            queue.remove();
        }

        if (queue.contains(Integer.parseInt(input[2]))){
            System.out.println("true");
        }else {
            int min = Integer.MAX_VALUE;
            for (Integer qq : queue) {
                if (qq < min) {
                    min = qq;
                }
            }
            if (min == Integer.MAX_VALUE) {
                min = 0;
            }
            System.out.println(min);
        }

    }
}
