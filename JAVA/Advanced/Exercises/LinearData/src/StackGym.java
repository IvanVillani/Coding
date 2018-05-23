import java.util.ArrayDeque;
import java.util.Scanner;

public class StackGym {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int push = Integer.parseInt(input[0]);

        int pop = Integer.parseInt(input[1]);

        int find = Integer.parseInt(input[2]);

        String[] arr = scan.nextLine().split(" ");

        for (int i = 0; i < push; i++) {
            stack.push(Integer.parseInt(arr[i]));
        }

        for (int i = 0; i < pop; i++) {
            stack.pop();
        }

        boolean check = false;

        for (Integer ele : stack) {
            if (ele == find) {
                check = true;
            }
        }

        if (check) {
            System.out.println("true");
        }else {
            int min = Integer.MAX_VALUE;
            for (Integer element : stack) {
                if (element < min) {
                    min = element;
                }
            }
            if (min == Integer.MAX_VALUE) {
                min = 0;
            }
            System.out.println(min);

        }
    }
}
