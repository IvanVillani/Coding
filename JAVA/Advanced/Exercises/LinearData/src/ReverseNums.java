import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] input = scan.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            stack.push(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < input.length; i++) {
            if (i == 0) {
                System.out.print(stack.pop());
            }else {
                System.out.print(" " + stack.pop());
            }

        }
        System.out.println();
    }
}
