import java.util.Arrays;
import java.util.Scanner;

public class MaxSeq {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int max = 1;
        int bmax = 0;
        int ind = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                max++;
            }else {
                max = 1;
            }

            if (max > bmax) {
                bmax = max;
                ind = arr[i-1];
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bmax; i++) {
            if (i == 0) {
                sb.append(ind);
            }else {
                sb.append(" ");
                sb.append(ind);
            }
        }
        System.out.println(sb.toString());


    }
}
