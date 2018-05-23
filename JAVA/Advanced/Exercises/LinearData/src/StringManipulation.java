import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> stack1 = new ArrayDeque<>();
        ArrayDeque<String> stack2 = new ArrayDeque<>();

        String str = "";

        ArrayDeque<Integer> last = new ArrayDeque<>();

        int check = 0;

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");

            switch (input[0]) {
                case "1":
                    str = case1(str, input[1]);
                    stack1.push(input[1]);
                    last.push(1);
                    break;
                case "2":
                    str = case2(str, Integer.parseInt(input[1]), stack2);
                    last.push(2);
                    break;
                case "3":
                    case3(str, Integer.parseInt(input[1]) - 1);
                    break;
                case "4":
                    if (last.peek() == 1) {
                        check = 1;
                        str = case4(str, check, stack1);
                        last.pop();
                    }else if (last.peek() == 2){
                        check = 2;
                        str = case4(str, check, stack2);
                        last.pop();
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private static String case4(String str, int check, ArrayDeque<String> stack) {
        if (check == 1) {
            str = str.replace(stack.pop(), "");
        }else {
            StringBuilder sb = new StringBuilder(str);
            sb.append(stack.pop());
            str = sb.toString();
        }
        return str;
    }

    private static void case3(String str, int index) {
        System.out.println(str.charAt(index));
    }

    private static String case2(String str, int minus, ArrayDeque<String> stack2) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < minus; i++) {
            temp.append(sb.charAt(sb.length() - 1));
            sb.deleteCharAt(sb.length() - 1);
        }
        stack2.push(temp.reverse().toString());
        return sb.toString();
    }

    private static String case1(String str, String plus) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(plus);
        return sb.toString();
    }
}
