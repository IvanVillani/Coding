import java.util.*;

public class MostFreq {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        int max = 0;
        int numb = 0;

        for (int i = 0; i < arr.length; i++) {
            int current = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    current++;
                }
            }
            if (current > max) {
                max = current;
                numb = arr[i];
            }
        }

        System.out.println(numb);


    }
}
