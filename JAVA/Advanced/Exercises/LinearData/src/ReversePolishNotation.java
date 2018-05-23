import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class ReversePolishNotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        String[] arr = scan.nextLine().split(" ");

        ArrayDeque<String> operands = new ArrayDeque<>();
        ArrayDeque<String> operators = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> priority = new ArrayDeque<>();

        boolean inBrackets = false;

        for (int i = 0; i < arr.length; i++) {
            String type = checkType(arr[i]);
            switch (type) {
                case "brackets":
                    inBrackets = arr[i].equals("(");
                    if (!inBrackets) {
                        if (i <= arr.length - 2) {
                            for (String operand : operands) {
                                sb.append(operands.remove());
                                sb.append(" ");
                            }
                            if (priority.peek().equals("high") || (arr[i+1].equals("*") || arr[i+1].equals("/"))){
                                int end = priority.size();
                                if (priority.peek().equals("high") && priority.size() == 1) {
                                    end++;
                                }
                                for (int j = 0; j < end; j++) {
                                    sb.append(operators.pop());
                                    sb.append(" ");
                                }
                            }else {
                                for (String operator : operators) {
                                    sb.append(operators.pop());
                                    sb.append(" ");
                                }
                            }
                        }else {
                            for (String operand : operands) {
                                sb.append(operands.remove());
                                sb.append(" ");
                            }
                            for (String operator : operators) {
                                sb.append(operators.pop());
                                sb.append(" ");
                            }
                        }
                        priority.pop();
                        if (!priority.isEmpty()) {
                            inBrackets = true;
                        }
                    }else {
                        if (i > 0) {
                            if (arr[i-1].equals("*") || arr[i-1].equals("/")) {
                                priority.push("high");
                            }else {
                                priority.push("low");
                            }
                        }else {
                            priority.push("low");

                        }
                    }
                    break;
                case "operator":
                    if (arr[i].equals("+") || arr[i].equals("-")) {
                        if (operators.isEmpty() || inBrackets) {
                            operators.push(arr[i]);
                        }else {
                            for (String operand : operands) {
                                sb.append(operands.remove());
                                sb.append(" ");
                            }
                            for (String operator : operators) {
                                sb.append(operators.pop());
                                sb.append(" ");
                            }
                            operators.push(arr[i]);
                        }
                    }else {
                        operators.push(arr[i]);
                    }
                    break;
                case "operand":
                    operands.add(arr[i]);
                    break;
                default:
                    break;
            }

            if (i == arr.length - 1 && !operands.isEmpty() && !operators.isEmpty()) {
                for (String operand : operands) {
                    sb.append(operands.remove());
                    sb.append(" ");
                }
                for (String operator : operators) {
                    sb.append(operators.pop());
                    sb.append(" ");
                }
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

    }

    private static String checkType(String s) {
        String type = "";
        if (s.equals("(") || s.equals(")")) {
            type = "brackets";
        }else if (s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) {
            type = "operator";
        }else {
            type = "operand";
        }

        return  type;
    }
}
