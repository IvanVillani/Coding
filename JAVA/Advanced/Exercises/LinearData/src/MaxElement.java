import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> maxStack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String [] arr = reader.readLine().split(" ");

            if (arr[0].equals("1") && arr.length == 2) {
                stack.push(Integer.parseInt(arr[1]));
                if (Integer.parseInt(arr[1]) > max) {
                    maxStack.push(Integer.parseInt(arr[1]));
                    max = Integer.parseInt(arr[1]);
                }
            }else if (arr[0].equals("2") && arr.length == 1) {
                int poped = stack.pop();
                if (poped == max) {
                    maxStack.pop();
                    if (maxStack.size() > 0 ) {
                        max = maxStack.peek();
                    }else {
                        max = Integer.MIN_VALUE;
                    }
                }
            }else if (arr[0].equals("3") && arr.length == 1) {
                sb.append(maxStack.peek()).append(System.lineSeparator());
            }
        }
        System.out.print(sb);
    }
}
