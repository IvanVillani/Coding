import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        if (arr.length > 1) {
            int left = 0;
            int right = 0;
            int index = -1;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {
                    left += arr[j];
                }
                for (int j = i+1; j < arr.length; j++) {
                    right += arr[j];
                }

                if (left == right) {
                    index = i;
                    System.out.println(i);
                    break;
                }
                left = 0;
                right = 0;
            }

            if (index == -1) {
                System.out.println("no");
            }
        }else {
            System.out.println(0);
        }

    }
}
