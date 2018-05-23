import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        String[] arr = scan.nextLine().split("");
        ArrayDeque<String> stack = new ArrayDeque<>();
        int last = 0;
        boolean change = false;
        boolean parents = true;

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "(":
                    stack.push(")");
                    last = 0;
                    break;
                case "{":
                    stack.push("}");
                    last = 0;
                    break;
                case "[":
                    stack.push("]");
                    last = 0;
                    break;
                case " ":
                    stack.push(" ");
                    last++;
                    break;
                case ")":
                case "}":
                case "]":
                    if (last > 0 && !stack.isEmpty()) {
                        if (last % 2 == 0) {
                            for (int j = 0; j < last; j++) {
                                stack.pop();
                            }
                            last = 0;
                            i--;
                        } else {
                            parents = false;
                        }
                    }else {
                        if (!stack.isEmpty()) {
                            if (!stack.pop().equals(arr[i]) && !stack.isEmpty()) {
                                parents = false;
                            }
                        }else {
                            parents = false;
                        }
                    }
                default:
                    break;

            }
        }

        if (parents) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
//({[  ]})