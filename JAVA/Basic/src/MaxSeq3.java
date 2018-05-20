import java.util.Arrays;
import java.util.Scanner;

public class MaxSeq3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int max = 1;
        int bmax = 0;
        int ind = 0;
        int ind2 = 0;
        int start = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                max++;

            } else {
                max = 1;
                start = i;
            }

            if (max > bmax) {
                bmax = max;
                ind = i;
                ind2 = start;
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = ind2; i <= ind; i++) {
            if (i == ind2) {
                sb.append(arr[i]);
            } else {
                sb.append(" ");
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
