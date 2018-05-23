import java.util.Scanner;

import static java.lang.System.in;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        int n = Integer.parseInt(scan.nextLine());

        long[] arr = new long[51];
        arr[0] = 1;
        arr[1] = 1;

        long result = getFibonacci(n, arr);

        System.out.println(result);
    }

    private static long getFibonacci(int n, long[] arr) {
        long result = 1;
        if (n > 1) {
            if (arr[n] > 0) {
                result = arr[n];
            }else {
                result = getFibonacci(n-1, arr) + getFibonacci(n-2, arr);
                arr[n] = result;
            }
        }
        return result;
    }
}
